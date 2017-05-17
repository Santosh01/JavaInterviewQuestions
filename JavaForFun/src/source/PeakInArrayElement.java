package source;

public class PeakInArrayElement {

	int findPeakElem(int[] inp){
		
		int start = 0, end = inp.length-1 , mid = 0;
		
		while(start <= end){
			
			mid = (start + end)/2;
			
			if(inp[mid-1] > inp[mid]){
				
				 end = mid -1;
			
			}else {
				start = mid + 1;
								
			}
						
		}
		
		System.out.println(inp[mid]);
		return inp[mid];
		
	}

	public static void main(String[] args) {
		PeakInArrayElement pe = new PeakInArrayElement();
		int[] inp = { 5, 10, 15, 25, 30, 45, 65, 50, 35, 1 };

		pe.findPeakElem(inp);

	}

}
