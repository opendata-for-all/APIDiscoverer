package som.apidiscoverer.model;

import java.util.ArrayList;
import java.util.List;

public class Response {
private List<Header> headers;
private int status;
private String statusText;
private String body;


public Response() {
	headers = new ArrayList<Header>();
}
public List<Header> getHeaders() {
	return headers;
}
public void setHeaders(List<Header> headers) {
	this.headers = headers;
}


public String getBody() {
	return body;
}
public void setBody(String body) {
	this.body = body;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getStatusText() {
	return statusText;
}
public void setStatusText(String statusText) {
	this.statusText = statusText;
}
public String getStatusWithMessage(){
	return ""+status+" "+statusText;
}
}
