package som.apidiscoverer.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import som.apidiscoverer.model.HttpMethod;
import som.apidiscoverer.model.JSONAPICallExample;

public class JSONUtils {
	
//	public static JSONAPICallExample getExtractJSONCallExample(String row){
//		JSONAPICallExample jsonAPICallExample = new JSONAPICallExample();
//		JsonParser parser = new JsonParser();
//		JsonElement jsonInstance = parser.parse(row);
//		if(jsonInstance.isJsonObject()){
//			JsonObject root = jsonInstance.getAsJsonObject();
//			if(root.has("request")){
//				JsonElement request = root.get("request");
//				if(request.isJsonObject()){
//					JsonObject requestObject = request.getAsJsonObject();
//					if(requestObject.has("url")){
//						JsonElement url = requestObject.get("url");
//								if(url.isJsonPrimitive()){
//									jsonAPICallExample.setUrl(url.getAsString());
//								}
//					}
//					if(requestObject.has("method")){
//					JsonElement method = requestObject.get("method");
//					jsonAPICallExample.setMethod(HttpMethod.fromString(method.getAsString()));
//					}
//					if(requestObject.has("body")){
//						JsonElement body = requestObject.get("body");
//						//TODO assert that body is json
//						jsonAPICallExample.setRequestBody(body.getAsString());
//						
//					}
//				}
//				
//			}
//			if(root.has("response")){
//				JsonElement response = root.get("response");
//				if(response.isJsonObject()){
//					JsonObject responseObject = response.getAsJsonObject(); 
//					if(responseObject.has("status")){
//						JsonElement status = responseObject.get("status");
//						jsonAPICallExample.setStatus(status.getAsString());
//						
//					}
//					if(responseObject.has("body")){
//						JsonElement body = responseObject.get("body");
//						jsonAPICallExample.setResponseBody(body.getAsString());
//						
//					}
//				}
//				
//			}
//		}
//		return jsonAPICallExample;
//	}

}
