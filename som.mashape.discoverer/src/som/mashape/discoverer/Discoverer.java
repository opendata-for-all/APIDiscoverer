package som.mashape.discoverer;

import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import core.APIOperation;
import core.APIParameter;
import core.Api;
import core.CoreFactory;
import core.CorePackage;
import core.Info;
import core.JsonDataType;
import core.ParameterLocation;
import core.Path;
import core.Response;
import core.Schema;
import core.Tag;
import jsondiscoverer.JsonAdvancedDiscoverer;
import jsondiscoverer.JsonSimpleDiscoverer;
import jsondiscoverer.JsonSource;
import jsondiscoverer.JsonSourceSet;
import som.mashape.discoverer.model.APIRequest;
import som.mashape.discoverer.model.Parameter;

public class Discoverer {
	CoreFactory factory;
	private Api api;
	private Api apiAdvenced;
	private List<EPackage> dataModelList = new ArrayList<EPackage>();
	private Map<String, Path> pathsMap = new HashMap<String, Path>();
	private Map<String, APIParameter> parametersMap = new HashMap<String, APIParameter>();
	private Map<String, Schema> schemaMap = new HashMap<String, Schema>();
	private Map<String, Response> responsesMap = new HashMap<String, Response>();
	JsonSourceSet sourceSet = new JsonSourceSet("dataModel");

	public Discoverer() {
		// Initialize the model
		CorePackage.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		factory = CoreFactory.eINSTANCE;
		api = factory.createApi();
	}

	public Discoverer(String title, String description) {
		this();
		Info info = factory.createInfo();
		info.setTitle(title);
		info.setDescription(description);
	}

	public void discover(APIRequest apiResquest) throws MalformedURLException, URISyntaxException {
		discoverBasicInfo(apiResquest);

		// discoverSchema(apiResquest);
	}

	private void discoverBasicInfo(APIRequest apiResquest) throws URISyntaxException {
		if (api.getHost() == null)
			api.setHost(apiResquest.getHost());
		if (api.getSwagger() == null)
			api.setSwagger("2.0");
		if (api.getBasePath() == null) {
			api.setBasePath(apiResquest.getBasePath());
		}
		if (api.getInfo() == null) {
			Info info = factory.createInfo();
			info.setTitle(api.getHost());
			info.setVersion("0.0");
			api.setInfo(info);
		}
		discoverPaths(apiResquest);
	}

	private void discoverPaths(APIRequest apiResquest) throws URISyntaxException {
		Path path = pathsMap.get(apiResquest.getOpenAPIPath());
		if (path == null) {
			path = factory.createPath();
			path.setPattern(apiResquest.getOpenAPIPath());
			api.getPaths().add(path);
			pathsMap.put(path.getPattern(), path);
		}
		discoverOperations(path, apiResquest);

	}

	private void discoverOperations(Path path, APIRequest apiResquest) throws URISyntaxException {
		switch (apiResquest.getHttpMethod()) {
		case GET:
			APIOperation getOperation = path.getGet();
			if (getOperation == null) {
				getOperation = factory.createAPIOperation();
				getOperation.setDescription(apiResquest.getDesccription());
				getOperation.setOperationId(apiResquest.getOperationId());
				if (apiResquest.getResponse() != null && apiResquest.getResponse().getMediaType() != null
						&& apiResquest.getResponse().getMediaType().equals("JSON"))
					getOperation.getProduces().add("application/json");
				path.setGet(getOperation);
			}
			discoverPrameters(getOperation, apiResquest);
			try {
				 discoverResponses(getOperation, apiResquest);
			} catch (Exception e) {

			}

			break;
		case POST:
			APIOperation postOperation = path.getPost();
			
			if (postOperation == null) {
				postOperation = factory.createAPIOperation();
				postOperation.setDescription(apiResquest.getDesccription());
				postOperation.setOperationId(apiResquest.getOperationId());
				postOperation.getConsumes().add("application/json");
				if (apiResquest.getResponse() != null && apiResquest.getResponse().getMediaType() != null
						&& apiResquest.getResponse().getMediaType().equals("JSON"))
					postOperation.getProduces().add("application/json");
				path.setPost(postOperation);
			}
			discoverPrameters(postOperation, apiResquest);
			try {
				 discoverResponses(postOperation, apiResquest);
			} catch (Exception e) {

			}

			break;
		case PUT:
			APIOperation putOperation = path.getPut();
			if (putOperation == null) {
				putOperation = factory.createAPIOperation();
				putOperation.setDescription(apiResquest.getDesccription());
				putOperation.setOperationId(apiResquest.getOperationId());
				if (apiResquest.getResponse() != null && apiResquest.getResponse().getMediaType() != null
						&& apiResquest.getResponse().getMediaType().equals("JSON"))
					putOperation.getConsumes().add("application/json");
				putOperation.getProduces().add("application/json");
				path.setPut(putOperation);
			}
			discoverPrameters(putOperation, apiResquest);
			try {
				 discoverResponses(putOperation, apiResquest);
			} catch (Exception e) {

			}

			break;
		case DELETE:
			APIOperation deleteOperation = path.getDelete();
			if (deleteOperation == null) {
			
				deleteOperation = factory.createAPIOperation();
				deleteOperation.setDescription(apiResquest.getDesccription());
				deleteOperation.setOperationId(apiResquest.getOperationId());
				if (apiResquest.getResponse() != null && apiResquest.getResponse().getMediaType() != null
						&& apiResquest.getResponse().getMediaType().equals("JSON"))
					deleteOperation.getProduces().add("application/json");
				path.setDelete(deleteOperation);
			}
			discoverPrameters(deleteOperation, apiResquest);
			try {
				 discoverResponses(deleteOperation, apiResquest);
			} catch (Exception e) {

			}

			break;
		default:
			break;
		}

	}

	private void discoverPrameters(APIOperation apiOperation, APIRequest apiResquest) throws URISyntaxException {
		for (Parameter parameter : apiResquest.getParameters()) {
			String parameterKey = apiResquest.getOpenAPIPath() + apiResquest.getHttpMethod() + parameter.getName()
					+ parameter.getLocation();
			APIParameter apiParameter = parametersMap.get(parameterKey);
			if (apiParameter == null) {
				apiParameter = factory.createAPIParameter();
				apiParameter.setIn(transformParameter(parameter.getLocation()));
				apiParameter.setName(parameter.getName());
				apiParameter.setDescription(parameter.getDescription());
				if (parameter.isRequired())
					apiParameter.setRequired(true);
				if (parameter.getType().equalsIgnoreCase("STRING"))
					apiParameter.setType(JsonDataType.STRING);
				else
				if (parameter.getType().equalsIgnoreCase("NUMBER"))
					apiParameter.setType(JsonDataType.DOUBLE);
				else
				if (parameter.getType().equalsIgnoreCase("BOOLEAN"))
					apiParameter.setType(JsonDataType.BOOLEAN);
				else 
					apiParameter.setType(JsonDataType.STRING);
				apiOperation.getParameters().add(apiParameter);
				parametersMap.put(parameterKey, apiParameter);

			}

		}

		if (apiResquest.getBody() != null && !apiResquest.getBody().equals("")) {
			String parameterKey = apiResquest.getOpenAPIPath() + apiResquest.getHttpMethod() + "body"
					+ ParameterLocation.BODY;
			APIParameter apiParameter = parametersMap.get(parameterKey);
			if (apiParameter == null) {
				apiParameter = factory.createAPIParameter();
				apiParameter.setIn(ParameterLocation.BODY);
				apiParameter.setName("body");
				apiOperation.getParameters().add(apiParameter);
				parametersMap.put(parameterKey, apiParameter);
				String body = apiResquest.getBody();
				JsonParser parser = new JsonParser();
				JsonElement jsonSchemaInstance = parser.parse(body);
				if (jsonSchemaInstance.isJsonArray()) {
					Schema schemaArray = schemaMap.get(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
							+ apiResquest.getSchemaName().substring(1) + "List");
					Schema schema = schemaMap.get(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
							+ apiResquest.getSchemaName().substring(1));

					if (schemaArray == null) {

						schemaArray = factory.createSchema();
						schemaArray.setType(JsonDataType.ARRAY);
						schemaArray.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
								+ apiResquest.getSchemaName().substring(1) + "List");
						schemaMap.put(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
								+ apiResquest.getSchemaName().substring(1) + "List", schemaArray);
						if (schema == null) {
							schema = factory.createSchema();
							schema.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
									+ apiResquest.getSchemaName().substring(1));
							schema.setType(JsonDataType.OBJECT);
							schemaMap.put(schema.getName(), schema);

							api.getDefinitions().add(schema);
							discoverSchema(schemaArray.getName(),
									jsonSchemaInstance.getAsJsonArray().get(0).getAsString());
							schemaMap.put(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
									+ apiResquest.getSchemaName().substring(1), schema);

						}
						schemaArray.setItems(schema);
						api.getPrimitiveDefinitions().add(schemaArray);
						schemaMap.put(schemaArray.getName(), schema);
						apiParameter.setSchema(schemaArray);
					} else {
						apiParameter.setSchema(schemaArray);

					}

				} else {
					Schema schema = schemaMap.get(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
							+ apiResquest.getSchemaName().substring(1));
					if (schema == null) {
						schema = factory.createSchema();
						schema.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
								+ apiResquest.getSchemaName().substring(1));
						schema.setType(JsonDataType.OBJECT);
						schemaMap.put(schema.getName(), schema);

						api.getDefinitions().add(schema);
						discoverSchema(schema.getName(), body);

					}
					apiParameter.setSchema(schema);
				}

			}

		}

	}

	private ParameterLocation transformParameter(som.mashape.discoverer.model.ParameterLocation parameterLocation) {
		switch (parameterLocation) {
		case PATH:
			return ParameterLocation.PATH;

		case QUERY:
			return ParameterLocation.QUERY;

		default:
			break;
		}
		return null;
	}

	private void discoverResponses(APIOperation operation, APIRequest apiResquest) throws URISyntaxException {
		String responseKey = apiResquest.getOpenAPIPath() + apiResquest.getHttpMethod()
				+ apiResquest.getResponse().getStatus() + ParameterLocation.BODY;
		Response response = responsesMap.get(responseKey);
		if (response == null) {
			response = factory.createResponse();
			response.setCode(String.valueOf(apiResquest.getResponse().getStatus()));
			response.setDescription(apiResquest.getResponse().getStatusText());
			responsesMap.put(responseKey, response);
			if (apiResquest.getResponse().getStatus() == 200) {
				if (apiResquest.getResponse().getBody() != null) {
					JsonParser parser = new JsonParser();
					JsonElement jsonSchemaInstance = parser.parse(apiResquest.getResponse().getBody());
					if (jsonSchemaInstance.isJsonArray()) {
						Schema schemaArray = schemaMap.get(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
								+ apiResquest.getSchemaName().substring(1) + "List");
						Schema schema = schemaMap.get(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
								+ apiResquest.getSchemaName().substring(1));

						if (schemaArray == null) {

							schemaArray = factory.createSchema();
							schemaArray.setType(JsonDataType.ARRAY);
							schemaArray.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
									+ apiResquest.getSchemaName().substring(1) + "List");
							schemaMap.put(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
									+ apiResquest.getSchemaName().substring(1) + "List", schemaArray);
							if (schema == null) {
								schema = factory.createSchema();
								schema.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
										+ apiResquest.getSchemaName().substring(1));
								schema.setType(JsonDataType.OBJECT);
								schemaMap.put(schema.getName(), schema);

								api.getDefinitions().add(schema);
								discoverSchema(schema.getName(), jsonSchemaInstance.getAsJsonArray().get(0).toString());
								schemaMap.put(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
										+ apiResquest.getSchemaName().substring(1), schema);

							}
							schemaArray.setItems(schema);
							api.getPrimitiveDefinitions().add(schemaArray);
							schemaMap.put(schemaArray.getName(), schemaArray);
							response.setSchema(schemaArray);
						} else {
							response.setSchema(schemaArray);

						}

					} else {
						Schema schema = schemaMap.get(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
								+ apiResquest.getSchemaName().substring(1));
						if (schema == null) {
							schema = factory.createSchema();
							schema.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
									+ apiResquest.getSchemaName().substring(1));
							schema.setType(JsonDataType.OBJECT);
							schemaMap.put(schema.getName(), schema);
							api.getDefinitions().add(schema);
							discoverSchema(schema.getName(), apiResquest.getResponse().getBody());

						}
						response.setSchema(schema);
					}
				}
			} else {
				Schema schema = schemaMap.get(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
						+ apiResquest.getSchemaName().substring(1) + "_" + apiResquest.getResponse().getStatus());
				if (schema == null) {
					schema = factory.createSchema();
					schema.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
							+ apiResquest.getSchemaName().substring(1) + "_" + apiResquest.getResponse().getStatus());
					schema.setType(JsonDataType.OBJECT);
					schemaMap.put(schema.getName(), schema);

					api.getDefinitions().add(schema);
					discoverSchema(schema.getName(), apiResquest.getResponse().getBody());

				}
				response.setSchema(schema);
			}
		}
		operation.getResponses().add(response);

	}

	private void discoverSchema(String name, String value) {

		JsonSource source = new JsonSource(name);
		source.addJsonData(null, new StringReader(value));
		sourceSet.addJsonSource(source);
		//
		// JsonAdvancedDiscoverer composer = new
		// JsonAdvancedDiscoverer(sourceSet);
		JsonSimpleDiscoverer schemaDiscoverer = new JsonSimpleDiscoverer();
		dataModelList.add(schemaDiscoverer.discover(source));
		merge();

	}

	public void merge() {
		Map<EClass, Schema> map = new HashMap<EClass, Schema>();
		for (EPackage dataModel : dataModelList) {
			for (EObject object : dataModel.getEClassifiers()) {
				if (object instanceof EClass) {
					EClass eClass = (EClass) object;

					Schema schema = schemaMap.get(eClass.getName());
					if (schema == null) {
						schema = factory.createSchema();
						schema.setName(eClass.getName());
						schema.setType(JsonDataType.OBJECT);
						api.getDefinitions().add(schema);
						schemaMap.put(eClass.getName(), schema);
					}
					map.put(eClass, schema);

					for (EAttribute eAttribute : eClass.getEAttributes()) {
						if (eAttribute.getUpperBound() == 1) {
							Schema property = factory.createSchema();
							property.setType(getJsonTypeFromECoreType(eAttribute.getEAttributeType()));
							property.setName(eAttribute.getName());
							api.getPrimitiveDefinitions().add(property);
							schema.getProperties().add(property);
						} else {
							Schema arrayProperty = factory.createSchema();
							arrayProperty.setName(eAttribute.getName());
							arrayProperty.setType(JsonDataType.ARRAY);
							Schema items = factory.createSchema();
							items.setType(getJsonTypeFromECoreType(eAttribute.getEAttributeType()));
							arrayProperty.setItems(items);
							api.getPrimitiveDefinitions().add(arrayProperty);
							schema.getProperties().add(arrayProperty);
						}
					}

				}

			}
			// resolving references
			for (EObject object : dataModel.getEClassifiers()) {
				if (object instanceof EClass) {
					EClass eClass = (EClass) object;
					Schema schema = map.get(eClass);
					for (EReference eReference : eClass.getEReferences()) {
						if (eReference.getUpperBound() == 1) {
							Schema ref = factory.createSchema();
							ref.setType(JsonDataType.OBJECT);
							ref.setName(eReference.getName());
							api.getPrimitiveDefinitions().add(ref);
							Schema property = map.get((EClass) eReference.getEType());
							ref.setRefResolved(property);
							schema.getProperties().add(ref);
						} else {
							Schema arrayProperty = factory.createSchema();
							arrayProperty.setType(JsonDataType.ARRAY);
							arrayProperty.setName(eReference.getName());
							api.getPrimitiveDefinitions().add(arrayProperty);
							Schema items = map.get((EClass) eReference.getEType());
							System.out.println(items.getName());
							arrayProperty.setItems(items);
							schema.getProperties().add(arrayProperty);
						}

					}
				}

			}
		}

	}

	private JsonDataType getJsonTypeFromECoreType(EClassifier eType) {
		if (eType.getName().equals("EString"))
			return JsonDataType.STRING;
		if (eType.getName().equals("EInt"))
			return JsonDataType.INTEGER;
		return JsonDataType.STRING;
	}

	private static JsonDataType getJsonTypeFromECoreType(EDataType eAttributeType) {
		if (eAttributeType.getName().equals("EString"))
			return JsonDataType.STRING;
		if (eAttributeType.getName().equals("EInt"))
			return JsonDataType.INTEGER;
		return JsonDataType.STRING;
	}

	

	
	public JsonDataType getIdTypeFromSchema(Schema schema) {
		for (Schema property : schema.getProperties())
			if (property.getName().equals("id"))
				return property.getType();
		return JsonDataType.STRING;
	}


	private Schema getSchemaFromPath(Api api, String resource) {
		for (Schema schema : api.getDefinitions()) {
			if (schema.getName().equalsIgnoreCase(resource))
				return schema;
		}
		return null;
	}

	public Api getApi() {
		return api;
	}

	public void setApi(Api api) {
		this.api = api;
	}

	public Api getApiAdvenced() {
		return apiAdvenced;
	}

	public void setApiAdvenced(Api apiAdvenced) {
		this.apiAdvenced = apiAdvenced;
	}

}
