package source;


public class ReverseWords {
	public static void main(String[] args) {
		String inpStr = " Men eats dogs ";
		String[] storeInp = inpStr.split(" ");

		for (int i = 0; i < storeInp.length; i++) {
			if(Character.isWhitespace(storeInp[0].charAt(0))){
				storeInp[0].replace(" ", "");
				storeInp[storeInp.length - 1].replace(" ", "");
				
			}
			System.out.print(storeInp[i] + " ");
		}
		
		
	}

}
