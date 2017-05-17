package source;
public class Equlibrium {
	public static void main(String[] args) {
		int[] sequence = {-7, 1, 5, 2, -4, 3, 0};
		equlibrium_indices(sequence);
	}
 
	public static void equlibrium_indices(int[] sequence){
		//find total sum
		int totalSum = 0;
		for (int n : sequence) {
			totalSum += n;
		}
		//compare running sum to remaining sum to find equilibrium indices
		int runningSum = 0;
		for (int i = 0; i < sequence.length; i++) {
			int ArrayElement = sequence[i];
			int leftSum = totalSum - runningSum - ArrayElement;
			if ( leftSum == runningSum) {
				System.out.println(i);
			}
			
			runningSum = runningSum +  ArrayElement;
		}
	}
}