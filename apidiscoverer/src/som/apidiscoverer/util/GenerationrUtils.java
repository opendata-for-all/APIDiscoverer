package som.apidiscoverer.util;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.faces.spi.DiscoverableInjectionProvider;

import core.APIKeyLocation;
import core.Api;
import core.CollectionFormat;
import core.Contact;
import core.CoreFactory;
import core.CorePackage;
import core.Example;
import core.ExternalDocs;
import core.Header;
import core.Info;
import core.Items;
import core.JsonDataType;
import core.License;
import core.OAuth2FlowType;
import core.APIOperation;
import core.APIParameter;
import core.ParameterLocation;
import core.Path;
import core.Response;
import core.Schema;
import core.SchemeType;
import core.Scope;
import core.SecurityRequirement;
import core.SecuritySchema;
import core.SecuritySchemeType;
import core.Tag;
import core.XMLElement;

public class GenerationrUtils {


	public static JsonObject getJsonFromSwaggerModel(Api api) {
JsonObject jsonObject = new JsonObject();
jsonObject.addProperty("swagger", api.getSwagger());
jsonObject.addProperty("host", api.getHost());
jsonObject.addProperty("basePath", api.getBasePath());
if(!api.getPaths().isEmpty()){
	JsonObject jsonPaths = new JsonObject();
	jsonObject.add("paths",jsonPaths);
	generatePaths(api,jsonPaths);
	
}
		return jsonObject;

	}

	private static void generatePaths(Api api, JsonObject jsonPaths) {
		for(Path path: api.getPaths()){
			JsonObject jsonOperations = new JsonObject();
			jsonPaths.add(path.getPattern(), jsonOperations);
			generateOperations(path,jsonOperations);
		}
		
	}

	private static void generateOperations(Path path, JsonObject jsonOperations) {
		if(path.getGet()!= null){
			JsonObject jsonOperation = new JsonObject();
			jsonOperations.add("get", jsonOperation);
			
		}
	}

	
	

}
