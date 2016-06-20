package som.apidiscoverer.util;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
 
/**
 * Custom JSF Validator for URL input
 */
@FacesValidator("som.apidiscoverer.util.URLValidator")
public class URLValidator implements Validator {
 
  
  
	@Override
	   public void validate(FacesContext facesContext,
	      UIComponent component, Object value)
	      throws ValidatorException {

	      StringBuilder url = new StringBuilder();
	      String urlValue = value.toString();

	      if(!urlValue.startsWith("http://", 0)){
	         url.append("http://");
	      }
	      url.append(urlValue);

	      try {
	         new URI(url.toString());
	      } catch (URISyntaxException e) {
	         FacesMessage msg =
	            new FacesMessage("URL validation failed","Invalid URL format");
	         msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	         throw new ValidatorException(msg);
	      }
	   }
	public String getValidatorId() {
        return "custom.urlValidator";
    }
}
