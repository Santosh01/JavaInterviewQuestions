package source;

import java.util.Arrays;
import java.util.Collections;

public class SortAndMergerTwoSortedArray {

	public static void mergeArray(int[] Array1, int[] Array2) {

		int[] mergedArray = new int[Array1.length + Array2.length];
		int indexCounter = 0;

		int array1Len = Array1.length - 1;
		int array2Len = Array2.length - 1;
		boolean isArray1Done = false;
		int arr1Len = Array1.length;

		while (array1Len != -1 || array2Len != -1) {
			if (array1Len != -1) {
				mergedArray[indexCounter] = Array1[array1Len];
				indexCounter++;
				array1Len--;

			} else {
				if (!isArray1Done) {

					isArray1Done = true;
					indexCounter = 0;
				}

				if (array1Len == -1 && array2Len != -1) {
					mergedArray[arr1Len] = Array2[array2Len];
					array2Len--;
					arr1Len++;;

				}

			}
			

		}
		Arrays.sort(mergedArray);
		for(int i : mergedArray){
			System.out.print(i + " ");
		}
		
		

	}
	public static void main(String[] args) {

		int[] Array1 = {1, 2, 3, 4, 5, 15};
		int[] Array2 = {6, 7, 8, 9, 10};

		mergeArray(Array1, Array2);

	}
}
