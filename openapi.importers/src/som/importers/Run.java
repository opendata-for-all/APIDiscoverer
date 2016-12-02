package som.importers;

import som.importers.utils.APIGuruUtils;
import som.importers.utils.APIIOUtils;

public class Run {

	public static void main(String[] args) throws Exception {
		APIGuruUtils.importDefinitions("api-guru");
		APIIOUtils.importDefinitions("apis-io");

	}

}
