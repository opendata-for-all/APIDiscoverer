package som.apidiscoverer.model;

import core.JsonDataType;

public class Parameter {
	
	private String name; 
	private String value;
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
	
	public JsonDataType getType (){
		String regex = "[0-9]+";
		if(value.matches(regex)){
			return JsonDataType.INTEGER;
		}
		return JsonDataType.STRING;
	}
	
	

}
