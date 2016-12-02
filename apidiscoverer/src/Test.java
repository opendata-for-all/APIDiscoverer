import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import som.apidiscoverer.model.HttpMethod;
import som.apidiscoverer.model.JSONAPICallExample;

public class Test {

	public static void main(String[] args) {
		
		JSONAPICallExample test = new JSONAPICallExample("url", HttpMethod.DELETE, "test Body", "200", "response body");
		
		 final GsonBuilder builder = new GsonBuilder().setPrettyPrinting();
		    final Gson gson = builder.create();
		    String json = gson.toJson(test);
System.out.println(json);

JSONAPICallExample generated = gson.fromJson(json, JSONAPICallExample.class);

System.out.println(generated);
	}

}
