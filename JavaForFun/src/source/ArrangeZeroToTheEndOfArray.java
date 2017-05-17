package source;

import java.util.Arrays;

public class ArrangeZeroToTheEndOfArray {

	public static void moveZeroes(int[] nums) {
		int m = -1;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				if (m == -1 || nums[m] != 0) {
					m = i;
				}
			} else {
				if (m != -1) {
					int temp = nums[i];
					nums[i] = nums[m];
					nums[m] = temp;
					m++;
				}
			}
		}

		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {

		int[] num = { 1, 0, 2, 0, 3, 0 };

		moveZeroes(num);

	}

}
