package source;

public class CrackingTheCodingInterviewQuestion {

	// Chapter 1:
	/*
	 * find the duplicate character in a string without using extra space.
	 * Solution: Use ASCII value of the character and check if the ascii already
	 * present in the array
	 */
	static boolean findDuplicate(String input) {

		boolean[] check = new boolean[256];

		for (int i = 0; i < input.length(); i++) {
			int val = input.charAt(i);
			if (check[val]) {
				return false;
			}
			check[val] = true;

		}

		return true;
	}

	// solution2:
	static boolean isUnique(String str) {
		long check = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
		
			if ((check & (1 << val)) > 0) {

				return false;
			}
			check |= 1 << val;
		}

		return true;

	}

	public static void main(String[] args) {

		String input = "!ab";
		findDuplicate(input);
		System.out.println(isUnique(input));
	}

}
