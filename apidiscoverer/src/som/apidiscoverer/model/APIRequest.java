package som.apidiscoverer.model;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class APIRequest {

	private String url;
	private HttpMethod httpMethod;
	private List<Parameter> parameters;
	private List<Header> headers;
	public List<String> paths;
	private Response response;
	private String body;
	private String protocol;
	private String host;
	private String path;
	private String query;

	public APIRequest() {
		parameters = new ArrayList();
		paths = new ArrayList<>();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) throws MalformedURLException {

		this.url = url;
		discoverURL(url);

	}

	private void discoverURL(String url) throws MalformedURLException {
		URL httpURL = new URL(url);
		protocol = httpURL.getProtocol();
		path = httpURL.getPath();
		host = httpURL.getHost();
		query = httpURL.getQuery();
		if (query != null && !query.equals(""))
			discoverParameters();
		if (path != null && !path.equals(""))
			discoverPaths();
		if (query != null && !query.equals(""))
			discoverParameters();
	}

	private void discoverPaths() {
		String[] pathParts = path.substring(1).split(Pattern.quote("/"));
		for (String pathPart : pathParts) {
			paths.add(pathPart);
		}
	}

	private void discoverParameters() {
		String[] params = query.split(Pattern.quote("&"));
		for (String param : params) {
			String[] values = param.split(Pattern.quote("="));
			Parameter parameter = new Parameter();
			parameter.setName(values[0]);
			if (values.length == 2) {
				parameter.setValue(String.class);
			} else
				parameter.setValue(String.class);
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

	public List<Parameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
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

	public List<String> getPathParameters() {
		discoverPaths();
		List<String> result = new ArrayList<String>();
		for (String temp: paths) {
			if(isId(temp))
				result.add(temp);
		}
		return result;

	}

	private boolean isId(String arg) {
		try {
			Integer.parseInt(arg);
			return true;
		} catch (NumberFormatException e) {
		
		}
		try {
			Long.parseUnsignedLong(arg);
			return true;
		} catch (NumberFormatException ee) {

		}
	
		return false;
	}
	public String getLastMeaningfullWord() {
		discoverPaths();
		
		for (int i = (paths.size() - 1); i >= 0; i--) {
			String temp = paths.get(i);
			if(!isId(temp))
				return temp;
		}
		return null;

	}

}
