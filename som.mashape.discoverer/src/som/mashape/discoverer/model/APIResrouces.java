package som.mashape.discoverer.model;

import com.google.gson.JsonObject;

import core.Api;

public class APIResrouces {
	
	private Api api;
	private JsonObject metadata;
	private String title;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public JsonObject getMetadata() {
		return metadata;
	}
	public void setMetadata(JsonObject metadata) {
		this.metadata = metadata;
	}
	public Api getApi() {
		return api;
	}
	public void setApi(Api api) {
		this.api = api;
	}

}
