package source;

public class MultiDimensionalArray {

	void firstMethod(int[][] inp) {
		
		
		for (int i = 0; i < inp.length; i++) {
			
			for (int j = 0; j < inp[i].length; j++) {
				
				if(inp[i][j]%2 == 0){
				
					System.out.print(inp[i][j] + "     ");
				}
				
			
			}
			System.out.println("\n");
		}

	}

	public static void main(String[] args) {

		int[][] inp = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		MultiDimensionalArray mul = new MultiDimensionalArray();

		mul.firstMethod(inp);

	}

}
