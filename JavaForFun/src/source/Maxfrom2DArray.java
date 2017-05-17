package source;


public class Maxfrom2DArray {
	 
	public static void findMax(int [][] twodArray){
		int maxValue = 0;
		System.out.println("\nMax values in 2D array: ");
		for (int i = 0; i < twodArray.length; i++) {
			
			
		    for (int j = 0; j < twodArray[i].length; j++) {
		    	
		    	
		        if (twodArray[i][j] > maxValue) {
		           maxValue = twodArray[i][j];
		        }
		    }
		    System.out.println("Max value of row " + i + ": " + maxValue);
		}
	}
	
	public static void main(String[] args) {
		int [] []twodArray = {{1,2,3,4,5,6,7,89,900},{11,5,4,65,98,56,100}};
		findMax(twodArray);
	}

}
