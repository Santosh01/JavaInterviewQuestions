package source;



public class AddandCopyArray {

	public static void copyArray(int[] a, int[] b) {
		boolean flag = false;
		int firstArrayLength = a.length;
		int secondArrayLength = b.length;
		int storeValue = 0;
		String size = null;
		int counter1 = 0;
		int counter2 = 0;

		while (flag == false) {

			storeValue = a[counter1] + b[counter2];
			size = Integer.toString(storeValue);
			counter1++;
			counter2++;
			char[] newValue = size.toCharArray();
			System.out.println(String.valueOf(newValue));
			if (counter1 == firstArrayLength || counter2 == secondArrayLength) {
				break;
			}
		}

	}

	public static void main(String[] args) {
		int[] a = { 9, 1, 2, 3, 9 };
		int[] b = { 1, 1, 2, 3, 4 };
		copyArray(a, b);
	}
}
