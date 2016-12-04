package som.mashape.discoverer.model;

public enum ParameterLocation {

	PATH("Path"), QUERY("Query"), BODY("body");
	private String label;

	private ParameterLocation(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
