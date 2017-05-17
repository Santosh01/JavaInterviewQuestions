package source;


import java.util.Random;

public class stringShuffle {
	
	public static void shuffleString2(char[] storedString) {
		int firstIndex =0 ;
		int lastIndex = storedString.length - 1;
		int i = 0;
		while (true) {
			
			char temp = storedString[firstIndex];
			storedString[firstIndex] = storedString[lastIndex];
			storedString[lastIndex] = temp;
			i++;
			String temp11 = String.valueOf(storedString);
			if (!doesConsecutivesExist(temp11)) {
				System.out.println(i + "\t" + temp11);
				break;
			}			
			
			/*if (i > 100000) {
				System.out.println("Reached max swaps");
				break;
			}*/
		}
	}

	public static void shuffleString1(char[] storedString) {
		int checkLength = storedString.length;
		Random r = new Random();
		int i = 0;
		while (true) {
			int randomIndex1 = r.nextInt(checkLength);
			int randomIndex2 = r.nextInt(checkLength);
			if (storedString[randomIndex1] != storedString[randomIndex2]) {
				
				char temp = storedString[randomIndex1];
				storedString[randomIndex1] = storedString[randomIndex2];
				storedString[randomIndex2] = temp;
				i++;
				String temp11 = String.valueOf(storedString);
				if (!doesConsecutivesExist(temp11)) {
					System.out.println(i + "\t" + temp11);
					break;
				}
			}			
			if (i > 100000) {
				System.out.println("Reached max swaps");
				break;
			}
		}
	}



	public static void swap(char[] storedString) {
		// char[] checkChar = /perfectMatch.toCharArray();
		int checkLength = storedString.length;

		for (int itr = 0; itr < checkLength; itr++) {

			if (storedString[itr] == storedString[itr + 1]) {
				checkString = String.valueOf(storedString[itr]);

				System.out.println("duplicate need to be swapped: "
						+ String.valueOf(storedString[itr]));
				if (storedString[itr - 1] != storedString[itr + 1]) {

					char temp = storedString[itr - 1];
					storedString[itr - 1] = storedString[itr];
					storedString[itr] = temp;

					System.out.println("Swapped array  " + temp + "  against "
							+ storedString[itr]);

					String displayChar = String.valueOf(storedString);
					System.out.println("Swapped Array: " + displayChar);

				}

			}

		}

	}

	public static void shuffle(char[] storedString) {

		int length = storedString.length;

		for (i = 0; i < length - 1; i++) {

			for (j = i + 1; j < length - 1; j++) {

				if (storedString[i] != storedString[j]) {

					notMatch = String.valueOf(storedString[j]);
					System.out.println("Not duplicate found for String: "
							+ notMatch);
				} else if (storedString[i] == storedString[j]) {

					matchedString = String.valueOf(storedString[j]);

					System.out.println("Duplicate found for: " + matchedString);
					return;

				}

			}
			if (matchedString.equalsIgnoreCase(notMatch)) {
				perfectMatch = matchedString + storedString[j];
				System.out.println(" Perfect combination " + perfectMatch);

			}
		}

	}

	public static boolean doesConsecutivesExist(String target)

	{

		char[] charArray = target.toCharArray();

		for (int i = 0; i < charArray.length - 1; i++)

		{

			if (target.charAt(i) == target.charAt(i + 1))

			{

				return true;

			}

		}

		return false;

	}

	public static void main(String[] args) {

		// String inputString = "ABCDAA";
		String inputString = "SANTOSHHHH";
		char[] storedString = inputString.toCharArray();

		// shuffle(storedString);
		// swap(storedString);
		for (int i = 0; i < 10; i++) {
			shuffleString1(storedString);
		}
		System.out.println("Done");
	}

	private static String checkString = null;
	private static String notMatch = null;
	private static String matchedString = null;
	private static String perfectMatch = null;
	private static int i = 0;
	private static int j = 0;

}
