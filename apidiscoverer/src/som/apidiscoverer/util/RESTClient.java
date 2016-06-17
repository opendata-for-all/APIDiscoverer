package som.apidiscoverer.util;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.HttpRequest;
import com.mashape.unirest.request.HttpRequestWithBody;

import som.apidiscoverer.model.APIRequest;
import som.apidiscoverer.model.Response;;
public class RESTClient {
	
	public static Response send(APIRequest apiRequest) throws UnirestException{
		Response response = new Response();
		HttpResponse<String> httResponse;
		HttpRequest rest;
		switch (apiRequest.getHttpMethod()) {
		case GET:  rest = Unirest.get(apiRequest.getUrl()).header("Accept", "application/json")
				.header("Content-type", "application/json");
		httResponse = rest.asString();
		response.setBody(httResponse.getBody());
		response.setStatus(httResponse.getStatus());
		response.setStatusText(httResponse.getStatusText());
		break;
		case POST: rest = Unirest.post(apiRequest.getUrl()).header("Accept", "application/json")
				.header("Content-type", "application/json");
		((HttpRequestWithBody) rest).body(apiRequest.getBody());
		System.out.println(apiRequest.getBody());
		httResponse = rest.asString();
		response.setBody(httResponse.getBody());
		response.setStatus(httResponse.getStatus());
		response.setStatusText(httResponse.getStatusText());

		default:
			break;
		}
		return response;
//		HttpResponse<JsonNode> res = Unirest.get("http://apis.io/api/search")
//				  .queryString("q", "")
//				  .queryString("swagger", "true")
//				  .queryString("limit",1000)
//				  .asJson();
	}
	
	
	
	

}
