package source;

public class ContiguousSumSubArray {

	public static void findContiguousSumSubArray(int[] inp) {
		final int num = 95;
		int sum = 0;
		boolean flag = false;
		for (int i = 0; i < inp.length; i++) {
			for (int j = i + 1; j < inp.length; j++) {

				if (sum == 0) {
					sum = inp[i] + inp[j];

				}else{
					sum = sum + inp[j];
				}
				if(sum == num) {
					flag = true;
	
					System.out.println("\nContigous subarray sum " + num + " : (" + i + " - "+ j + ") : " + flag);
					for (int i2 = i; i2 <= j; i2++) {
						System.out.print(inp[i2]+ " ");
												
					}
				}
		
			}
			sum = 0;
			
		}
		if(flag == false){
			System.out.println("No records found for: " +  num + " : " + flag);
			
		}
	

	}

	public static void main(String[] args) {
		int[] inp = { 1, 20, 3, 5, 18, 10, -5, 12 , -5,100};

		findContiguousSumSubArray(inp);

	}

}
