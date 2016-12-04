package som.mashape.discoverer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;

import org.apache.commons.collections.map.HashedMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import core.Api;
import core.CoreFactory;
import core.CorePackage;
import som.mashape.discoverer.model.APIRequest;
import som.mashape.discoverer.model.APIResrouces;
import som.mashape.discoverer.utils.MashapeUtils;
import som.mashape.discoverer.utils.ModelUtils;

public class MashapeDiscoverer {
	private WebDriver driver;
	private String baseUrl;
	List<Api> apiList = new ArrayList<Api>();
	CoreFactory factory;

	public MashapeDiscoverer() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		CorePackage.eINSTANCE.eClass();
		factory = CoreFactory.eINSTANCE;
		baseUrl = "https://market.mashape.com/";
	}
	
	public void discoverAndSaveModel() throws URISyntaxException, UnirestException, IOException{
		
		for (int i = 1; i <= 86; i++) {

			driver.get(baseUrl + "explore?" + "page=" + i);
			List<WebElement> apis = driver.findElements(By.cssSelector("a.api-click-area"));
			
			// System.out.println(apis.size());
			List<String> urls = new ArrayList<String>();
			for (WebElement api : apis) {
				urls.add(api.getAttribute("href"));
			}

			for (String api : urls) {
				try{
		APIResrouces temp = discoverAPIFromMashapeDocPage(api);
		if(temp!=null){
		JsonObject tempJson = Generator.getJsonFromSwaggerModel(temp.getApi());
		tempJson = Generator.includeMetadData(tempJson, temp.getMetadata());
		ModelUtils.saveModel(tempJson, "mashape", temp.getTitle());
			}
		
		}
				catch(Exception e){
					e.getStackTrace();
				}
		}}
	}

	public APIResrouces discoverAPIFromMashapeDocPage(String url) throws MalformedURLException, URISyntaxException, FileNotFoundException, UnirestException {
		

				driver.navigate().to(url);
				if(!driver.getCurrentUrl().equals(url))
					return null;
				APIResrouces apiResources = new APIResrouces();

				List<WebElement> webElements = driver.findElements(By.className("documentation-container"));
				String apikey = webElements.get(0).getAttribute("data-api-id");
				String apiName = webElements.get(0).getAttribute("data-owner-name");
				String apisonURL = "https://market.mashape.com/api/internal/" + apiName + "/apis/" + apikey
						+ "/current";
				System.out.println(apisonURL);
				HttpResponse<JsonNode> response = Unirest.get(apisonURL).asJson();
				JsonParser parser = new JsonParser();
				JsonObject mashapeJson = (JsonObject) parser.parse(response.getBody().toString());
				Discoverer discoverer = new Discoverer(driver.findElement(By.cssSelector("h1.name")).getText(),
						driver.findElement(By.cssSelector("p.description")).getText());
				apiResources.setApi(discoverer.getApi());
				apiResources.setTitle(driver.findElement(By.cssSelector("h1.name")).getText());
				JsonObject metaData = new JsonObject();
				metaData.add("info",new JsonObject());
				JsonObject info = metaData.get("info").getAsJsonObject();
				info.addProperty("x-logo", driver.findElements(By.className("logo")).get(0).getAttribute("src"));
				WebElement tagsDiv = driver.findElements(By.className("tags")).get(0);
				List<WebElement> tagsList  =  tagsDiv.findElements(By.tagName("a"));
				info.add("x-mashape-categories", new JsonArray());
				
				for(WebElement tag: tagsList){
					info.get("x-mashape-categories").getAsJsonArray().add(tag.getText());
				}
				JsonObject origin = new JsonObject();
				origin.addProperty("format", "mashape");
				origin.addProperty("url", url);
				info.add("x-origin", origin);
				apiResources.setMetadata(metaData);
				apiResources.getApi().setInfo(factory.createInfo());
				apiResources.getApi().getInfo().setTitle(apiResources.getTitle());
				
				apiResources.getApi().getInfo().setDescription(mashapeJson.get("description").getAsString());
				apiResources.getApi().getInfo().setContact(factory.createContact());
				apiResources.getApi().getInfo().getContact().setName(driver.findElements(By.className("owner")).get(0).getText());
				if (mashapeJson.has("website"))
					apiResources.getApi().getInfo().getContact().setUrl(mashapeJson.get("website").getAsString());
				if (mashapeJson.has("endpoints")) {
					JsonObject endpoints = mashapeJson.get("endpoints").getAsJsonObject();
					if (endpoints.has("data")) {
						JsonArray data = endpoints.get("data").getAsJsonArray();
						for (JsonElement dataEntry : data) {
							APIRequest apiRequest = new APIRequest();
							WebElement pathUrl = driver.findElement(By.cssSelector("span.host"));
							System.out.println(pathUrl.getText());
							apiRequest.setHost(pathUrl.getText().substring(8));
							apiRequest.setBasePath("");
							apiRequest = MashapeUtils.getAPIRequestFromMashapeEndPointData(apiRequest,
									dataEntry.getAsJsonObject());
							discoverer.discover(apiRequest);
							
						}
					}
				}

				return apiResources;
			

	
//		 }

	}
 
}
