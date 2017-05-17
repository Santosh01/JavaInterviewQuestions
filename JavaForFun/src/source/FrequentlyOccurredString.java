package source;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author
 * 
 */
public class FrequentlyOccurredString {

	static List<Entry<String, Integer>> listOfWords = new ArrayList<Entry<String, Integer>>();

	public static void sortMap(HashMap<String, Integer> inputMap) {

		listOfWords = new ArrayList<Entry<String, Integer>>(inputMap.entrySet());
		Collections.sort(listOfWords,
				new Comparator<Map.Entry<String, Integer>>() {
					public int compare(Map.Entry<String, Integer> obj1,
							Map.Entry<String, Integer> obj2) {
						int value = (obj2.getValue()).compareTo(obj1.getValue());
						return value;
					}
				});

	}

	public static void printMap(List<Entry<String, Integer>> list) {
		int count = 0;
		for (Map.Entry<String, Integer> wordOccurrence : list) {
			if (count <= 5) {
				System.out.println("'" + wordOccurrence.getKey() + "' - " + ""
						+ wordOccurrence.getValue());
			}
			if (count == 5) {
				break;
			}
			count++;
		}
	}

	public static void findFrequentlyOccurredString(String inpString,
			String dictionaryString) {

		String tempString = "";
		int DEFAULT_VALUE = 1;

		String[] storeStringToken = inpString.replace("   ", "").trim()
				.split(" ");
		HashMap<String, Integer> countStringOccurrence = new HashMap<String, Integer>();

		for (int i = 0; i < storeStringToken.length; i++) {
			// insert all new words to hashmap
			if (!countStringOccurrence.containsKey(storeStringToken[i])) {

				if (!dictionaryString.toLowerCase().contains(
						storeStringToken[i].toLowerCase())) {

					tempString = storeStringToken[i];
					countStringOccurrence.put(tempString.trim(), DEFAULT_VALUE);

				}
			}

			// else process existing words from hashmap
			else {

				tempString = storeStringToken[i];
				for (Map.Entry<String, Integer> mapEntry : countStringOccurrence
						.entrySet()) {
					// check if the key already there
					if (mapEntry.getKey().equals(tempString)) {
						int keyOccurrence = mapEntry.getValue();
						keyOccurrence++;
						countStringOccurrence.put(tempString, keyOccurrence);
					}
				}

			}

		}

		// sort hashmap in decending order
		sortMap(countStringOccurrence);

		// print hashMap
		printMap(listOfWords);

	}

	public static void main(String[] args) {
		String inp = "Santosh Santosh It is globally known for its Web portal, search engine Yahoo! Search, and related services, including Yahoo! Directory, Yahoo! Mail, Yahoo! News, Yahoo! Finance, Yahoo! Groups, Yahoo! Answers, advertising, online mapping, video sharing, fantasy sports, and its social media website.";
		String dictionary = "andtheinorbetweenisaMrtheretheirthemthosetheybyonbutduringafterbeforeassuchreturnsfollowsfromtoaboveofoffwantsbecauseitsknown";
		inp = inp.replaceAll("[^a-zA-Z\\s]", "");
		findFrequentlyOccurredString(inp, dictionary);

	}

}
