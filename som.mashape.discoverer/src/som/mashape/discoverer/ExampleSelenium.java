package som.mashape.discoverer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

import com.mashape.unirest.http.exceptions.UnirestException;



public class ExampleSelenium {
	
	public static void main(String[] args) throws  URISyntaxException, UnirestException, IOException  {
		MashapeDiscoverer mashapeDiscoverer = new MashapeDiscoverer();
		mashapeDiscoverer.discoverAndSaveModel();
		
	}
}
