package som.mashape.discoverer.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import core.APIOperation;
import core.APIParameter;
import core.Api;
import core.CoreFactory;
import core.CorePackage;
import core.Path;
import som.mashape.discoverer.model.APIRequest;
import som.mashape.discoverer.model.HttpMethod;
import som.mashape.discoverer.model.Parameter;
import som.mashape.discoverer.model.ParameterLocation;
import som.mashape.discoverer.model.Response;

public class MashapeUtils {

	public static Api oepnAPIFromJSon(JsonObject jsonObject) {
		CorePackage.eINSTANCE.eClass();
		CoreFactory factory = CoreFactory.eINSTANCE;
		Api api = factory.createApi();
		api.setInfo(factory.createInfo());
		api.getInfo().setDescription(jsonObject.get("description").getAsString());
		api.getInfo().getContact().setUrl(jsonObject.get("website").getAsString());
		JsonObject endpoints = jsonObject.get("endpoits").getAsJsonObject();
		JsonArray data = endpoints.get("data").getAsJsonArray();
		for (JsonElement dataEntry : data) {
			JsonObject dataObject = dataEntry.getAsJsonObject();
			Path path = factory.createPath();
			path.setPattern(dataObject.get("route").getAsString());
			APIOperation apiOperation = factory.createAPIOperation();
			switch (dataObject.get("method").getAsString()) {
			case "GET":
				path.setGet(apiOperation);
				discoverOperation(apiOperation, dataObject, factory);
				break;
			case "POST":
				path.setPost(apiOperation);
				discoverOperation(apiOperation, dataObject, factory);
				break;
			case "PUT":
				path.setPut(apiOperation);
				discoverOperation(apiOperation, dataObject, factory);
				break;
			case "DELETE":
				path.setDelete(apiOperation);
				discoverOperation(apiOperation, dataObject, factory);
				break;
			}

		}
		return null;

	}

	private static void discoverOperation(APIOperation apiOperation, JsonObject dataObject, CoreFactory factory) {
		apiOperation.setDescription(dataObject.get("description").getAsString());
		apiOperation.setOperationId(dataObject.get("slugifiedPrimary").getAsString());
		for (JsonElement dataParameter : dataObject.get("routeparameters").getAsJsonObject().get("data")
				.getAsJsonArray()) {
			APIParameter apiParameter = factory.createAPIParameter();
			apiOperation.getParameters().add(apiParameter);
			discoverParameter(apiParameter, dataParameter, factory);

		}

	}

	private static void discoverParameter(APIParameter apiParameter, JsonElement dataParameter, CoreFactory factory) {

	}

	public static APIRequest getAPIRequestFromMashapeEndPointData(APIRequest apiRequest, JsonObject mashapeObject) {
		if (mashapeObject.has("route"))
			apiRequest.setOpenAPIPath(mashapeObject.get("route").getAsString());
		if (mashapeObject.has("method"))
			switch (mashapeObject.get("method").getAsString()) {
			case "GET":
				apiRequest.setHttpMethod(HttpMethod.GET);
				break;
			case "POST":
				apiRequest.setHttpMethod(HttpMethod.POST);
				break;
			case "PUT":
				apiRequest.setHttpMethod(HttpMethod.PUT);
				break;
			case "DELETE":
				apiRequest.setHttpMethod(HttpMethod.DELETE);
				break;
			}
		if (mashapeObject.has("description"))
			apiRequest.setDesccription(mashapeObject.get("description").getAsString());
		if (mashapeObject.has("slugifiedPrimary"))
			apiRequest.setOperationId(mashapeObject.get("slugifiedPrimary").getAsString());
		
		
		if (mashapeObject.has("response")) {
			Response response = new Response();
			apiRequest.setResponse(response);
			JsonElement responseElement = mashapeObject.get("response");
			if (responseElement.getAsJsonObject().has("body")) {
				JsonElement body = responseElement.getAsJsonObject().get("body");
				response.setBody(body.getAsString());
				if (responseElement.getAsJsonObject().has("format"))
					response.setMediaType(responseElement.getAsJsonObject().get("format").getAsString());
				if (mashapeObject.has("code"))
					response.setStatus(mashapeObject.get("code").getAsInt());
			}
		}
		if (mashapeObject.has("routeparameters"))
			if (mashapeObject.get("routeparameters").getAsJsonObject().has("data"))
				for (JsonElement jsonParameter : mashapeObject.get("routeparameters").getAsJsonObject().get("data")
						.getAsJsonArray()) {
					Parameter parameter = new Parameter();
					if (jsonParameter.getAsJsonObject().has("name"))
						parameter.setName(jsonParameter.getAsJsonObject().get("name").getAsString());
					if (jsonParameter.getAsJsonObject().has("type"))
						parameter.setType(jsonParameter.getAsJsonObject().get("type").getAsString());
					if (jsonParameter.getAsJsonObject().has("description"))
						parameter.setDescription(jsonParameter.getAsJsonObject().get("description").getAsString());
					if (jsonParameter.getAsJsonObject().has("array"))
						parameter.setArray(jsonParameter.getAsJsonObject().get("array").getAsBoolean());
					if (jsonParameter.getAsJsonObject().has("value"))
						parameter.setValue(jsonParameter.getAsJsonObject().get("value").getAsString());
					if (jsonParameter.getAsJsonObject().has("condition"))
						if (jsonParameter.getAsJsonObject().get("condition").getAsString().equalsIgnoreCase("REQUIRED"))
							parameter.setRequired(true);
					if (jsonParameter.getAsJsonObject().has("querystring"))
						if (jsonParameter.getAsJsonObject().get("querystring").getAsBoolean()) {
							parameter.setLocation(ParameterLocation.QUERY);
						} else {
							if (apiRequest.getOpenAPIPath().contains("{" + parameter.getName() + "}")) {
								parameter.setLocation(ParameterLocation.QUERY);
							} else {
								// TODO other locations: body, header
							}
						}
					apiRequest.getParameters().add(parameter);
				}

		return apiRequest;

	}

	public static void getParameterTypes(JsonObject mashapeObject) {

		if (mashapeObject.has("routeparameters"))
			if (mashapeObject.get("routeparameters").getAsJsonObject().has("data"))
				for (JsonElement jsonParameter : mashapeObject.get("routeparameters").getAsJsonObject().get("data")
						.getAsJsonArray()) {
					if (jsonParameter.getAsJsonObject().has("type"))
						System.out.println(jsonParameter.getAsJsonObject().get("type").getAsString());

				}
	}
}
