package som.apidiscoverer;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import core.APIOperation;
import core.APIParameter;
import core.Api;
import core.Info;
import core.JsonDataType;
import core.ParameterLocation;
import core.Path;
import core.Response;
import core.Schema;
import core.SchemeType;

public class Generator {
	
	
	public static JsonObject getJsonFromSwaggerModel(Api api) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("swagger", api.getSwagger());
		if(api.getInfo()!= null){
			JsonObject infoJson = new JsonObject();
			jsonObject.add("info", infoJson);
			generateInfo(api.getInfo(),infoJson);
		}
		jsonObject.addProperty("host", api.getHost());
		jsonObject.addProperty("basePath", api.getBasePath());
		if(!api.getSchemes().isEmpty()){
			JsonArray schemes = new JsonArray();
			for(SchemeType scheme: api.getSchemes())
				schemes.add(scheme.getLiteral());
			jsonObject.add("schemes", schemes);
		}
		if(!api.getConsumes().isEmpty()){
			JsonArray consumesList = new JsonArray();
			for(String consume : api.getConsumes())
				consumesList.add(consume);
			jsonObject.add("consumes", consumesList);
		}
		if(!api.getProduces().isEmpty()){
			JsonArray producesList = new JsonArray();
			for(String produces : api.getConsumes())
				producesList.add(produces);
			jsonObject.add("produces", producesList);
		}
		if(!api.getPaths().isEmpty()){
			JsonObject jsonPaths = new JsonObject();
			jsonObject.add("paths",jsonPaths);
			generatePaths(api,jsonPaths);
			
		}
		if(!api.getDefinitions().isEmpty()){
			JsonObject jsonDefintions = new JsonObject();
			jsonObject.add("definitions",jsonDefintions);
			generateDefinitions(api,jsonDefintions);
			
		}
				return jsonObject;

			}
	private static void generateInfo(Info info, JsonObject jsonInfo) {
		jsonInfo.addProperty("title", info.getTitle());
		jsonInfo.addProperty("version", info.getVersion());
		
	}
			private static void generatePaths(Api api, JsonObject jsonPaths) {
				for(Path path: api.getPaths()){
					JsonObject jsonOperations = new JsonObject();
					jsonPaths.add(path.getPattern(), jsonOperations);
					generateOperations(path,jsonOperations);
				}
				
			}
		

			private static void generateOperations(Path path, JsonObject jsonOperations) {
				if(path.getGet()!= null){
					JsonObject jsonOperation = new JsonObject();
					jsonOperations.add("get", jsonOperation);
					generateOperation(path.getGet(),jsonOperation);
					
				}
				if(path.getPost()!= null){
					JsonObject jsonOperation = new JsonObject();
					jsonOperations.add("post", jsonOperation);
					generateOperation(path.getPost(),jsonOperation);
					
				}
				if(path.getPut()!= null){
					JsonObject jsonOperation = new JsonObject();
					jsonOperations.add("put", jsonOperation);
					generateOperation(path.getPut(),jsonOperation);
					
				}
				if(path.getDelete()!= null){
					JsonObject jsonOperation = new JsonObject();
					jsonOperations.add("delete", jsonOperation);
					generateOperation(path.getDelete(),jsonOperation);
					
				}
			}
			private static void generateOperation(APIOperation operation, JsonObject jsonOperation) {
				if(!operation.getTags().isEmpty()){
					JsonArray tags = new JsonArray();
					for(String tag: operation.getTags())
						tags.add( tag);
					jsonOperation.add("tags", tags);
				}
				if(operation.getSummary()!= null){
					jsonOperation.addProperty("summary", operation.getSummary());
				}
				if(operation.getDescription()!= null){
					jsonOperation.addProperty("description", operation.getDescription());
				}
				//TODO externalDocs
				//TODO operationId
				if(!operation.getConsumes().isEmpty()){
					JsonArray consumesList = new JsonArray();
					for(String consume : operation.getConsumes())
						consumesList.add(consume);
					jsonOperation.add("consumes", consumesList);
				}
				if(!operation.getProduces().isEmpty()){
					JsonArray producesList = new JsonArray();
					for(String produces : operation.getProduces())
						producesList.add(produces);
					jsonOperation.add("produces", producesList);
				}
				if(!operation.getParameters().isEmpty()){
					JsonArray paramatersJson = new JsonArray();
					for(APIParameter parameter : operation.getParameters()){
						JsonObject parameterJson = new JsonObject();
						paramatersJson.add(parameterJson);
						generateParameter(parameter,parameterJson);
					}
					jsonOperation.add("parameters", paramatersJson);
				}
				if(!operation.getResponses().isEmpty()){
					JsonObject responsesJson = new JsonObject();
					jsonOperation.add("responses", responsesJson);
					for(Response response :operation.getResponses()){
						JsonObject responseJson = new JsonObject();
						responsesJson.add(response.getCode(), responseJson);
						generateResponse (response,responseJson);
					}
				}
				if(!operation.getSchemes().isEmpty()){
					JsonArray schemes = new JsonArray();
					for(SchemeType scheme: operation.getSchemes())
						schemes.add(scheme.getLiteral());
					jsonOperation.add("schemes", schemes);
				}
				//TODO deprecated
				//TODO security
			
			}
			private static void generateParameter(APIParameter parameter, JsonObject parameterJson) {
				parameterJson.addProperty("name", parameter.getName());
				parameterJson.addProperty("in",parameter.getIn().getLiteral());
				if(parameter.getDescription()!= null)
					parameterJson.addProperty("description", parameter.getDescription());
				if( parameter.isRequired())
				parameterJson.addProperty("required", parameter.isRequired());
				if(parameter.getIn().equals(ParameterLocation.BODY)){
					if(parameter.getSchema().getType().equals(JsonDataType.OBJECT))
						parameterJson.addProperty("schema", "#/definitions/"+parameter.getSchema().getName());
					else {
						//TODO array and primitive
					}
				}
					
			}
			private static void generateResponse(Response response, JsonObject responseJson) {
				responseJson.addProperty("description", response.getDescription());
				if(response.getSchema()!= null){
					if(response.getSchema().getType().equals(JsonDataType.OBJECT))
						responseJson.addProperty("schema", "#/definitions/"+response.getSchema().getName());
					else {
						if(response.getSchema().getType().equals(JsonDataType.ARRAY)){
							JsonObject schemaArray = new JsonObject();
							responseJson.add("schema", schemaArray);
							schemaArray.addProperty("type", JsonDataType.ARRAY.getLiteral());
							JsonObject items = new JsonObject();
							if(response.getSchema().getItems().getType().equals(JsonDataType.OBJECT))
								items.addProperty("$ref", "#/definitions/"+response.getSchema().getItems().getName());
							
						}
					}
						
				}
			
				
			}
			private static void generateDefinitions(Api api, JsonObject jsonDefinitions) {
				for(Schema schema: api.getDefinitions()){
					JsonObject schemaJson = new JsonObject();
					jsonDefinitions.add(schema.getName(), schemaJson);
					generateSchema(schema,schemaJson);
				}
				
			}
			private static void generateSchema(Schema schema, JsonObject schemaJson) {
				schemaJson.addProperty("type", schema.getType().getLiteral());
				if(!schema.getProperties().isEmpty()){
					JsonObject propertiesJson = new JsonObject();
				schemaJson.add("properties", propertiesJson );
				for(Schema property : schema.getProperties()){
					JsonObject propertyJson = new JsonObject();
					propertiesJson.add(property.getName(), propertyJson);
					generateSchemaProperty(property, propertyJson);
				}
					
				}
			}
			private static void generateSchemaProperty(Schema property, JsonObject propertyJson) {
				if(property.getType().equals(JsonDataType.OBJECT)){
					propertyJson.addProperty("$ref", "#/definitions/"+property.getRefResolved().getName());
				}else {
					if(property.getType().equals(JsonDataType.ARRAY)){
						propertyJson.addProperty("type", JsonDataType.ARRAY.getLiteral());
						JsonObject items = new JsonObject();
						if(property.getItems().getType().equals(JsonDataType.OBJECT))
							items.addProperty("$ref", "#/definitions/"+property.getItems().getName());
						else 
							items.addProperty("type", property.getItems().getType().getLiteral());
						propertyJson.add("items", items);
						
						
					}
					else {
						propertyJson.addProperty("type", property.getType().getLiteral());
					}
				}
			}

}
