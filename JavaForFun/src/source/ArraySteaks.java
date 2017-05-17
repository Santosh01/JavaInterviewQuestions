package source;


import java.util.ArrayList;
import java.util.List;

public class ArraySteaks {

	public static void findSteak(int[] inputOnes) {
		int counterfor1 = 0;
		int count0 = 0;
		List<Integer> mylist = new ArrayList<Integer>();
		int storeNum = 0;
		int forOne = 1;
		int timer = 0;
		for (int i = 0; i < inputOnes.length; i++) {
			if (inputOnes[i] == storeNum) {

				mylist.add(inputOnes[i]);
				count0++;

			} else {

				if (inputOnes[i] == forOne) {

					counterfor1++;
					mylist.add(inputOnes[i]);

				}
			}

			if (inputOnes[i] == 0 && inputOnes[i - 1] == 1 && inputOnes[i + 1] == 1) {

				counterfor1++;

				mylist.set(i, 1);

			}

			System.out.println(timer++);
		}
		System.out.println("max 1 count " + counterfor1);
		System.out.println("======================");
		System.out.println(mylist);
	}

	public static void main(String[] args) {

		int[] ones = { 1, 1, 1, 0, 1 };
		findSteak(ones);
	}

}
