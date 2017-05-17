package source;


public class ReverseStringWithOneDuplicate {

	public static void reverseString(String str) {
		int length = str.length();
		char[] storeString = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		String a = null;
		String b = null;

		for (int i = 0; i < storeString.length; i++) {

			for (int j = storeString.length - 1; j >= i; j--) {
				if (sb.charAt(i) != storeString[j]) {
					String temp;
					a = Character.toString(storeString[j]);
					b = Character.toString(storeString[i]);
					temp = b;
					b = a;
					b = temp;
				}

			}

			System.out.println("b " + b);
			System.out.println("a " + a);
			System.out.println("i->" + storeString[i]);
		}

	}

	public static void main(String[] args) {
		String inp = "aabcc";
		reverseString(inp);

	}

}
