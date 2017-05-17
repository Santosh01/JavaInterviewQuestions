package source;

public class MaxAndMin {

	public static void findMaxMinWithBinary(int [] inp){
		int temp = 0;
		int low = 0;
		int high = inp.length;
		int position = (low + high)/2;
		
		while(low < high){
			
			if(inp[position] >=  low){
				high = position;
				temp = inp[position];
				
			}
			position = (low + high)/2;
			
			
	/*		if(inp[position] >= low ){
				low = position + 1;
				temp = inp[position];
				
			}
			position = (low + high)/2;*/
			
			
		}
		System.out.println(temp);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int [] inp = {1,1,3,4,5,6,7,8,9};
		findMaxMinWithBinary(inp);
		
		
		
	}

}
