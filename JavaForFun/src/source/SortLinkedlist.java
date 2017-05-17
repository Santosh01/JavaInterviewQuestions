package source;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SortLinkedlist {

	public static void sortTwoLinkedList(List<Integer> list1, List<Integer> list2) {
		List<int[]> sortedList = new LinkedList<int[]>();
		int length = list1.size() + list2.size();
		int list1Length = list1.size();
		int list2Length = list2.size();
		System.out.println("Lists size  " + length);

		int counter = 0;
		int[] tmp = new int[length];
		int counter1 = 0;
		while (length != 0) {
			if (list1Length != 0) {
				tmp[counter] = list1.get(counter);
				list1Length--;
			} else if (list1Length == 0 && tmp[counter] == 0) {

				tmp[counter] = list2.get(counter1);
				counter1++;
				list2Length--;
			}

			counter++;
			length--;

		}

		Arrays.sort(tmp);
		sortedList = Arrays.asList(tmp);

		for (int i1 = 0; i1 < tmp.length; i1++) {
			System.out.print(tmp[i1] + " ");
//			System.out.println("" + sortedList);
		}

	}

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		list1.add(5);
		list1.add(9);
		list1.add(-10);
		list1.add(50);
		list1.add(29);
		list1.add(1);

		list2.add(100);
		list2.add(89);
		list2.add(70);
		list2.add(55);
		list2.add(66);

		sortTwoLinkedList(list1, list2);

	}

}
