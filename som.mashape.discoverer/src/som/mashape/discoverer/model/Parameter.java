package som.mashape.discoverer.model;

import core.JsonDataType;

public class Parameter {
	
	private String name; 
	private String type;
	private boolean array;
	private String value;
	private boolean required;
	private ParameterLocation location;
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public JsonDataType discoverType (){
		String regex = "[0-9]+";
		if(value.matches(regex)){
			return JsonDataType.INTEGER;
		}
		return JsonDataType.STRING;
	}
	public boolean isRequired() {
		return required;
	}
	public void setRequired(boolean required) {
		this.required = required;
	}
	public ParameterLocation getLocation() {
		return location;
	}
	public void setLocation(ParameterLocation location) {
		this.location = location;
	}
	public boolean isArray() {
		return array;
	}
	public void setArray(boolean array) {
		this.array = array;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
