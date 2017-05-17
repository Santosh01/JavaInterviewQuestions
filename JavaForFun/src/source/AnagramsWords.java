package source;


import java.util.Arrays;

public class AnagramsWords {

	public static void anagramWords(String[] inpWords) {
		int length = inpWords.length;
		char[] inpChar;
		String ab = "";
		for (int j = 0; j < length; j++) {
			inpChar = inpWords[j].toLowerCase().toCharArray();
			Arrays.sort(inpChar);
			ab = String.valueOf(inpChar);
			if (ab.length() != 0) {
				for (int i = 0; i < length - 1; i++) {
					if (inpWords[i + 1].equals(ab)) {
						System.out.println("Palindrome words found: " + ab + " :in array: " + inpWords[i + 1]);

					}
				}

			}
		}
	}

	public static void main(String[] args) {
		String[] inpString = { "tea", "ate", "java", "vaja", "Santosh", "aet" };
		anagramWords(inpString);
	}
}
