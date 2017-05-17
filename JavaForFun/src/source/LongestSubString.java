package source;

import java.util.Arrays;

public class LongestSubString {

	static int findLongestSubString(String str) {
		int[] charMap = new int[256];
		int i = 0, maxLen = 0;
		Arrays.fill(charMap, -1);
		for (int j = 0; j < str.length(); j++) {
			if (charMap[str.charAt(j)] >= i) {

				i = charMap[str.charAt(j)] + 1;
			}

			charMap[str.charAt(j)] = j;
			maxLen = Math.max(j - i + 1, maxLen);
		}

		return maxLen;
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(findLongestSubString("abcabc"));

	}

}
