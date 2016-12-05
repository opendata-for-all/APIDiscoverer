package som.apidiscoverer;

import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import core.Root;
import core.API;
import core.CollectionFormat;
import core.CoreFactory;
import core.CorePackage;
import core.Info;
import core.ItemsDefinition;
import core.JSONDataType;
import core.Operation;
import core.ParameterLocation;
import core.Path;
import core.Response;
import core.Schema;
import core.SchemeType;
import jsondiscoverer.JsonSimpleDiscoverer;
import jsondiscoverer.JsonSource;
import jsondiscoverer.JsonSourceSet;
import som.apidiscoverer.model.APIRequest;
import som.apidiscoverer.model.Parameter;

public class Discoverer {
	CoreFactory factory;
	private Root apiRoot;
	private API api;
	private List<EPackage> dataModelList = new ArrayList<EPackage>();
	private Map<String, Path> pathsMap = new HashMap<String, Path>();
	private Map<String, core.Parameter> parametersMap = new HashMap<String, core.Parameter>();
	private Map<String, Schema> schemaMap = new HashMap<String, Schema>();
	private Map<String, Response> responsesMap = new HashMap<String, Response>();
	JsonSourceSet sourceSet = new JsonSourceSet("dataModel");

	public Discoverer() {
		// Initialize the model
		CorePackage.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		factory = CoreFactory.eINSTANCE;
		apiRoot = factory.createRoot();
		
		api = factory.createAPI();
		apiRoot.setApi(api);
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
		if (!api.getSchemes().contains(apiResquest.getProtocol())) {
			if (apiResquest.getProtocol().equalsIgnoreCase("http"))
				api.getSchemes().add(SchemeType.HTTP);
			else if (apiResquest.getProtocol().equalsIgnoreCase("https"))
				api.getSchemes().add(SchemeType.HTTPS);
			else if (apiResquest.getProtocol().equalsIgnoreCase("ws"))
				api.getSchemes().add(SchemeType.WS);
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
			Operation getOperation = path.getGet();
			if (getOperation == null) {
				getOperation = factory.createOperation();
				if(!(apiResquest.getResponse().getBody().equals("")))
				getOperation.getProduces().add("application/json");
				if(!apiResquest.getBody().equals(""))
					getOperation.getConsumes().add("application/json");
				path.setGet(getOperation);
			}
			discoverPrameters(getOperation, apiResquest);
			discoverResponses(getOperation, apiResquest);

			break;
		case POST:
			Operation postOperation = path.getPost();
			if (postOperation == null) {
				postOperation = factory.createOperation();
				if(!apiResquest.getBody().equals(""))
				postOperation.getConsumes().add("application/json");
				if(!(apiResquest.getResponse().getBody().equals("")))
				postOperation.getProduces().add("application/json");
				path.setPost(postOperation);
			}
			discoverPrameters(postOperation, apiResquest);
			discoverResponses(postOperation, apiResquest);

			break;
		case PUT:
			Operation putOperation = path.getPut();
			if (putOperation == null) {
				putOperation = factory.createOperation();
				if(!apiResquest.getBody().equals(""))
				putOperation.getConsumes().add("application/json");
				if(!(apiResquest.getResponse().getBody().equals("")))
				putOperation.getProduces().add("application/json");
				path.setPut(putOperation);
			}
			discoverPrameters(putOperation, apiResquest);
			discoverResponses(putOperation, apiResquest);

			break;
		case DELETE:
			Operation deleteOperation = path.getDelete();
			if (deleteOperation == null) {
				deleteOperation = factory.createOperation();
				if(!(apiResquest.getResponse().getBody().equals("")))
				deleteOperation.getProduces().add("application/json");
				if(!apiResquest.getBody().equals(""))
					deleteOperation.getConsumes().add("application/json");
				path.setDelete(deleteOperation);
			}
			discoverPrameters(deleteOperation, apiResquest);
			discoverResponses(deleteOperation, apiResquest);

			break;
		default:
			break;
		}

	}

	private void discoverPrameters(Operation apiOperation, APIRequest apiResquest) throws URISyntaxException {
		for (Parameter parameter : apiResquest.getQueryParameters()) {
			String parameterKey = apiResquest.getOpenAPIPath() + apiResquest.getHttpMethod() + parameter.getName()
					+ ParameterLocation.QUERY;
			core.Parameter apiParameter = parametersMap.get(parameterKey);
			if (apiParameter == null) {
				apiParameter = factory.createParameter();
				apiParameter.setLocation(ParameterLocation.QUERY);
				apiParameter.setName(parameter.getName());
				apiParameter.setType(parameter.getType());
				apiParameter.setDeclaringContext(apiOperation);
				apiRoot.getParamters().add(apiParameter);
				apiOperation.getParameters().add(apiParameter);
				parametersMap.put(parameterKey, apiParameter);
			}
			else {
				apiParameter.setType(JSONDataType.ARRAY);
				ItemsDefinition items = factory.createItemsDefinition();
				items.setType(parameter.getType());
				apiParameter.setItems(items);
				apiParameter.setCollectionFormat(CollectionFormat.MULTI);
			}

		}
		for (Parameter parameter : apiResquest.getPathParameters()) {
			String parameterKey = apiResquest.getOpenAPIPath() + apiResquest.getHttpMethod() + parameter.getName()
					+ ParameterLocation.PATH;
			core.Parameter apiParameter = parametersMap.get(parameterKey);
			if (apiParameter == null) {
				apiParameter = factory.createParameter();
				apiParameter.setLocation(ParameterLocation.PATH);
				apiParameter.setName(parameter.getName());
				apiParameter.setType(parameter.getType());
				apiParameter.setRequired(true);
				apiOperation.getParameters().add(apiParameter);
				apiParameter.setDeclaringContext(apiOperation);
				apiRoot.getParamters().add(apiParameter);
				parametersMap.put(parameterKey, apiParameter);
			}

		}
		if (!apiResquest.getBody().equals("")) {
			String parameterKey = apiResquest.getOpenAPIPath() + apiResquest.getHttpMethod() + "body"
					+ ParameterLocation.BODY;
			core.Parameter apiParameter = parametersMap.get(parameterKey);
			if (apiParameter == null) {
				apiParameter = factory.createParameter();
				apiParameter.setLocation(ParameterLocation.BODY);
				apiParameter.setName("body");
				apiOperation.getParameters().add(apiParameter);
				apiParameter.setDeclaringContext(apiOperation);
				apiRoot.getParamters().add(apiParameter);
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
						schemaArray.setType(JSONDataType.ARRAY);
						schemaArray.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
								+ apiResquest.getSchemaName().substring(1) + "List");
						schemaMap.put(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
								+ apiResquest.getSchemaName().substring(1) + "List", schemaArray);
						if (schema == null) {
							schema = factory.createSchema();
							schema.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
									+ apiResquest.getSchemaName().substring(1));
							schema.setType(JSONDataType.OBJECT);
							schemaMap.put(schema.getName(), schema);
							schema.setDeclaringContext(api);
							apiRoot.getSchemas().add(schema);
							api.getDefinitions().add(schema);
							discoverSchema(schemaArray.getName(),
									jsonSchemaInstance.getAsJsonArray().get(0).getAsString());
							schemaMap.put(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
									+ apiResquest.getSchemaName().substring(1), schema);

						}
						schemaArray.setItems(schema);
						apiRoot.getSchemas().add(schemaArray);
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
						schema.setType(JSONDataType.OBJECT);
						schemaMap.put(schema.getName(), schema);
						apiRoot.getSchemas().add(schema);
						schema.setDeclaringContext(api);
						api.getDefinitions().add(schema);
						discoverSchema(schema.getName(), body);

					}
					apiParameter.setSchema(schema);
				}

			}

		}

	}

	private void discoverResponses(Operation operation, APIRequest apiResquest) throws URISyntaxException {
		String responseKey = apiResquest.getOpenAPIPath() + apiResquest.getHttpMethod()
				+ apiResquest.getResponse().getStatus() + ParameterLocation.BODY;
		Response response = responsesMap.get(responseKey);
		if (response == null) {
			response = factory.createResponse();
			response.setCode(String.valueOf(apiResquest.getResponse().getStatus()));
			response.setDescription(apiResquest.getResponse().getStatusText());
			response.setDeclaringContext(operation);
			response.setDescription("<Add response description>");
			apiRoot.getResponses().add(response);
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
							schemaArray.setType(JSONDataType.ARRAY);
							schemaArray.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
									+ apiResquest.getSchemaName().substring(1) + "List");
							schemaMap.put(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
									+ apiResquest.getSchemaName().substring(1) + "List", schemaArray);
							if (schema == null) {
								schema = factory.createSchema();
								schema.setName(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
										+ apiResquest.getSchemaName().substring(1));
								schema.setType(JSONDataType.OBJECT);
								schemaMap.put(schema.getName(), schema);
								apiRoot.getSchemas().add(schema);
								schema.setDeclaringContext(api);
								api.getDefinitions().add(schema);
								discoverSchema(schema.getName(), jsonSchemaInstance.getAsJsonArray().get(0).toString());
								schemaMap.put(apiResquest.getSchemaName().substring(0, 1).toUpperCase()
										+ apiResquest.getSchemaName().substring(1), schema);

							}
							schemaArray.setItems(schema);
							apiRoot.getSchemas().add(schemaArray);
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
							schema.setType(JSONDataType.OBJECT);
							schemaMap.put(schema.getName(), schema);
							api.getDefinitions().add(schema);
							apiRoot.getSchemas().add(schema);
							schema.setDeclaringContext(api);
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
					schema.setType(JSONDataType.OBJECT);
					schemaMap.put(schema.getName(), schema);

					api.getDefinitions().add(schema);
					apiRoot.getSchemas().add(schema);
					schema.setDeclaringContext(api);
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
						schema.setType(JSONDataType.OBJECT);
						api.getDefinitions().add(schema);
						apiRoot.getSchemas().add(schema);
						schema.setDeclaringContext(api);
						schemaMap.put(eClass.getName(), schema);
					}
					map.put(eClass, schema);

					for (EAttribute eAttribute : eClass.getEAttributes()) {
						if (eAttribute.getUpperBound() == 1) {
							Schema property = factory.createSchema();
							property.setType(getJsonTypeFromECoreType(eAttribute.getEAttributeType()));
							property.setName(eAttribute.getName());
							apiRoot.getSchemas().add(property);
							property.setDeclaringContext(schema);
							schema.getProperties().add(property);
						} else {
							Schema arrayProperty = factory.createSchema();
							arrayProperty.setName(eAttribute.getName());
							arrayProperty.setType(JSONDataType.ARRAY);
							Schema items = factory.createSchema();
							items.setType(getJsonTypeFromECoreType(eAttribute.getEAttributeType()));
							arrayProperty.setItems(items);
							apiRoot.getSchemas().add(arrayProperty);
							arrayProperty.setDeclaringContext(schema);
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
							Schema property = map.get((EClass) eReference.getEType());
							schema.getProperties().add(property);
						} else {
							Schema arrayProperty = factory.createSchema();
							arrayProperty.setType(JSONDataType.ARRAY);
							arrayProperty.setName(eReference.getName());
							apiRoot.getSchemas().add(arrayProperty);
							arrayProperty.setDeclaringContext(schema);
							Schema items = map.get((EClass) eReference.getEType());
							arrayProperty.setItems(items);
							schema.getProperties().add(arrayProperty);
						}

					}
				}

			}
		}

	}

	private static JSONDataType getJsonTypeFromECoreType(EDataType eAttributeType) {
		if (eAttributeType.getName().equals("EString"))
			return JSONDataType.STRING;
		if (eAttributeType.getName().equals("EInt"))
			return JSONDataType.INTEGER;
		return JSONDataType.STRING;
	}

	public JSONDataType getIdTypeFromSchema(Schema schema) {
		for (Schema property : schema.getProperties())
			if (property.getName().equals("id"))
				return property.getType();
		return JSONDataType.STRING;
	}

	private Schema getSchemaFromPath(API api, String resource) {
		for (Schema schema : api.getDefinitions()) {
			if (schema.getName().equalsIgnoreCase(resource))
				return schema;
		}
		return null;
	}

	public API getApi() {
		return api;
	}

	public void setApi(API api) {
		this.api = api;
	}

	public Root getApiRoot() {
		return apiRoot;
	}

	public void setApiRoot(Root apiRoot) {
		this.apiRoot = apiRoot;
	}

}
