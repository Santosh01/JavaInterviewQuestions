package source;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordOccurance {

	public static void wordOccurance(String[] inpWord) {

		int strLength = inpWord.length - 1;
		Map<String, Integer> mp = new HashMap<String, Integer>();
		int count = 0;

		for (int i = 0; i <= strLength; i++) {
			mp.put(inpWord[i], count);
			mp.put(inpWord[i], count);
			count++;
		}
		
		for (Entry<String, Integer> en : mp.entrySet()) {
			System.out.print("(" + en.getKey() + "," + en.getValue() + ")");
		}
	}

	public static void main(String[] args) {
		String[] word = { "a", "b", "a", "b", "a", "c" };
		wordOccurance(word);
	}

}
