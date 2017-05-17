package source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class NumberWeights {
	public static void findNumberWeights(int[] num) {
		Arrays.sort(num);
		int temp = 0;
		int square = 5;
		int multiple = 4;
		int divisible = 6;
		int even = 3;
		int duplicate = 0;
		HashMap<Integer, ArrayList<Integer>> mp = new HashMap<Integer, ArrayList<Integer>>();

		for (int i = 0; i < num.length; i++) {
			if (duplicate != num[i]) {
				mp.put(num[i], new ArrayList<Integer>());
			}

			if (temp == 0) {
				temp = num[i];

			}
			int temp1 = (int) Math.sqrt(temp);
			if (temp1 * temp1 == temp && duplicate != num[i]) {
				mp.get(num[i]).add(square);
			}

			if (temp / 6 == 0 && duplicate != num[i]) {
				mp.get(num[i]).add(divisible);
			}
			if (temp % 2 == 0 && duplicate != num[i]) {
				mp.get(num[i]).add(even);
			}

			if (temp % 4 == 0 && duplicate != num[i]) {
				mp.get(num[i]).add(multiple);
			}
			duplicate = num[i];
			temp = 0;
		}

		for (Entry<Integer, ArrayList<Integer>> en : mp.entrySet()) {
			System.out.print("<" + en.getKey() + ", " + en.getValue().toString().replaceAll("[\\[\\],]", "") + "> ");

		}

	}

	public static void main(String[] args) {
		int[] num = { 10, 36, 54, 89, 12, 10, 100, 150, 5, 55, 90 };
		findNumberWeights(num);

	}

}
