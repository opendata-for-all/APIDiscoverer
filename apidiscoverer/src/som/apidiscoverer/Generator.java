package som.apidiscoverer;

import com.google.gson.JsonObject;

import core.Api;
import core.Path;
import core.Schema;

public class Generator {
	
	
	public static JsonObject getJsonFromSwaggerModel(Api api) {
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("swagger", api.getSwagger());
		jsonObject.addProperty("host", api.getHost());
		jsonObject.addProperty("basePath", api.getBasePath());
		if(!api.getPaths().isEmpty()){
			JsonObject jsonPaths = new JsonObject();
			jsonObject.add("paths",jsonPaths);
			generatePaths(api,jsonPaths);
			
		}
		if(!api.getDefinitions().isEmpty()){
			JsonObject jsonPaths = new JsonObject();
			jsonObject.add("definitions",jsonPaths);
			generateDefinitions(api,jsonPaths);
			
		}
				return jsonObject;

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
					
				}
			}
			private static void generateDefinitions(Api api, JsonObject jsonPaths) {
				for(Schema schema: api.getDefinitions()){
					JsonObject jsonProperties = new JsonObject();
					jsonPaths.add(schema.getName(), jsonProperties);
				}
				
			}

}
