package som.apidiscoverer.util;

import java.io.UnsupportedEncodingException;
import java.util.List;

import core.OpenAPIFactory;
import core.Parameter;
import core.ParameterLocation;
import core.Path;
import core.Root;
import core.Schema;

public class OpenAPIUtils {
	
	public static Path mergePaths(List<Path> paths) {
		Path merged = null;
		for(Path path: paths) {
			if(merged == null) {
				merged = path;
			}
			else
			{
				if(path.getGet() != null) {
					if(merged.getGet() == null) {
						merged.setGet(path.getGet());
					}
					else {
						// TODO merger operations
					}
				}
				if(path.getPost() != null) {
					if(merged.getPost() == null) {
						merged.setPost(path.getPost());
					}
					else {
						// TODO merger operations
					}
				}
				if(path.getPut() != null) {
					if(merged.getPut() == null) {
						merged.setPut(path.getPut());
					}
					else {
						// TODO merger operations
					}
				}
				if(path.getDelete() != null) {
					if(merged.getDelete() == null) {
						merged.setDelete(path.getDelete());
					}
					else {
						// TODO merger operations
					}
				}
			}
		}
		return merged;
		
	}
	public static Path replaceSegementByPathParameter(Path path, int segmentIndex, OpenAPIFactory factory, Root root) throws UnsupportedEncodingException {
		String[] segments = path.getPattern().substring(1).split("/");
		String paramName = segments[segmentIndex - 1];
		String paramValue = segments[segmentIndex];
		segments[segmentIndex] = "{"+paramName+"}";
		som.apidiscoverer.model.Parameter parameter = new som.apidiscoverer.model.Parameter();
		parameter.setName(paramName);
		parameter.setValue(paramValue);
		parameter.discoverParameter();
		String newPattern = "";
		for(String segment: segments) {
			newPattern += "/"+segment;
		}
		path.setPattern(newPattern);
		if(path.getGet() != null) {
			Parameter apiParameter = factory.createParameter();
			apiParameter.setLocation(ParameterLocation.PATH);
			apiParameter.setName(parameter.getName());
			apiParameter.setType(parameter.getType());
			apiParameter.setRequired(true);
			path.getGet().getParameters().add(apiParameter);
			apiParameter.setDeclaringContext(path.getGet());
			root.getParamters().add(apiParameter);
			
		}
		if(path.getPost() != null) {
			Parameter apiParameter = factory.createParameter();
			apiParameter.setLocation(ParameterLocation.PATH);
			apiParameter.setName(parameter.getName());
			apiParameter.setType(parameter.getType());
			apiParameter.setRequired(true);
			path.getPost().getParameters().add(apiParameter);
			apiParameter.setDeclaringContext(path.getPost());
			root.getParamters().add(apiParameter);
			
		}
		if(path.getPut() != null) {
			Parameter apiParameter = factory.createParameter();
			apiParameter.setLocation(ParameterLocation.PATH);
			apiParameter.setName(parameter.getName());
			apiParameter.setType(parameter.getType());
			apiParameter.setRequired(true);
			path.getPut().getParameters().add(apiParameter);
			apiParameter.setDeclaringContext(path.getPut());
			root.getParamters().add(apiParameter);
			
		}
		if(path.getDelete() != null) {
			Parameter apiParameter = factory.createParameter();
			apiParameter.setLocation(ParameterLocation.PATH);
			apiParameter.setName(parameter.getName());
			apiParameter.setType(parameter.getType());
			apiParameter.setRequired(true);
			path.getDelete().getParameters().add(apiParameter);
			apiParameter.setDeclaringContext(path.getDelete());
			root.getParamters().add(apiParameter);
			
		}
		return path;
		
	}
	

}
