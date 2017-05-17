package source;


import java.util.Arrays;

public class MissingNum {

	public static void findNum(int[] inpNum) {
		Arrays.sort(inpNum);
		int length = inpNum.length;
		int counter = 0;
		int storeTemp = 0;
		int addOne = 1;
		int missNum = 0;
		int tempBinary = 0;
		int maxNum = 0;
		
		for (int i = 0; i < inpNum.length; i++) {
			for (int j = i + 1; j < inpNum.length; j++) {
				if (inpNum[j] > inpNum[i]) {
					maxNum = inpNum[j];
				}
			}
		}
		
		System.out.println("max num " + maxNum);
		int[] storeNum = new int[maxNum];
		for (int i = 0; i < length; i++) {
			storeTemp = maxNum - addOne;
			if (storeTemp != 0) {
				tempBinary = Arrays.binarySearch(inpNum, storeTemp);
				if (tempBinary < 0) {
					storeNum[counter] = storeTemp;
					counter++;
				}

			}
		}
		for (int i = 0; i < storeNum.length; i++) {
			System.out.print(" " + storeNum[i]);
		}
		
	}

	public static void main(String[] args) {
		int[] inpNum = { 1, 2, 12, 3, -1, 5, 7, 11, 500 };
		findNum(inpNum);

	}

}
