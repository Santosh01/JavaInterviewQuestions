package source;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class MissingNumbers {

	public static void findTwoDigitsMissingNumbers(String num) {
		int length = num.length();
		String[] storeTwoNum = new String[length / 2];
		int counter = 0;
		StringBuffer sb = new StringBuffer();
		int lastIndexValue = 0;
		int[] numRange;
		for (int i = 0; i < length; i++) {
			sb.append(Character.toString(num.charAt(i)));
			if (sb.length() == 2) {
				storeTwoNum[counter] = String.valueOf(sb);
				counter++;
				sb.delete(0, sb.length());
			}

		}
		counter = 0;
		Arrays.sort(storeTwoNum);
		lastIndexValue = Integer.parseInt(storeTwoNum[storeTwoNum.length - 1]);
		numRange = new int[lastIndexValue];

		for (int i = 10; i <= lastIndexValue; i++) {
			numRange[counter] = i;
			counter++;

		}


	}

	public static void main(String[] args) {
		String numInp = "596597598600601602";

		findTwoDigitsMissingNumbers(numInp);

	}

}
