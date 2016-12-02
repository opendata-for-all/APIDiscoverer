package som.importers.utils;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.HttpRequest;

public class APIIOUtils {

	public static void importDefinitions(String folder) throws Exception {
		HttpResponse<JsonNode> response = Unirest.get("http://apis.io/api/search").queryString("q", "")
				.queryString("swagger", "true").queryString("limit", 1000).asJson();
		JsonParser parser = new JsonParser();
		JsonObject obj = (JsonObject) parser.parse(response.getBody().toString());
		JsonArray dataArray = null;
		if (obj.has("data")) {
			dataArray = obj.get("data").getAsJsonArray();
			System.out.println(dataArray.size());
			for (int i = 0; i < dataArray.size(); i++) {

				JsonObject q = (JsonObject) dataArray.get(i);
				String name = q.get("name").getAsString().replaceAll("[\\s\\W]+","");
				JsonArray properties = null;
				if (q.has("properties")) {
					properties = q.get("properties").getAsJsonArray();
					for (int j = 0; j < properties.size(); j++) {
						JsonObject property = (JsonObject) properties.get(j);
						if (property.get("type").getAsString().equals("Swagger")) {
							try {
								String swaggerURL = property.get("url").getAsString();
								System.out.println(swaggerURL);
								if (swaggerURL.substring(0, 5).equals("https")) {

									InstallCert.main(new String[] { swaggerURL.substring(8).split("/")[0] });

								}
								String swaggerSpec = null;

								HttpResponse<String> swaggerResponse = Unirest.get(swaggerURL).asString();
								if (isJson(swaggerResponse))
									swaggerSpec = swaggerResponse.getBody();
								else if (isYaml(swaggerResponse)){
									swaggerSpec = swaggerResponse.getBody();
									swaggerSpec = CommonUtils.convertYamlToJson(swaggerSpec);
								}
								if(swaggerSpec != null)
								CommonUtils.saveOpenAPIDefinition(folder, swaggerSpec, name);
							} catch (Exception e) {
								e.printStackTrace();
							}

						}
					}
				}

			}
		}
	}

	// https://www.ietf.org/mail-archive/web/media-types/current/msg00688.html
	private static boolean isYaml(HttpResponse<String> swaggerResponse) {
		List<String> contentType = swaggerResponse.getHeaders().get("Content-Type");
		if (contentType.contains("text/vnd.yaml") || contentType.contains("text/yaml")
				|| contentType.contains("text/x-yaml") || contentType.contains("application/x-yaml"))
			return true;
		return false;

	}

	private static boolean isJson(HttpResponse<String> swaggerResponse) {
		List<String> contentType = swaggerResponse.getHeaders().get("Content-Type");
		if (contentType.contains("application/json"))
			return true;
		return false;

	}

}
