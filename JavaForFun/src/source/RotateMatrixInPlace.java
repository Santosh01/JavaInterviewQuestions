package source;

public class RotateMatrixInPlace {

	static void rotateMatrix(int[][] matrix) {
	
		System.out.println("Before Rotation ");
		printMatrix(matrix);
		
		int length = matrix.length-1;
		 
		for (int i = 0; i <= (length)/2; i++) {
			for (int j = i; j < length-i; j++) {
 
				int temp = matrix[i][j];
 
				matrix[i][j] = matrix[length-j][i];
				matrix[length-j][i] = matrix[length-i][length-j];
				matrix[length-i][length-j] = matrix[j][length-i];
				matrix[j][length-i] = temp;
			}
		}
	
		System.out.println("\nAfter Rotation ");
		printMatrix(matrix);
	}

	private static void printMatrix(int[][] inp) {

		for (int i = 0; i < inp.length; i++) {

			for (int j = 0; j < inp.length; j++) {
				System.out.print(inp[i][j] + " ");

			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int[][] inp = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		rotateMatrix(inp);
	}

}
