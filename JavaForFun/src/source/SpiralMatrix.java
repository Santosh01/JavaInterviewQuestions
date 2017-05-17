package source;

public class SpiralMatrix {
	public static final int[][] arr = { { 1, 2, 3, 4, 40 }, { 5, 6, 7, 8, 80 },
			{ 9, 10, 11, 12, 120 }, { 13, 14, 15, 16, 160 },
			{ 17, 18, 19, 20, 200 } };

	/*
	 * public static final int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9,
	 * 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 } };
	 */

	// public static final int[][] arr= {{1},{2},{3}};

	// public static final int[][] arr= {{1,2},{3,4},{5,6} };

	// public static final int[][] arr= {{1,2,3},{4,5,6},{7,8,9},{10,11,12} };

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// top row, bottom row, left column, right column
		int tr = 0;
		int br = arr.length - 1;
		int lc = 0;
		int rc = arr[0].length - 1;
		String currentPosition = "tr";

		int noOfRows = arr.length;
		int noOfColumns = arr[0].length;

		for (;;) {
			if (currentPosition.equals("tr")) {
				for (int a = lc; a <= rc; a++) {
					System.out.print(" " + arr[tr][a]);
				}

				if (noOfRows <= noOfColumns) {
					if ((br - tr) <= 0) {
						break;
					}
				}

				tr++;
				currentPosition = "rc";
				System.out.println("---- ");
			}

			if (noOfRows <= noOfColumns) {
				if ((tr - br) == 1) {
					break;
				}
			}

			if (currentPosition.equals("rc")) {
				for (int a = tr; a <= br; a++) {
					System.out.print(" " + arr[a][rc]);
				}

				if (noOfColumns <= noOfRows) {
					if ((rc - lc) <= 0) {
						break;
					}
				}

				rc--;
				currentPosition = "br";
				System.out.println("---- ");
			}

			if (currentPosition.equals("br")) {
				for (int a = rc; a >= lc; a--) {
					System.out.print(" " + arr[br][a]);
				}

				br--;
				currentPosition = "lc";
				System.out.println("---- ");
			}

			if (currentPosition.equals("lc")) {
				for (int a = br; a >= tr; a--) {
					System.out.print(" " + arr[a][lc]);
				}

				lc++;
				currentPosition = "tr";
				System.out.println("---- ");
			}
		}
	}
}
