package source;

import java.util.Arrays;

public class Array2Dsorting {

	public static void sortArrayAsPerOrder(int[][] num) {

		int count = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				int temp = num[i][j];
				if (temp == 0) {
					count++;
				}
			}

		}

		System.out.println(count);
		

	}

	public static void main(String[] args) {
		/*
		 * int[][] num = { {0,0,1}, {0,1,1}, {1,1,0}};
		 */
		int[][] num = { { 0, 0, 0, 1 }, { 0, 0, 1, 1 } };

		sortArrayAsPerOrder(num);

	}

}
