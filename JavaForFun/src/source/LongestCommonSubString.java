package source;

/*Question: Given String find longest common substring*/
public class LongestCommonSubString {

	static int findLongestCommonSubstring(String a, String b){
		int maxLen = 0;
		int[][] storeLen = new int[a.length()][b.length()];
		for (int i = 0; i < a.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				
				if(a.charAt(i) == b.charAt(j)){
					
					if(i == 0 || j == 0){
						
						storeLen[i][j] = 1;
					}
					else{
						
						storeLen[i][j] = storeLen[i -1 ][j- 1] +1; 
						
					}
					
					if(maxLen < storeLen[i][j] ){
						
						maxLen = storeLen[i][j];
					}
				}
			}
			
		}
		
		
		
		return maxLen;
	}
	
	public static void main(String[] args) {
		System.out.println(findLongestCommonSubstring("aba","abab"));
		

	}

}
