package source;

public class StringPermutation {

	void permutation(String perm, String word) {

		if (word.isEmpty()) {
			System.err.println(perm);
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(
						perm + word.charAt(i),
						word.substring(0, i)
								+ word.substring(i + 1, word.length()));
			}
		}
	}

	public static void main(String[] args) {

		StringPermutation sp = new StringPermutation();

		sp.permutation("", "123");

	}

}
