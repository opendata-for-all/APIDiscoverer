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
}
