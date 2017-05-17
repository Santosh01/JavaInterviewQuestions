package source;


public class ArthmeticNumber {

	public static void arthNum(int[] inpNum) {

		int length = inpNum.length;
		int countPlus = 1;
		int countPrev = 0;
		int[] storeNum = new int[length];
		int firstNum = 0;
		int storeDiff = 0;
		int result = 0;
		int result1 = 0;
		for (int i = 0; i < inpNum.length - 1; i++) {

			if (length != 0 && storeNum[i] == storeNum[i + 1] || storeNum[i] == 0) {
				firstNum = inpNum[0];
				storeDiff = inpNum[countPlus] - inpNum[countPrev];
				storeNum[i] = storeDiff;
			}
			if (storeDiff != 0 || storeNum[countPrev] == storeNum[countPlus]) {
				result = firstNum + (inpNum[length - 1] - 1) * storeDiff;
			}
			
			if (storeDiff != 0 || storeNum[countPrev] == storeNum[countPlus]) {
				result1 = firstNum +  inpNum[countPrev] * storeDiff;
				System.out.println("Arithmetic sequence numbers: " + result1);
			}

			countPlus++;
			countPrev++;

		}

		System.out.println("First inserted number: " + firstNum);
		System.out.println("Last n Index: " + inpNum[length - 1]);
		System.out.println("Arithmetic progression sequence: " + result);
		System.out.println("Arithmetic progression sequence: " + result1);
	}

	public static void main(String[] args) {

		int[] inpNum = { 1, 2, 3, 4, 5, 6, 7, 8 };
		arthNum(inpNum);

	}

}
