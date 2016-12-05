package som.apidiscoverer.model;

import core.JSONDataType;

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
	
	public JSONDataType getType (){
		String regex = "[0-9]+";
		if(value.matches(regex)){
			return JSONDataType.INTEGER;
		}
		return JSONDataType.STRING;
	}
	
	

}
