package source;

public class RemoveDuplicateCharacterFromString {

	public static void main(String[] args) {

		String inp = "aba";
		int count = 0;
		for (char c : inp.toCharArray()) {

			int val = c - 'a';

			if ((count & 1 << val) > 0) {

				System.out.println("duplicate" + c);
				
			} else {
				System.out.println(c);
			}

			c |= 1 << val;

		}

	}

}
