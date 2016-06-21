package som.apidiscoverer.util;

import java.io.InputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import edu.smu.tspell.wordnet.Synset;
import edu.smu.tspell.wordnet.WordNetDatabase;

public class WordsUtils {
	public static boolean hasAMeaning(String word) throws URISyntaxException{
		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
		String resHomeImgPath = servletContext.getRealPath("resources/WordNet-3.0/dict");
		System.setProperty("wordnet.database.dir",resHomeImgPath);
		
		WordNetDatabase database = WordNetDatabase.getFileInstance();
		Synset[] synsets = database.getSynsets(word);
		
		if (synsets.length > 0)
		{
		return true;
		}
		return false;
		
	}
	public static boolean isPathParameter(String arg) {
		try {
			Integer.parseInt(arg);
			return true;
		} catch (NumberFormatException e) {
		
		}
		try {
			Long.parseLong(arg);
			return true;
		} catch (NumberFormatException ee) {

		}
		if(arg.matches("[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}"))
			return true;
		if(arg.matches("[0-9a-f]+"))
		return true;
	
		return false;
	}
}
