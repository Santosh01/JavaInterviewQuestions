package source;


public class WordSubsequence {

	public static void words(String inpWords) {
		char[] storeChar = inpWords.toCharArray();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= storeChar.length - 1; i++) {
			for (int j = i + 1; j <= storeChar.length - 1; j++) {

				if (storeChar[j] == storeChar[i] && !sb.equals(storeChar[j])) {

					sb.append(storeChar[j]);

				}
				if (storeChar[j] == storeChar[i] || sb.equals(storeChar[i])) {
					count++;

				}

			}
			// System.out.println(sb.charAt(i) + count);
		}

		System.out.println(sb);

	}

	public static void main(String[] args) {
		String inWord = "ababcdc";
		words(inWord);

	}

}
