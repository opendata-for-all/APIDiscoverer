package som.importers.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Map.Entry;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONObject;
import org.yaml.snakeyaml.Yaml;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class APIGuruUtils {

	public static void importDefinitions(String folder) throws UnirestException {
		HttpResponse<JsonNode> response = Unirest.get("https://api.apis.guru/v2/list.json")
				.asJson();
		JsonParser parser = new JsonParser();
		JsonObject obj = (JsonObject) parser.parse(response.getBody().toString());
		for (Entry<String, JsonElement> element : obj.entrySet()) {
			JsonObject api = element.getValue().getAsJsonObject();
			if (api.has("versions")) {
				for (Entry<String, JsonElement> version : api.get("versions").getAsJsonObject().entrySet()) {
					String swaggerUrl = version.getValue().getAsJsonObject().get("swaggerUrl").getAsString();
					swaggerUrl = "http" + swaggerUrl.substring(5);
					String title = version.getValue().getAsJsonObject().get("info").getAsJsonObject().get("title").getAsString()+ 
							version.getValue().getAsJsonObject().get("info").getAsJsonObject().get("version").getAsString();
					title = title.replaceAll("[\\s\\W]+","");
					try {
						String swaggerSpec = CommonUtils.encodeFromURL(new URL(swaggerUrl));
						if (swaggerUrl.endsWith("yaml"))
							swaggerSpec = CommonUtils.convertYamlToJson(swaggerSpec);
						CommonUtils.saveOpenAPIDefinition(folder,swaggerSpec,title);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
}
