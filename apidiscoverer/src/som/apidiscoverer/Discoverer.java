package som.apidiscoverer;

import java.io.File;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.eclipse.emf.ecore.EPackage;

import core.APIOperation;
import core.APIParameter;
import core.Api;
import core.CoreFactory;
import core.CorePackage;
import core.JsonDataType;
import core.ParameterLocation;
import core.Path;
import jsondiscoverer.JsonSimpleDiscoverer;
import jsondiscoverer.JsonSource;
import jsondiscoverer.util.ModelHelper;
import som.apidiscoverer.model.APIRequest;
import som.apidiscoverer.model.Parameter;

public class Discoverer {
	  CoreFactory factory;
	private Api api;
	private EPackage schema;
	public Discoverer() {
		 // Initialize the model
	    CorePackage.eINSTANCE.eClass();
	    // Retrieve the default factory singleton
	     factory = CoreFactory.eINSTANCE;
		api = factory.createApi();
	}
	public void discover(APIRequest apiResquest) throws MalformedURLException{
		discoverBasicInfo(apiResquest);
		discoverPaths(apiResquest);
		discoverSchema(apiResquest);
	}
	private void discoverSchema(APIRequest apiResquest) {
		
			JsonSource source = new JsonSource(apiResquest.getLastMeaningfullWord());
			source.addJsonData(null, new StringReader(apiResquest.getBody()));

			JsonSimpleDiscoverer discoverer = new JsonSimpleDiscoverer();
			setSchema(discoverer.discover(source));
			
		
	}
	private void discoverPaths(APIRequest apiResquest) {
		
		String path = "/";
		for(int i = 1;i<apiResquest.getPaths().size();i++)
			path +=apiResquest.getPaths().get(i);
		Path newPath = factory.createPath();
		newPath.setPattern(path);
		api.getPaths().add(newPath);
		discoverMethod(newPath, apiResquest);
		
	}
	private void discoverMethod(Path path,APIRequest apiResquest) {
		switch(apiResquest.getHttpMethod()){
		case GET: 
		APIOperation apiOperation = factory.createAPIOperation();
		path.setGet(apiOperation);
		discoverPrameters(apiOperation, apiResquest);
			
			break;
		default:
			break;
		}
		
	}
	private void discoverPrameters(APIOperation apiOperation, APIRequest apiResquest) {
		for(Parameter parameter : apiResquest.getParameters()){
			APIParameter apiParameter = factory.createAPIParameter();
			apiParameter.setIn(ParameterLocation.QUERY);
			apiParameter.setName(parameter.getName());
			apiParameter.setType(JsonDataType.STRING);
			apiOperation.getParameters().add(apiParameter);
		}
			
	}
	private void discoverBasicInfo(APIRequest apiResquest) {
		if(api.getHost()== null)
			api.setHost(apiResquest.getHost());
		if(api.getSwagger()== null)
			api.setSwagger("2.0");
		if(api.getBasePath()== null){
			api.setBasePath(apiResquest.getPaths().get(0));
			
		}
	}
	public Api getApi() {
		return api;
	}
	public void setApi(Api api) {
		this.api = api;
	}
	public EPackage getSchema() {
		return schema;
	}
	public void setSchema(EPackage schema) {
		this.schema = schema;
	}
	
}
