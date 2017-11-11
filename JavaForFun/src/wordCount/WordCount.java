/**
 * 
 */
package wordCount;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author SantoshKumar
 *
 */
public class WordCount {

	private static void displayCount(List<Entry<String, Integer>> list) {

		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " - " + entry.getValue());

		}

	}

	public static void countWords(BufferedReader br) throws IOException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String line = "";
		String[] words = new String[500];
		int count = 1;
		while ((line = br.readLine()) != null) {
			words = line.split(" ");

			for (String s : words) {
				String tempLine = s.replaceAll("[^a-zA-Z]", "");
				if (!tempLine.isEmpty()) {
					if (!map.containsKey(tempLine)) {
						map.put(tempLine, count);
					} else {
						int tempCount = map.get(tempLine).intValue();
						map.put(tempLine, tempCount + 1);
					}
				}
			}

			words = new String[500];
		}

		sortMap(map);
	}

	private static void sortMap(HashMap<String, Integer> map) {

		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o2.getValue().compareTo(o1.getValue());
			}

		});

		displayCount(list);
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fStream = new FileInputStream("../JavaForFun/inputFile/test.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fStream));

		countWords(br);

	}

}
