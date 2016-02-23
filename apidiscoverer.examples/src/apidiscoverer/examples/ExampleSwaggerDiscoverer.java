package apidiscoverer.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONObject;
import org.yaml.snakeyaml.Yaml;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import jsondiscoverer.JsonSimpleDiscoverer;
import jsondiscoverer.JsonSource;
import jsondiscoverer.util.ModelHelper;
import som.swagger.core.Api;
import apidiscoverer.utils.SwaggerUtils;


public class ExampleSwaggerDiscoverer {
	/**
	 * Main method to launch the example
	 * 
	 * @param args The main args. None is needed
	 * @throws FileNotFoundException Thrown if the file is not found
	 * @throws UnirestException 
	 */
	public static void main(String[] args) throws FileNotFoundException, UnirestException {
		System.setProperty("javax.net.ssl.trustStore","clientTrustStore.key");

		System.setProperty("javax.net.ssl.trustStorePassword","qwerty");
//		ExampleSwaggerDiscoverer.exampleDiscover();
		apiIODiscover();
	}
	
	/**
	 * Launches the example
	 * 
	 * @throws FileNotFoundException Thrown if the file is not found
	 */
	public static void exampleDiscover() throws FileNotFoundException {
		JsonSource source = new JsonSource("petstore");
		source.addJsonData(null, new FileReader(new File("./exampleData/swagger/petstore.json")));

//		JsonSimpleDiscoverer discoverer = new JsonSimpleDiscoverer();
//		EPackage ePackage = discoverer.discover(source);
		Api petStoreApi = SwaggerUtils.getModelFromJson((new JsonParser()).parse(new JsonReader(new FileReader(new File("./exampleData/swagger/petstore.json")))).getAsJsonObject());
	
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    ResourceSet resSet = new ResourceSetImpl();
	    
	    Resource resource = resSet.createResource(URI
	            .createURI("./exampleData/swagger/petstore.xmi"));
	    resource.getContents().add(petStoreApi);
	    try {
	        resource.save(Collections.EMPTY_MAP);
	      } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }

	}

	public static void apiIODiscover() throws FileNotFoundException, UnirestException {
		HttpResponse<JsonNode> response = Unirest.get("http://apis.io/api/search")
		  .queryString("q", "")
		  .queryString("swagger", "true")
		  .queryString("limit",1000)
		  .asJson();
		JsonParser parser = new JsonParser();
		JsonObject obj = (JsonObject) parser.parse(response.getBody().toString());
		JsonArray dataArray = null;
		if (obj.has("data")) {
			dataArray = obj.get("data").getAsJsonArray();

			for (int i = 0; i < dataArray.size(); i++) {

				JsonObject q = (JsonObject) dataArray.get(i);
				String name = q.get("name").getAsString();
				// d.setDescription((q.has("description"))?q.get("description").getAsString():"");
				JsonArray properties = null;
				if (q.has("properties")) {
					properties = q.get("properties").getAsJsonArray();
					for (int j = 0; j < properties.size(); j++) {
						JsonObject property = (JsonObject) properties.get(j);
						if (property.get("type").getAsString().equals("Swagger")) {
							String swaggerURL = property.get("url").getAsString();
							
							String swaggerSpec = null;
							try {
//								swaggerSpec = Unirest.get(swaggerURL).asString().getBody();
								swaggerSpec = encodeFromURL(new URL(swaggerURL));
								if(swaggerURL.endsWith("yaml"))
									swaggerSpec = convertToJson(swaggerSpec);
								System.out.println(swaggerSpec);
								Api api = SwaggerUtils.getModelFromJson((new JsonParser()).parse(swaggerSpec).getAsJsonObject());
								SwaggerUtils.saveModel(api, name.trim(), "./api.io");
							} catch (Exception e) {
								e.printStackTrace();
							}

						}
					}
				}


			}
		}


		
//		HttpResponse<JsonNode> responseSSL = Unirest.get("https://developers.lotadata.com/swagger/spec/events_firehose.json")
//				  .asJson();
//				System.out.println(responseSSL.getBody());
	
	}
	
	private static String encodeFromURL(URL url) throws Exception {
		URLConnection uc = url.openConnection();
		uc.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));

		String inputLine;
		String result = "";
		while ((inputLine = in.readLine()) != null)
			result += inputLine+"\n";
		in.close();

		return result;
	}
	private static String convertToJson(String yamlString) {
	    Yaml yaml= new Yaml();
	    System.out.println(yamlString);
	    Map map= (Map) yaml.load(yamlString);

	    JSONObject jsonObject=new JSONObject(map);
	    return jsonObject.toString();
	}
}
