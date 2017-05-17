package source;

import java.util.ArrayList;
import java.util.Collections;


public class RearrangeNumberArrayList {

	public static void altSorting(ArrayList<Integer> intList) {
		ArrayList<Integer> altIntList = new ArrayList<Integer>();
		Collections.sort(intList);
		int sz = intList.size();
		int lastInx = sz - 1;
		int inx = 0;
		int mid = (sz / 2);
		while (inx < mid) {
			altIntList.add(intList.get(lastInx));
			altIntList.add(intList.get(inx));
			inx++;
			lastInx--;
		}
		if (inx == lastInx) {
			altIntList.add(intList.get(inx));
		}
		System.out.println(altIntList);
	}

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7 ,10};
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i : num) {
			arr.add(i);
		}

		altSorting(arr);

	}

}
