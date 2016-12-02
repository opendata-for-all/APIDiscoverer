package som.importers.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONObject;
import org.yaml.snakeyaml.Yaml;

import com.google.gson.JsonObject;

public class CommonUtils {

	public static void saveOpenAPIDefinition(String location, String swaggerSpec, String apiTitle) throws IOException{
		
		File file = new File(location+ File.separator + apiTitle + ".json");
		FileWriter fileWritter = new FileWriter(file.getPath(),false);
		BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
		bufferWritter.write(swaggerSpec.toString());
		bufferWritter.close();
		
		
		
	}
	public static String encodeFromURL(URL url) throws Exception {
		String result = "";
		if(url.getProtocol().equals("http")){
		 URLConnection uc = url.openConnection();
		uc.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
		BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));

		String inputLine;
		
		while ((inputLine = in.readLine()) != null)
			result += inputLine+"\n";
		in.close();
		}
		else {
			 HttpsURLConnection uc = (HttpsURLConnection)url.openConnection();
				uc.addRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)");
				BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream()));

				String inputLine;
				result = "";
				while ((inputLine = in.readLine()) != null)
					result += inputLine+"\n";
				in.close();
		}
		return result;
	}
	public static String convertYamlToJson(String yamlString) {
	    Yaml yaml= new Yaml();
//	    System.out.println(yamlString);
	    Map map= (Map) yaml.load(yamlString);

	    JSONObject jsonObject=new JSONObject(map);
	    return jsonObject.toString();
	}
}
