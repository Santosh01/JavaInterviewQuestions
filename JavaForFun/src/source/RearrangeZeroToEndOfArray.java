package source;

import java.util.Arrays;

public class RearrangeZeroToEndOfArray {

	void swap(int[] input, int i, int pos) {
		input[i] = input[i] + input[pos];
		input[pos] = input[i] + input[pos];
		input[i] = input[i] - input[pos];
	}

	void rearrangeArray(int[] input) {
		int pos = 0, count = 0;
		boolean hasSwapped = false;

		for (int i = 0; i < input.length - 1; i++) {

			if (input[i] == 0 && count == 0) {
				pos = i;
				count += 1;
			} else {
				if (!hasSwapped && pos != 0 && input[i] != 0) {
					swap(input, i, pos);
					hasSwapped = true;
					i -= 1;
				}
			}

			if (hasSwapped) {
				hasSwapped = false;
				count = 0;
				pos = 0;
			}
		}

		System.out.println(Arrays.toString(input));
	}

	public static void main(String[] args) {
		int[] input = { 1, 0, 2, 0, 3, 0, 4, 0 };

		RearrangeZeroToEndOfArray ar = new RearrangeZeroToEndOfArray();

		ar.rearrangeArray(input);

	}

}
