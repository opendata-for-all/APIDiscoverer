package som.apidiscoverer.model;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import som.apidiscoverer.util.WordsUtils;

public class APIRequest {

	private String url;
	private HttpMethod httpMethod;
	private List<Parameter> queryParameters;
	private List<Parameter> pathParameters;
	private List<Header> headers;
	public List<String> paths;
	private Response response;
	private String body;
	private String protocol;
	private String host;
	private String path;
	private String query;
	private String openAPIPath;
	private String basePath;

	public APIRequest() {
		queryParameters = new ArrayList();
		pathParameters = new ArrayList<>();
		paths = new ArrayList<>();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) throws MalformedURLException {

		this.url = url;
	

	}
	public void decode() throws MalformedURLException {
		discoverURL(url);
		
	}

	private void discoverURL(String url) throws MalformedURLException {
		URL httpURL = new URL(url);
		protocol = httpURL.getProtocol();
		path = httpURL.getPath();
		host = httpURL.getHost();
		query = httpURL.getQuery();
		if (query != null && !query.equals(""))
			discoverQueryParameters();
		if (path != null && !path.equals(""))
			discoverPaths();
		discoverPathParameters();
		basePath = "/"+paths.get(0);
		discoverOpenAPIPath();
	}

	private void discoverOpenAPIPath() {
	openAPIPath = "";
		for (int i = 1; i < paths.size(); i++){
		if(!WordsUtils.isPathParameter(paths.get(i))){
			openAPIPath += "/";
			openAPIPath += paths.get(i);
		}
		else {
			openAPIPath += "/{"+getPathParameterName(paths.get(i))+"}";
		}
		}
		
	}
	public String getSchemaName() throws URISyntaxException {
			for (int i = paths.size() -1; i >= 0 ; i--){
			if(WordsUtils.hasAMeaning(paths.get(i))){
				return paths.get(i);
			}
			}
			return "unkown";
			
		}

	private void discoverPaths() {
		String[] pathParts = path.substring(1).split(Pattern.quote("/"));
		for (String pathPart : pathParts) {
			paths.add(pathPart);
		}
	}

	private void discoverQueryParameters() {
		String[] params = query.split(Pattern.quote("&"));
		for (String param : params) {
			String[] values = param.split(Pattern.quote("="));
			Parameter parameter = new Parameter();
			parameter.setName(values[0]);
			if (values.length == 2) {
				parameter.setValue(values[1]);
			} else
				parameter.setValue("");
			queryParameters.add(parameter);
		}

	}

	public HttpMethod getHttpMethod() {
		return httpMethod;
	}

	public void setHttpMethod(HttpMethod httpMethod) {
		this.httpMethod = httpMethod;
	}

	public List<Header> getHeaders() {
		return headers;
	}

	public void setHeaders(List<Header> headers) {
		this.headers = headers;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public List<String> getPaths() {
		return paths;
	}

	public void setPaths(List<String> paths) {
		this.paths = paths;
	}

	public void discoverPathParameters() {
		for (String temp: paths) {
			if(WordsUtils.isPathParameter(temp)){
				Parameter parameter = new Parameter();
				parameter.setName(getPathParameterName(temp));
				parameter.setValue(temp);
				pathParameters.add(parameter);
			}
		}

	}

	public String getPathParameterName(String temp) {
		return getPathParameterParent(temp)+"Id";
	}

	
	public String getPathParameterParent(String pathParameter) {
		int index = paths.indexOf(pathParameter);
		if(index > 0){
			return paths.get(index-1);
			
		}
		return "path";
		

	}



	public List<Parameter> getQueryParameters() {
		return queryParameters;
	}

	public void setQueryParameters(List<Parameter> queryParameters) {
		this.queryParameters = queryParameters;
	}

	public List<Parameter> getPathParameters() {
		return pathParameters;
	}

	public void setPathParameters(List<Parameter> pathParameters) {
		this.pathParameters = pathParameters;
	}

	public String getOpenAPIPath() {
		return openAPIPath;
	}

	public void setOpenAPIPath(String openAPIPath) {
		this.openAPIPath = openAPIPath;
	}

	public String getBasePath() {
		return basePath;
	}

	public void setBasePath(String basePath) {
		this.basePath = basePath;
	}

	

}
