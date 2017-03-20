package som.apidiscoverer.model;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.commons.lang3.StringEscapeUtils;

import core.CollectionFormat;
import core.JSONDataType;

public class Parameter {

	private String name;
	private String value;
	private JSONDataType type;
	private String format;
	private CollectionFormat collectionFormat;
	private boolean array;

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

	public void discoverParameter() throws UnsupportedEncodingException {
		value = URLDecoder.decode(value, "UTF-8");
		if (value.contains(",")) {
			array = true; 
			type = discoverType(value.substring(0,value.indexOf(",")));
			format = discoverFormat(type, value.substring(0,value.indexOf(",")));
			collectionFormat = CollectionFormat.CSV;

		} else {
			if (value.contains(" ")) {
				array = true; 
				type = discoverType(value.substring(0,value.indexOf(" ")));
				format = discoverFormat(type, value.substring(0,value.indexOf(" ")));
				collectionFormat = CollectionFormat.SSV;
			} else {
				if (value.contains("\\")) {
					array = true; 
					type = discoverType(value.substring(0,value.indexOf("\\")));
					format = discoverFormat(type, value.substring(0,value.indexOf("\\")));
					collectionFormat = CollectionFormat.TSV;
				} else {
					if (value.contains("|")) {
						array = true; 
						type = discoverType(value.substring(0,value.indexOf("|")));
						format = discoverFormat(type, value.substring(0,value.indexOf("|")));
						collectionFormat = CollectionFormat.TSV;
					}
					else 
					{
						type = discoverType(value);
						format = discoverFormat(type, value);
					}
				}
			}
		}
	
	}
	


	public boolean isArray() {
		return array;
	}

	public void setArray(boolean array) {
		this.array = array;
	}

	public JSONDataType getType() {
		return type;
	}

	public void setType(JSONDataType type) {
		this.type = type;
	}

	public CollectionFormat getCollectionFormat() {
		return collectionFormat;
	}

	public void setCollectionFormat(CollectionFormat collectionFormat) {
		this.collectionFormat = collectionFormat;
	}

	private String discoverFormat(JSONDataType type, String value) {
		if (type.equals(JSONDataType.INTEGER)) {
			try {
				Integer.valueOf(value);
				return "32";
			} catch (NumberFormatException e) {

			}
			try {
				Long.valueOf(value);
				return "64";
			} catch (NumberFormatException e) {

			}
		}
		if (type.equals(JSONDataType.NUMBER)) {
			Float number = Float.parseFloat(value);
			if (!number.isInfinite())
				return "32";
			else
				return "64";

		}
		return "";
	}

	private JSONDataType discoverType(String value) {

		if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) {
			return JSONDataType.BOOLEAN;
		}
		try {
			Integer.valueOf(value);
			return JSONDataType.INTEGER;

		} catch (NumberFormatException e) {
			try {
				Long.valueOf(value);
				return JSONDataType.INTEGER;
			} catch (NumberFormatException ee) {
				try {
					Float.valueOf(value);
					return JSONDataType.NUMBER;
				} catch (NumberFormatException eee) {
					try {
						Double.valueOf(value);
						return JSONDataType.NUMBER;
					} catch (NumberFormatException eeee) {
						return JSONDataType.STRING;
					}
				}
			}
		}

	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parameter other = (Parameter) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static JSONDataType getGeneralType(JSONDataType type1, JSONDataType type2) {
		
		
		return (type1.getValue() >= type2.getValue())? type1:type2;
	}

}
