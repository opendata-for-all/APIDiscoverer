package som.apidiscoverer.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.math3.util.CombinatoricsUtils;


import core.Path;
import core.Root;

public class DiscoveryUtil {

	public static List<List<Path>> discoverPathParameters(Root root) {

		List<Path> allPaths = root.getApi().getPaths();
		List<List<Path>> finalList = new ArrayList<List<Path>>();

		Map<Path, String[]> map = new HashMap<Path, String[]>();
		Map<Integer, List<Path>> sizeCluster = new HashMap<Integer, List<Path>>();

		for (Path path : allPaths) {
			map.put(path, path.getPattern().substring(1).split("/"));
		}
		for (Entry<Path, String[]> entry : map.entrySet()) {
			if (sizeCluster.get(entry.getValue().length) != null)
				sizeCluster.get(entry.getValue().length).add(entry.getKey());
			else {
				sizeCluster.put(entry.getValue().length, new ArrayList<Path>());
				sizeCluster.get(entry.getValue().length).add(entry.getKey());

			}
		}
		for (Entry<Integer, List<Path>> entry : sizeCluster.entrySet()) {
			if (entry.getValue().size() >= 5) {
				for (int i = entry.getValue().size(); i >= 5; i--) {
					Iterator<int[]> iterator = CombinatoricsUtils.combinationsIterator(entry.getValue().size(), i);
					List<List<Path>> allCombins = new ArrayList<List<Path>>();
					while (iterator.hasNext()) {
						List<Path> paths = new ArrayList<Path>();
						int[] combin = iterator.next();
						for (int j : combin) {
							paths.add(entry.getValue().get(j));
						}
						allCombins.add(paths);
						for (Path p : paths) {
						}
						List<Boolean> commonSegments = discoverCommonSergments(paths, entry.getKey());
						if (Collections.frequency(commonSegments, false) == 1 && !isSublist(paths, finalList)) {
							finalList.add(paths);
						}
					}

				}
			}
		}
				
		return finalList;
	}

	public static List<Boolean> discoverCommonSergments(List<Path> paths, int length) {
		Map<Path, String[]> segments = new HashMap<Path, String[]>();
		List<Boolean> commonPart = new ArrayList<Boolean>();
		for (Path path : paths) {
			segments.put(path, path.getPattern().substring(1).split("/"));

		}

		for (int i = 0; i < length; i++) {
			commonPart.add(i, true);
			String initValue = "";
			for (java.util.Map.Entry<Path, String[]> entry : segments.entrySet()) {
				if (initValue.equals("")) {
					initValue = entry.getValue()[i];
				} else if (!initValue.equals(entry.getValue()[i])) {
					commonPart.set(i, false);
					break;
				}

			}
		}
		for (boolean b : commonPart)
			System.out.println(b);
		return commonPart;
	}
	public static boolean isSublist(List<Path> sublist, List<List<Path>> listOflists) {
		for(List<Path> list: listOflists)
		if(list.containsAll(sublist))
			return true;
	
			return false;
	}

}
