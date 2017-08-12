package source;

import org.apache.commons.lang3.StringUtils;
//This will not count whitespace/empty string
public class VowelAndConsonant {

	public static void countVowelConsonant(String input) {

		char tempVar;
		String vowel = "aeiou";
		int stringLength = 0;
		for (int i = 0; i < input.length(); i++) {
			tempVar = input.charAt(i);
			
			if (!StringUtils.isBlank(Character.toString(tempVar))) {
				
				if (vowel.contains(Character.toString(tempVar).toLowerCase())) {
					stringLength = stringLength + 1;

				} else {
					stringLength = stringLength + 2;
				}
			}
		}
		System.out.println(stringLength);

	}

	public static void main(String[] args) {
		String inpStr = "ABCDXYZ";

		countVowelConsonant(inpStr);

	}

}
