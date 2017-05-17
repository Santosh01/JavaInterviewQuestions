package source;

public class MaximumContigousSumFromArray {
	
	

	static int findMaxContigousSum(int[] inp) {
		int max_so_far = 0;
		int total_Sum_element = 0;

		for (int i = 0; i < inp.length; i++) {

			total_Sum_element = total_Sum_element + inp[i];
			if (max_so_far < total_Sum_element) {

				max_so_far = total_Sum_element;
			}

			if (total_Sum_element < 0) {
				total_Sum_element = 0;
			}
		}

		return max_so_far;
	}

	public static void main(String[] args) {
		int[] inp = { 1,2,3,5,6 };
		System.out.println(findMaxContigousSum(inp));
		
	}

}
