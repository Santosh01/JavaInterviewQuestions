package source;


public class ReverseArrayInSubset {

	private static void reverseArray(int[] A, int k) {
		for (int i = 0; i < A.length; i += k) {
			int left = i;
			// in case right larger than A.length
			int right = Math.min(i + k - 1, A.length - 1);

			// reverse sub array
			while (left < right) {
				int temp = A[right];
				A[right] = A[left];
				A[left] = temp;
				left++;
				right--;
			}

		}
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}

	}

	public static void main(String[] args) {
		int[] inp = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		reverseArray(inp, 2);
	}

}
