package som.mashape.discoverer.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.gson.JsonObject;

import core.Api;
import som.mashape.discoverer.model.APIResrouces;

public class ModelUtils {
//	public static void saveModel(Api api, String modelName, String location) throws FileNotFoundException {
//
//		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
//		Map<String, Object> m = reg.getExtensionToFactoryMap();
//		m.put("xmi", new XMIResourceFactoryImpl());
//		ResourceSet resSet = new ResourceSetImpl();
//
//		Resource resource = resSet.createResource(URI.createURI(location + File.separator + modelName + ".xmi"));
//		resource.getContents().add(api);
//		try {
//			resource.save(Collections.EMPTY_MAP);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
	
	public static void saveModel(JsonObject msendJson, String location, String title) throws IOException{
		File temp = new File(location+"/"+title+".json");
		FileWriter fileWritter = new FileWriter(temp.getPath(), true);
		BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
		bufferWritter.write(msendJson.toString());
		bufferWritter.close();
	 }
}
