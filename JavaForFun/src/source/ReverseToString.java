package source;

public class ReverseToString {

	public static void main(String[] args) {

		String inp = "How Are You Doing Today";

		boolean firstWord = false;
		for (int i = inp.length() - 1; i >= 0; i--) {

			if (firstWord == false) {

				System.out.print(String.valueOf(inp.charAt(i)).toUpperCase());

				firstWord = true;

			} else if (String.valueOf(inp.charAt(i)).equals(" ")) {

				System.out.print(" "
						+ String.valueOf(inp.charAt(i - 1)).toUpperCase());

				i = i - 1;

			} else {

				System.out.print(String.valueOf(inp.charAt(i)).toLowerCase());
			}

		}

	}

}
