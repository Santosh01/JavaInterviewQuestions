package source;

import java.util.Arrays;

public class MaximumElementFrom2DArray {

	public static void main(String[] args) {

		int[][] inp = new int[][]{{1, 2, 3}, {4, 6, 7}, {7, 9, 10}};

		int max = 0;

		for (final int[] arr : inp) {

			System.out.println(Arrays.toString(arr));

		}

		for (int i = 0; i < inp.length; i++) {

			for (int j = 0; j < inp[i].length; j++) {

				if (inp[i][j] > max) {

					max = inp[i][j];

				}

			}

		}
		System.out.println("\nMax from 2D array: " + max);
	}
}
