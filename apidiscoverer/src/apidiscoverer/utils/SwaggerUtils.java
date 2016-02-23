package apidiscoverer.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import jsondiscoverer.JsonSource;
import som.swagger.core.APIKeyLocation;
import som.swagger.core.Api;
import som.swagger.core.CollectionFormat;
import som.swagger.core.Contact;
import som.swagger.core.CoreFactory;
import som.swagger.core.CorePackage;
import som.swagger.core.ExternalDocs;
import som.swagger.core.Info;
import som.swagger.core.Items;
import som.swagger.core.JsonDataType;
import som.swagger.core.License;
import som.swagger.core.OAuth2FlowType;
import som.swagger.core.Operation;
import som.swagger.core.Parameter;
import som.swagger.core.ParameterLocation;
import som.swagger.core.Path;
import som.swagger.core.Response;
import som.swagger.core.Schema;
import som.swagger.core.SchemeType;
import som.swagger.core.Scope;
import som.swagger.core.SecurityRequirement;
import som.swagger.core.SecuritySchema;
import som.swagger.core.SecuritySchemeType;
import som.swagger.core.Tag;

public class SwaggerUtils {
	
	public static EPackage SwaggerRefiner(EPackage ePackage){
		List<EClassifier> allEClassifiers = ePackage.getEClassifiers();
		List<EClassifier> operationsClassifiers  = new ArrayList<EClassifier>();
		List <EClassifier> pathClassifiers = new ArrayList<EClassifier>();
		
		
		for(EClassifier eClassifier : allEClassifiers){
			if(eClassifier.getName().startsWith("/"))
				pathClassifiers.add(eClassifier);
			if(eClassifier.getName().equalsIgnoreCase("Get") || eClassifier.getName().equalsIgnoreCase("Post") || eClassifier.getName().equalsIgnoreCase("Put") || eClassifier.getName().equalsIgnoreCase("Delete") || eClassifier.getName().equalsIgnoreCase("Head"))
				operationsClassifiers.add(eClassifier);
				
		}
		System.out.println(operationsClassifiers);
		System.out.println(pathClassifiers);
		EClass path = EcoreFactory.eINSTANCE.createEClass();
		path.setName("Path");
		EAttribute eStructuralFeature = EcoreFactory.eINSTANCE.createEAttribute();
		eStructuralFeature.setName("path");
		eStructuralFeature.setEType(EcorePackage.Literals.ESTRING);
		
		for(EClassifier eClassifier : pathClassifiers){
		}
		
		return ePackage;
		
	}
	
	public static Api getModelFromJson(JsonObject swaggerRoot){
		
	CorePackage.eINSTANCE.eClass();
	CoreFactory factory = CoreFactory.eINSTANCE;
	
	Api api = factory.createApi();
	if(swaggerRoot.has("swagger"))
		api.setSwagger(swaggerRoot.get("swagger").getAsString());
	if(swaggerRoot.has("info")){
		Info info = factory.createInfo();
		api.setInfo(info);
		discoverInfo(swaggerRoot.get("info"),info,factory);
	}
	if(swaggerRoot.has("host"))
		api.setHost(swaggerRoot.get("host").getAsString());
	
	if(swaggerRoot.has("basePath"))
		api.setBasePath(swaggerRoot.get("basePath").getAsString());
	if(swaggerRoot.has("schemes")){
		JsonArray schemes = swaggerRoot.get("schemes").getAsJsonArray();
		for(JsonElement scheme :schemes){
			api.getSchemes().add(SchemeType.get(scheme.getAsString()));
		}
	}
	if(swaggerRoot.has("consumes")){
		JsonArray mimeTypes = swaggerRoot.get("consumes").getAsJsonArray();
		for(JsonElement mimeType :mimeTypes){
			api.getConsumes().add(mimeType.getAsString());
		}
	}
	
	if(swaggerRoot.has("produces")){
		JsonArray mimeTypes = swaggerRoot.get("produces").getAsJsonArray();
		for(JsonElement mimeType :mimeTypes){
			api.getProduces().add(mimeType.getAsString());
		}
	}
	if(swaggerRoot.has("paths")){
		discoverPaths(swaggerRoot.get("paths"),api,factory);
	}
	if(swaggerRoot.has("definitions")){
		discoverDefinitions(swaggerRoot.get("definitions"),api,factory);
	}
	if(swaggerRoot.has("parameters")){
		discoverParameters(swaggerRoot.get("parameters"),api, factory);
	}
	if(swaggerRoot.has("responses")){
		discoverResponses(swaggerRoot.get("responses"),api,factory);
	}
	if(swaggerRoot.has("securityDefinitions")){
		discoverSecurityDefinitions(swaggerRoot.get("securityDefinitions"),api, factory);
	}
	
	if(swaggerRoot.has("security")){
		discoverSecurity(swaggerRoot.get("security"),api,factory);
	}
	if(swaggerRoot.has("tags")){
		discoverTags(swaggerRoot.get("tags"),api,factory);
	}
	if(swaggerRoot.has("externalDocs")){
		ExternalDocs externalDocs = factory.createExternalDocs();
		api.setExternaldocs(externalDocs);
		discoverExternalDocs(swaggerRoot.get("externalDocs"),externalDocs);
	}
	return api;
		
	}


	private static void discoverTags(JsonElement jsonElement, Api api,CoreFactory factory) {
		JsonArray tagArray = jsonElement.getAsJsonArray();
		for(JsonElement tagElement : tagArray) {
			Tag tag = factory.createTag();
			api.getTag().add(tag);
			discoverTag(tagElement,tag,factory);
		}
		
	}

	private static void discoverTag(JsonElement tagElement, Tag tag, CoreFactory factory) {
		JsonObject tagObject = tagElement.getAsJsonObject();
		if(tagObject.has("name"))
			tag.setName(tagObject.get("name").getAsString());
		if(tagObject.has("description"))
			tag.setDescription(tagObject.get("description").getAsString());
		if(tagObject.has("externalDocs")){
			ExternalDocs externalDocs = factory.createExternalDocs();
			tag.setExternalDocs(externalDocs);
			discoverExternalDocs(tagObject.get("externalDocs"), externalDocs);
		}
			
		
	}

	private static void discoverSecurity(JsonElement jsonElement, Api api, CoreFactory factory) {
		JsonArray securityArray = jsonElement.getAsJsonArray();
		for(JsonElement securityElement : securityArray) {
			SecurityRequirement security = factory.createSecurityRequirement();
			api.getSecurity().add(security);
			discoverSecurityRequirement(securityElement,security,factory);
		}
		
		
	}

	private static void discoverParameters(JsonElement jsonElement, Api api, CoreFactory factory) {
		JsonObject parametersObject = jsonElement.getAsJsonObject();
		Set<Entry<String,JsonElement>> parameters = parametersObject.entrySet();
		for(Entry<String,JsonElement> parameterElement : parameters){
			Parameter parameter = factory.createParameter();
			parameter.setGlobalName(parameterElement.getKey());
			api.getParameters().add(parameter);
			discoverParameter(parameterElement.getValue(),parameter,factory);
		}
		
	}

	private static void discoverSecurityDefinitions(JsonElement jsonElement, Api api,CoreFactory factory) {
		JsonObject securityDefinitionsObject = jsonElement.getAsJsonObject();
		Set<Entry<String,JsonElement>> securityDefinitions = securityDefinitionsObject.entrySet();
		for(Entry<String,JsonElement> securityDefinitionElement : securityDefinitions){
			SecuritySchema securityDefinition = factory.createSecuritySchema();
			securityDefinition.setGlobalName(securityDefinitionElement.getKey());
			api.getSecurityDefinitions().add(securityDefinition);
			discoverSecuritySchema(securityDefinitionElement.getValue(),securityDefinition,factory);
		}
		
	}

	private static void discoverSecuritySchema(JsonElement jsonElement, SecuritySchema securitySchema,
			CoreFactory factory) {
	JsonObject jsonObject = jsonElement.getAsJsonObject();
	if(jsonObject.has("type"))
		securitySchema.setType(SecuritySchemeType.get(jsonObject.get("type").getAsString()));
	if(jsonObject.has("description"))
		securitySchema.setDescription(jsonObject.get("description").getAsString());
	if(jsonObject.has("name"))
		securitySchema.setName(jsonObject.get("name").getAsString());
	if(jsonObject.has("in"))
		securitySchema.setIn(APIKeyLocation.get(jsonObject.get("in").getAsString()));
	if(jsonObject.has("flow"))
		securitySchema.setFlow(OAuth2FlowType.get(jsonObject.get("flow").getAsString()));
	if(jsonObject.has("authorizationUrl"))
		securitySchema.setAuthorizationUrl(jsonObject.get("authorizationUrl").getAsString());
	if(jsonObject.has("tokenUrl"))
		securitySchema.setTokenUrl(jsonObject.get("tokenUrl").getAsString());
	if(jsonObject.has("scopes")){
	Set<Entry<String,JsonElement>> scopesElements = jsonObject.get("scopes").getAsJsonObject().entrySet();
		for(Entry<String, JsonElement> scopeElement : scopesElements){
			Scope scope = factory.createScope();
			securitySchema.getScopes().add(scope);
			
				scope.setName(scopeElement.getKey());
		
				scope.setDescription(scopeElement.getValue().getAsString());
		}
	}
		
	}

	private static void discoverResponses(JsonElement jsonElement, Api api, CoreFactory factory) {
		JsonObject responsesObject = jsonElement.getAsJsonObject();
		Set<Entry<String,JsonElement>> responses = responsesObject.entrySet();
		for(Entry<String,JsonElement> responseElement : responses){
			Response response = factory.createResponse();
			response.setCode(responseElement.getKey());
			api.getResponses().add(response);
			discoverResponse(responseElement.getValue(),response,factory);
		}
	}

	private static void discoverDefinitions(JsonElement jsonElement, Api api, CoreFactory factory) {
		JsonObject definitionsObject = jsonElement.getAsJsonObject();
		Set<Entry<String,JsonElement>> definitions = definitionsObject.entrySet();
		for(Entry<String,JsonElement> definitionElement : definitions){
			Schema schema = factory.createSchema();
			schema.setName(definitionElement.getKey());
			api.getDefinitions().add(schema);
			discoverSchema(definitionElement.getValue(),schema,factory);
		}
	}

	private static void discoverSchema(JsonElement jsonElement, Schema schema, CoreFactory factory) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if(jsonObject.has("$ref"))
			schema.setRef(jsonObject.get("$ref").getAsString());
		if(jsonObject.has("format"))
			schema.setFormat(jsonObject.get("format").getAsString());
		if(jsonObject.has("description"))
			schema.setDescription(jsonObject.get("description").getAsString());
		if(jsonObject.has("title"))
			schema.setTitle(jsonObject.get("title").getAsString());
		if(jsonObject.has("default"))
			schema.setDescription(jsonObject.get("default").getAsString());
		if(jsonObject.has("type"))
			schema.setType(JsonDataType.get(jsonObject.get("type").getAsString()));
		if(jsonObject.has("default"))
			schema.setDefault(jsonObject.get("default").getAsString());
		if(jsonObject.has("maximum"))
			schema.setMaximum(jsonObject.get("maximum").getAsInt());
		if(jsonObject.has("exclusiveMaximum"))
			schema.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());
		if(jsonObject.has("minimum"))
			schema.setMinimum(jsonObject.get("minimum").getAsInt());
		if(jsonObject.has("exclusiveMinimim"))
			schema.setExclusiveMinimum(jsonObject.get("exclusiveMinimum").getAsBoolean());
		if(jsonObject.has("maxLength"))
			schema.setMaxLength(jsonObject.get("maxLength").getAsInt());
		if(jsonObject.has("minLength"))
			schema.setMinLength(jsonObject.get("minLength").getAsInt());
		if(jsonObject.has("pattern"))
			schema.setPattern(jsonObject.get("pattern").getAsString());
		if(jsonObject.has("maxItems"))
			schema.setMaxItems(jsonObject.get("maxItems").getAsInt());
		if(jsonObject.has("minItems"))
			schema.setMinItems(jsonObject.get("minItems").getAsInt());
		if(jsonObject.has("uniqueItems"))
			schema.setUniqueItems(jsonObject.get("uniqueItems").getAsBoolean());
		if(jsonObject.has("enum")){
			JsonArray enumItems = jsonObject.get("enum").getAsJsonArray();
			for(JsonElement item : enumItems)
				schema.getEnum().add(item.getAsString());
		}
		if(jsonObject.has("multipleOf"))
			schema.setMultipleOf(jsonObject.get("multipleOf").getAsInt());
		if(jsonObject.has("maxProperties"))
			schema.setMaxProperties(jsonObject.get("maxProperties").getAsInt());
		if(jsonObject.has("minProperties"))
			schema.setMinProperties(jsonObject.get("minProperties").getAsInt());
		if(jsonObject.has("required")){
			for(JsonElement element : jsonObject.get("required").getAsJsonArray()){
				schema.getRequired().add(element.getAsString());
			}}
		if(jsonObject.has("properties")){
			Set<Entry<String,JsonElement>> properties = jsonObject.get("properties").getAsJsonObject().entrySet();
			for(Entry<String,JsonElement> jsonProperty: properties){
				Schema property = factory.createSchema();
				property.setName(jsonProperty.getKey());
				schema.getProperties().add(property);
				discoverSchema(jsonProperty.getValue(), property, factory);
			}
		}
		
			
		}
	

	private static void discoverPaths(JsonElement jsonElement, Api api, CoreFactory factory) {
		JsonObject pathsObject = jsonElement.getAsJsonObject();
		Set<Entry<String,JsonElement>> paths = pathsObject.entrySet();
		for(Entry<String,JsonElement> pathElement : paths){
			JsonObject pathObject = pathElement.getValue().getAsJsonObject();
			Path path = factory.createPath();
			api.getPaths().add(path);
			path.setPattern(pathElement.getKey());
			if(pathObject.has("$ref")){
				path.setRef(pathObject.get("$ref").getAsString());
			}
			if(pathObject.has("get")){
				Operation getOperation = factory.createOperation();
				path.setGet(getOperation);
				discoverOperation(pathObject.get("get"),getOperation,factory);
			}
			if(pathObject.has("put")){
				Operation putOperation = factory.createOperation();
				path.setPut(putOperation);
				discoverOperation(pathObject.get("put"),putOperation,factory);
			}
			if(pathObject.has("post")){
				Operation operation = factory.createOperation();
				path.setPost(operation);
				discoverOperation(pathObject.get("post"),operation,factory);
			}
			if(pathObject.has("delete")){
				Operation operation = factory.createOperation();
				path.setDelete(operation);
				discoverOperation(pathObject.get("delete"),operation,factory);
			}
			if(pathObject.has("options")){
				Operation operation = factory.createOperation();
				path.setOptions(operation);
				discoverOperation(pathObject.get("options"),operation,factory);
			}
			if(pathObject.has("head")){
				Operation operation = factory.createOperation();
				path.setHead(operation);
				discoverOperation(pathObject.get("head"),operation,factory);
			}
			if(pathObject.has("patch")){
				Operation operation = factory.createOperation();
				path.setPatch(operation);
				discoverOperation(pathObject.get("patch"),operation,factory);
			}
			if(pathObject.has("parameters")){
				JsonArray parametersArray = pathObject.get("parameters").getAsJsonArray();
				for(JsonElement parameterElement : parametersArray){
					Parameter parameter = factory.createParameter();
					path.getParameters().add(parameter);
					discoverParameter(parameterElement, parameter, factory);
				}
				}
				
			
		}
		
	}

	private static void discoverOperation(JsonElement jsonElement, Operation operation, CoreFactory factory) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if(jsonObject.has("tags")){
			JsonArray tagsArray = jsonObject.get("tags").getAsJsonArray();
			for(JsonElement tagElement : tagsArray)
				operation.getTags().add(tagElement.getAsString());
		}
		if(jsonObject.has("summary"))
			operation.setSummary(jsonObject.get("summary").getAsString());
		
		if(jsonObject.has("description"))
			operation.setDescription(jsonObject.get("description").getAsString());
		if(jsonObject.has("externalDocs")){
			ExternalDocs externalDocs = factory.createExternalDocs();
			operation.setExternalDocs(externalDocs);
			discoverExternalDocs(jsonObject.get("externalDocs"),externalDocs);
		}
		if(jsonObject.has("operationId"))
			operation.setOperationId(jsonObject.get("operationId").getAsString());
		
		if(jsonObject.has("consumes")){
			JsonArray mimeArray = jsonObject.get("consumes").getAsJsonArray();
			for(JsonElement mimeType : mimeArray)
				operation.getConsumes().add(mimeType.getAsString());
		}
		if(jsonObject.has("produces")){
			JsonArray mimeArray = jsonObject.get("produces").getAsJsonArray();
			for(JsonElement mimeType : mimeArray)
				operation.getProduces().add(mimeType.getAsString());
		}
		if(jsonObject.has("parameters")){
			JsonArray parameterArray = jsonObject.get("parameters").getAsJsonArray();
			for(JsonElement parameterElement : parameterArray){
				Parameter parameter = factory.createParameter();
				operation.getParameters().add(parameter);
				discoverParameter(parameterElement,parameter,factory);
			}
				
		}
		if(jsonObject.has("responses")){
			Set<Entry<String,JsonElement>> responses = jsonObject.get("responses").getAsJsonObject().entrySet();
			for(Entry<String,JsonElement> responseElement : responses){
				Response response = factory.createResponse();
				operation.getResponses().add(response);
				response.setCode(responseElement.getKey());
					discoverResponse(responseElement.getValue(),response,factory);
				}	
			}
		if(jsonObject.has("schemes")){
			JsonArray schemeArray = jsonObject.get("schemes").getAsJsonArray();
			for(JsonElement schemeElement : schemeArray)
				operation.getSchemes().add(SchemeType.get(schemeElement.getAsString()));
		}
		if(jsonObject.has("deprecated")){
			operation.setDeprecated(jsonObject.get("deprecated").getAsBoolean());
		}
		if(jsonObject.has("security")){
			JsonArray securityArray = jsonObject.get("security").getAsJsonArray();
			for(JsonElement securityElement : securityArray) {
				SecurityRequirement security = factory.createSecurityRequirement();
				operation.getSecurity().add(security);
				discoverSecurityRequirement(securityElement,security,factory);
				
			}
			
		}
		}
			
			
	private static void discoverSecurityRequirement(JsonElement securityElement, SecurityRequirement security,
			CoreFactory factory) {
		// TODO Auto-generated method stub
		
	}

	private static void discoverResponse(JsonElement value, Response response, CoreFactory factory) {
		// TODO Auto-generated method stub
		
	}

	private static void discoverParameter(JsonElement parameterElement, Parameter parameter, CoreFactory factory) {
		JsonObject jsonObject = parameterElement.getAsJsonObject();
		if(jsonObject.has("name"))
			parameter.setName(jsonObject.get("name").getAsString());
		
		if(jsonObject.has("in"))
			parameter.setIn(ParameterLocation.get(jsonObject.get("in").getAsString()));
		if(jsonObject.has("description"))
			parameter.setDescription(jsonObject.get("description").getAsString());
		if(jsonObject.has("required"))
			parameter.setRequired(jsonObject.get("required").getAsBoolean());
		if(jsonObject.has("schema")){
			Schema schema = factory.createSchema();
			parameter.setSchema(schema);
			discoverSchema(jsonObject.get("schema"), schema, factory);
		}
		if(jsonObject.has("type"))
			parameter.setType(JsonDataType.get(jsonObject.get("type").getAsString()));
		if(jsonObject.has("format"))
			parameter.setFormat(jsonObject.get("format").getAsString());
		if(jsonObject.has("allowEmptyValue")){
			parameter.setAllowEmplyValue(jsonObject.get("allowEmptyValue").getAsBoolean());
		if(jsonObject.has("items")){
			Items items = factory.createItems();
			parameter.setItems(items);
			discoverItems(jsonObject.get("items"),items,factory);}
		if(jsonObject.has("collectionFormat"))
			parameter.setCollectionFormat(CollectionFormat.get(jsonObject.get("collectionFormat").getAsString()));
		if(jsonObject.has("default"))
			parameter.setDefault(jsonObject.get("default").getAsString());
		if(jsonObject.has("maximum"))
			parameter.setMaximum(jsonObject.get("maximum").getAsInt());
		if(jsonObject.has("exclusiveMaximum"))
			parameter.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());
		if(jsonObject.has("minimum"))
			parameter.setMinimum(jsonObject.get("minimum").getAsInt());
		if(jsonObject.has("exclusiveMinimim"))
			parameter.setExclusiveMinimum(jsonObject.get("exclusiveMinimum").getAsBoolean());
		if(jsonObject.has("maxLength"))
			parameter.setMaxLength(jsonObject.get("maxLength").getAsInt());
		if(jsonObject.has("minLength"))
			parameter.setMinLength(jsonObject.get("minLength").getAsInt());
		if(jsonObject.has("pattern"))
			parameter.setPattern(jsonObject.get("pattern").getAsString());
		if(jsonObject.has("maxItems"))
			parameter.setMaxItems(jsonObject.get("maxItems").getAsInt());
		if(jsonObject.has("minItems"))
			parameter.setMinItems(jsonObject.get("minItems").getAsInt());
		if(jsonObject.has("uniqueItems"))
			parameter.setUniqueItems(jsonObject.get("uniqueItems").getAsBoolean());
		if(jsonObject.has("enum")){
			JsonArray enumItems = jsonObject.get("enum").getAsJsonArray();
			for(JsonElement item : enumItems)
				parameter.getEnum().add(item.getAsString());
		}
		if(jsonObject.has("multipleOf"))
			parameter.setMultipleOf(jsonObject.get("multipleOf").getAsInt());
		
		}
	}


	

	private static void discoverItems(JsonElement jsonElement, Items items, CoreFactory factory) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
			if(jsonObject.has("type"))
				items.setType(JsonDataType.get(jsonObject.get("type").getAsString()));
			if(jsonObject.has("format"))
				items.setFormat(jsonObject.get("format").getAsString());
			if(jsonObject.has("items")){
				Items innerItmes = factory.createItems();
				items.setItems(innerItmes);
				discoverItems(jsonObject.get("items"),innerItmes,factory);
			}
			if(jsonObject.has("collectionFormat"))
				items.setCollectionFormat(CollectionFormat.get(jsonObject.get("collectionFormat").getAsString()));
			if(jsonObject.has("default"))
				items.setDefault(jsonObject.get("default").getAsString());
			if(jsonObject.has("maximum"))
				items.setMaximum(jsonObject.get("maximum").getAsInt());
			if(jsonObject.has("exclusiveMaximum"))
				items.setExclusiveMaximum(jsonObject.get("exclusiveMaximum").getAsBoolean());
			if(jsonObject.has("minimum"))
				items.setMinimum(jsonObject.get("minimum").getAsInt());
			if(jsonObject.has("exclusiveMinimim"))
				items.setExclusiveMinimum(jsonObject.get("exclusiveMinimum").getAsBoolean());
			if(jsonObject.has("maxLength"))
				items.setMaxLength(jsonObject.get("maxLength").getAsInt());
			if(jsonObject.has("minLength"))
				items.setMinLength(jsonObject.get("minLength").getAsInt());
			if(jsonObject.has("pattern"))
				items.setPattern(jsonObject.get("pattern").getAsString());
			if(jsonObject.has("maxItems"))
				items.setMaxItems(jsonObject.get("maxItems").getAsInt());
			if(jsonObject.has("minItems"))
				items.setMinItems(jsonObject.get("minItems").getAsInt());
			if(jsonObject.has("uniqueItems"))
				items.setUniqueItems(jsonObject.get("uniqueItems").getAsBoolean());
			if(jsonObject.has("enum")){
				JsonArray enumItems = jsonObject.get("enum").getAsJsonArray();
				for(JsonElement item : enumItems)
					items.getEnum().add(item.getAsString());
			}
			if(jsonObject.has("multipleOf"))
				items.setMultipleOf(jsonObject.get("multipleOf").getAsInt());
	}

	private static void discoverExternalDocs(JsonElement jsonElement, ExternalDocs externalDocs) {
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		if(jsonObject.has("description"))
			externalDocs.setDescription(jsonObject.get("description").getAsString());
		
		if(jsonObject.has("url"))
			externalDocs.setUrl(jsonObject.get("url").getAsString());
		
	}

	private static void discoverInfo(JsonElement jsonElement, Info info, CoreFactory factory) {
		JsonObject infoObject = jsonElement.getAsJsonObject();
		if(infoObject.has("title")){
			info.setTitle(infoObject.get("title").getAsString());
		}
		if(infoObject.has("description"))
			info.setDescription(infoObject.get("description").getAsString());
		if(infoObject.has("termsOfServices"))
			info.setTermsOfServices(infoObject.get("termsOfService").getAsString());
		if(infoObject.has("contact"))
			discoverContact(infoObject.get("contact"),factory,info);
		if(infoObject.has("license"))
			discoverLicense(infoObject.get("license"),factory,info);
		if(infoObject.has("version"))
			info.setVersion(infoObject.get("version").getAsString());
		
		
		
	}

	private static void discoverLicense(JsonElement jsonElement, CoreFactory factory, Info info) {
		JsonObject licenseObject = jsonElement.getAsJsonObject();
		License license = factory.createLicense();
		info.setLicense(license);
		if(licenseObject.has("name"))
			license.setName(licenseObject.get("name").getAsString());
		if(licenseObject.has("url"))
			license.setUrl(licenseObject.get("url").getAsString());
	}

	private static void discoverContact(JsonElement jsonElement, CoreFactory factory, Info info) {
		JsonObject contactObject = jsonElement.getAsJsonObject();
		Contact contact = factory.createContact();
		info.setContact(contact);
		if(contactObject.has("name"))
			contact.setName(contactObject.get("name").getAsString());
		if(contactObject.has("url"))
			contact.setUrl(contactObject.get("url").getAsString());
		if(contactObject.has("email"))
			contact.setEmail(contactObject.get("email").getAsString());
	
		
		
	}

	public static void saveModel(Api api, String modelName, String location) throws FileNotFoundException {

	
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    Resource resource = resSet.createResource(URI
	            .createURI(location+File.separator+modelName+".xmi"));
	    resource.getContents().add(api);
	    try {
	        resource.save(Collections.EMPTY_MAP);
	      } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }

	}

}
