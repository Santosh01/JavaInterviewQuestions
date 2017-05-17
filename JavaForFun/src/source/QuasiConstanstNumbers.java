package source;



public class QuasiConstanstNumbers {
	
	public static void findMissingNum(int[] A) {
		
		int count = 0, tempCount = 1, small = 0, large = 0, nxtIndx = 1;

		if (A.length > 1) {

			for (int i = 0; i < A.length - 1;) {

				small = A[i] < A[nxtIndx] ? A[i] : A[nxtIndx];
				large = A[i] > A[nxtIndx] ? A[i] : A[nxtIndx];

				if (large - small <= 1) {
					tempCount = tempCount + 1;
				}

				if (nxtIndx == A.length - 1) {
					i = i + 1;
					nxtIndx = i + 1;

					if (tempCount > count)
						count = tempCount;
					tempCount = 1;

				} else {
					nxtIndx = nxtIndx + 1;
				}

			}

		} else if (A.length == 1) {
			count = 1;
		} else {
			count = 0;
		}

		System.out.println(count);

	}

	public static void main(String[] args) {
//		int[] num = {6,  10, 6, 9, 7, 8};

		 int[] num = {6, 6, 11,7, 1, 2, 1, 2, 1, 2, 1, -9,12,12,12,12,12,12, -9, -10};
//		 int[] num = {6, 6, 7, 8};
		// int[] num = {9, 7};
		// int[] num = {9};
		// int[] num = {};
		// int[] num = {2,147,483,647};
		// int[] num = {1, 8, 9, 6, 10, 11, 12, 14, 16, 18, 20, 22};
		// int[] num = {2,147,483,647};

		findMissingNum(num);

	}

}
