package source;

public class DifferenceNum {

	public static void Num(int[] A) {
		int nextCount = 1;
		for (int i = 0; i < A.length - 1;) {

			int diff = A[i] - A[nextCount];

			if (nextCount == A.length - 1) {
				i = i + 1;
				nextCount = i + 1;

			} else {
				nextCount = nextCount + 1;
			}

			System.out.println(diff);

		}

	}

	public static void main(String[] args) {

		int[] inp = {1, 2, 4, 5};
		Num(inp);
	}

}
