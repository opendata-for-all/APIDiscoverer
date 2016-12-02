package som.apidiscoverer.model;

import com.google.gson.annotations.SerializedName;

public class JSONAPICallExample {

	@SerializedName("request")
	private JSONRequest jsonRequest;
	
	@SerializedName("response")
	private JSONResponse jsonResponse;
	
	public JSONAPICallExample(){
		jsonRequest = new JSONRequest(); 
		jsonResponse = new JSONResponse();
	}
	public JSONAPICallExample(String url, HttpMethod method, String requestBody, String status, String responseBody){
		this();
		jsonRequest.setUrl(url);
		jsonRequest.setMethod(method);
		jsonRequest.setBody(requestBody);
		
		jsonResponse.setStatus(status);
		jsonResponse.setBody(responseBody);
		
	}

	public JSONRequest getJsonRequest() {
		return jsonRequest;
	}

	public void setJsonRequest(JSONRequest jsonRequest) {
		this.jsonRequest = jsonRequest;
	}

	public JSONResponse getJsonResponse() {
		return jsonResponse;
	}

	public void setJsonResponse(JSONResponse jsonResponse) {
		this.jsonResponse = jsonResponse;
	}
	
	
	
	
	
}
