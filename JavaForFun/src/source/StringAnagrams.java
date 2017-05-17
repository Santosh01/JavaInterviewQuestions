package source;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringAnagrams {

	public static void iterateHashMap(Map<String, String> mp1) {

		String[] words = null;
		for (Entry<String, String> value : mp1.entrySet()) {
				for (Entry<String, String> value1 : mp1.entrySet()) {
					if (value.getKey() != value1.getKey() && value.getValue().contains(value1.getValue())) {
						System.out.println(value.getKey() + " : " + value.getValue());

					}
				}
			}

		}
	

	public static void findAnagram(String[] inp) {

		Map<String, String> mp = new HashMap<String, String>();
		char[] sortString = null;
		for (int i = 0; i < inp.length; i++) {

			sortString = inp[i].toCharArray();
			Arrays.sort(sortString);
			mp.put(inp[i], new String(sortString));

		}
		iterateHashMap(mp);

	}

	public static void main(String[] args) {
		String[] inpWords = { "star", "dog", "car", "rats", "ars", "santosh", "hsotnas" };
		Arrays.sort(inpWords);
		findAnagram(inpWords);

	}

}
