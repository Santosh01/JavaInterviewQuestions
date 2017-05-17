package source;
public class LongestSubquence {

	public static void findMissingNum(int[] A) {
		int count = 0;
		int tempCount = 1;
		int small = 0;
		int large = 0;
		if (A.length > 1) {

			for (int i = 0; i < A.length - 1; i++) {
				for (int j = i + 1; j < A.length; j++) {

					small = A[i] < A[j] ? A[i] : A[j];
					large = A[i] > A[j] ? A[i] : A[j];

					if (large - small <= 1) {
						tempCount = tempCount + 1;
					}
				}
				if (tempCount > count)
					count = tempCount;
				tempCount = 1;
			}

		} else if (A.length == 1) {
			count = 1;
		} else {
			count = 0;
		}

		System.out.println(count);

	}
	public static void main(String[] args) {
//		 int[] num = {6, 10, 6, 9, 7, 8};

//		int[] num = {6, 6, 7, 1, 2, 1, 2, 1, 2, 1, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -10};
		 int[] num = {6, 6, 7, 8}; // *
//		 int[] num = {9, 7};
//		 int[] num = {9};
//		 int[] num = {};
		// int[] num = {2,147,483,647};
		// int[] num = {1, 8, 9, 6, 10, 11, 12, 14, 16, 18, 20, 22};
//		int[] num = {2,147,483,647};

		findMissingNum(num);

	}

}
