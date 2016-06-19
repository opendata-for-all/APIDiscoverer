package som.apidiscoverer;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
import som.apidiscoverer.model.APIRequest;
import som.apidiscoverer.model.Parameter;

public class Discoverer {
	CoreFactory factory;
	private Api api;
	private EPackage schema;
	private Map<String, Path> pathsMap = new HashMap<String, Path>();
	private Map<String, APIParameter> parametersMap = new HashMap<String, APIParameter>();
	private Map<String, Schema> schemaMap = new HashMap<String, Schema>();

	public Discoverer() {
		// Initialize the model
		CorePackage.eINSTANCE.eClass();
		// Retrieve the default factory singleton
		factory = CoreFactory.eINSTANCE;
		api = factory.createApi();
	}


	public void discover(APIRequest apiResquest) throws MalformedURLException {
		discoverBasicInfo(apiResquest);

		// discoverSchema(apiResquest);
	}

	private void discoverBasicInfo(APIRequest apiResquest) {
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

	private void discoverPaths(APIRequest apiResquest) {
		Path path = pathsMap.get(apiResquest.getOpenAPIPath());
		if (path == null) {
			path = factory.createPath();
			path.setPattern(apiResquest.getOpenAPIPath());
			api.getPaths().add(path);
			pathsMap.put(path.getPattern(), path);
		}
		discoverOperations(path, apiResquest);

	}

	private void discoverOperations(Path path, APIRequest apiResquest) {
		switch (apiResquest.getHttpMethod()) {
		case GET:
			APIOperation getOperation = path.getGet();
			if (getOperation == null) {
				getOperation = factory.createAPIOperation();
				getOperation.getProduces().add("application/json");
				path.setGet(getOperation);
			}
			discoverPrameters(getOperation, apiResquest);

			break;
		case POST:
			APIOperation postOperation = path.getPost();
			if (postOperation == null) {
				postOperation = factory.createAPIOperation();
				postOperation.getConsumes().add("application/json");
				postOperation.getProduces().add("application/json");
				path.setPost(postOperation);
			}
			discoverPrameters(postOperation, apiResquest);

			break;
		case PUT:
			APIOperation putOperation = path.getPut();
			if (putOperation == null) {
				putOperation = factory.createAPIOperation();
				putOperation.getConsumes().add("application/json");
				putOperation.getProduces().add("application/json");
				path.setPut(putOperation);
			}
			discoverPrameters(putOperation, apiResquest);

			break;
		case DELETE:
			APIOperation deleteOperation = path.getDelete();
			if (deleteOperation == null) {
				deleteOperation = factory.createAPIOperation();
				deleteOperation.getProduces().add("application/json");
				path.setDelete(deleteOperation);
			}
			discoverPrameters(deleteOperation, apiResquest);

			break;
		default:
			break;
		}

	}

	private void discoverPrameters(APIOperation apiOperation, APIRequest apiResquest) {
		for (Parameter parameter : apiResquest.getQueryParameters()) {
			String parameterKey = apiResquest.getOpenAPIPath() + apiResquest.getHttpMethod() + parameter.getName()
					+ ParameterLocation.QUERY;
			APIParameter apiParameter = parametersMap.get(parameterKey);
			if (apiParameter == null) {
				apiParameter = factory.createAPIParameter();
				apiParameter.setIn(ParameterLocation.QUERY);
				apiParameter.setName(parameter.getName());
				apiParameter.setType(parameter.getType());
				apiOperation.getParameters().add(apiParameter);
				parametersMap.put(parameterKey, apiParameter);
			}

		}
		for (Parameter parameter : apiResquest.getPathParameters()) {
			String parameterKey = apiResquest.getOpenAPIPath() + apiResquest.getHttpMethod() + parameter.getName()
					+ ParameterLocation.PATH;
			APIParameter apiParameter = parametersMap.get(parameterKey);
			if (apiParameter == null) {
				apiParameter = factory.createAPIParameter();
				apiParameter.setIn(ParameterLocation.PATH);
				apiParameter.setName(parameter.getName());
				apiParameter.setType(parameter.getType());
				apiOperation.getParameters().add(apiParameter);
				parametersMap.put(parameterKey, apiParameter);
			}
		
		}
		if(apiResquest.getBody()!= null){
			String parameterKey = apiResquest.getOpenAPIPath() + apiResquest.getHttpMethod() +"body"+ ParameterLocation.BODY;
			APIParameter apiParameter = parametersMap.get(parameterKey);
			if(apiParameter == null){
				apiParameter = factory.createAPIParameter();
				apiParameter.setIn(ParameterLocation.PATH);
				apiParameter.setName("body");
				apiOperation.getParameters().add(apiParameter);
				parametersMap.put(parameterKey, apiParameter);
				
				Schema schema = schemaMap.get(apiResquest.getSchemaName());
				if(schema == null){
					schema = factory.createSchema();
				}
			}
			
		}


	}
	// private void discoverSchema(APIRequest apiResquest) {
	//
	// JsonSource source = new JsonSource(apiResquest.getLastMeaningfullWord());
	// source.addJsonData(null, new StringReader(apiResquest.getBody()));
	//
	// JsonSimpleDiscoverer discoverer = new JsonSimpleDiscoverer();
	// setSchema(discoverer.discover(source));
	//
	// }

	public void merge() {
		Map<EClass, Schema> map = new HashMap<EClass, Schema>();
		for (EObject object : schema.getEClassifiers()) {
			if (object instanceof EClass) {
				EClass eClass = (EClass) object;
				Schema schema = factory.createSchema();
				schema.setName(eClass.getName());
				schema.setType(JsonDataType.OBJECT);
				map.put(eClass, schema);
				api.getDefinitions().add(schema);
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
						arrayProperty.setItems(arrayProperty);
						api.getPrimitiveDefinitions().add(arrayProperty);
						schema.getProperties().add(arrayProperty);
					}
				}

			}

		}
		// resolving references
		for (EObject object : schema.getEClassifiers()) {
			if (object instanceof EClass) {
				EClass eClass = (EClass) object;
				Schema schema = map.get(eClass);
				for (EReference eReference : eClass.getEReferences()) {
					if (eReference.getUpperBound() == 1) {
						Schema property = map.get((EClass) eReference.getEType());
						System.out.println(property.getName());
						schema.getProperties().add(property);
					} else {
						Schema arrayProperty = factory.createSchema();
						arrayProperty.setType(JsonDataType.ARRAY);
						api.getPrimitiveDefinitions().add(arrayProperty);
						Schema items = map.get((EClass) eReference.getEType());
						System.out.println(items.getName());
						arrayProperty.setItems(items);
					}

				}
			}

		}

	}

	private static JsonDataType getJsonTypeFromECoreType(EDataType eAttributeType) {
		if (eAttributeType.getName().equals("EString"))
			return JsonDataType.STRING;
		if (eAttributeType.getName().equals("EInt"))
			return JsonDataType.INTEGER;
		return null;
	}

	public Api getApi() {
		return api;
	}

	public void setApi(Api api) {
		this.api = api;
	}

	public EPackage getSchema() {
		return schema;
	}

	public void setSchema(EPackage schema) {
		this.schema = schema;
	}

}
