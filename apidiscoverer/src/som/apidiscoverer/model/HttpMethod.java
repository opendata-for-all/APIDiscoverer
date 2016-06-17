package som.apidiscoverer.model;

public enum HttpMethod {

	GET("Get"), POST("Post"), PUT("Put"), DELETE("Delete");
	private String label;

	private HttpMethod(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
