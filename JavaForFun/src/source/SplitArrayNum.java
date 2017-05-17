package source;


public class SplitArrayNum {

	public static void splitNum(int[] a, int[] b) {

		StringBuilder sb = new StringBuilder();
		int i = 0;
		int alength = a.length - 1;
		int blength = b.length - 1;
		char[] num = null;
		String charlength;
		// String num3;
		String appendString = "" ;
		
		while (alength != 0 && blength != 0) {

			charlength = String.valueOf(sb);
			String replace = sb.toString();
			String replace1 = replace.replaceAll(",", "");
			if (charlength.length() <= 2) {
				sb = sb.append(a[i] + b[i] + ",");
			}
			i++;
			alength--;
			blength--;

			if (charlength.length() >= 2) {
				
				sb = sb.append(a[i] + b[i]);
				appendString = sb.charAt(i) + "," +sb.charAt(i);
				
			}
		}
		
		
		
		System.out.print(appendString);
	}

	public static void main(String[] args) {

		int[] num1 = { 1, 2, 3, 5, 6, 8,9,10 };
		int[] num2 = { 1, 2, 3, 5, 6, 8,9,10 };

		splitNum(num1, num2);
	}

}
