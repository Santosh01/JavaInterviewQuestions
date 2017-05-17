package source;

public class LongestPalindromicSubString {

	public static String findLongestPalindromicString(String inp) {
		int stringLen = inp.length();
		int palindromeBeginsAt = 0;
		int max_len = 1;

		for (int i = 1; i <= stringLen; i++) {
			for (int j = 0; j <= stringLen - i; j++) {
				int temp = j + i - 1;
				if (inp.charAt(j) == inp.charAt(temp)) {

					palindromeBeginsAt = j;
					max_len = i;
				}

			}
		}

		return inp.substring(palindromeBeginsAt, max_len + palindromeBeginsAt);
	}

	public static void main(String[] args) {

		String inp = "bananaaenea";
		System.out.println(findLongestPalindromicString(inp));

	}

}
