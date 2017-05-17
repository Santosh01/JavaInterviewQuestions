package source;

import java.util.Scanner;

public class IncrementNumbers {

	public static void incrementNumbers(int[] num) {

		int len = num.length;
		int temp = 0;
		for (int i = 0; i < num.length; i++) {

			temp = num[i];
			temp = temp + 1;
			num[i] = temp;
			System.out.print(num[i] + " ");
		}

	}

	public static void main(String[] args) {
		int[] num = { 1, 23, 4, 5, 6, 7, 510 };
		incrementNumbers(num);

	}

}
