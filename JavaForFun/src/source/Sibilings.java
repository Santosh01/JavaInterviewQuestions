package source;

class Sibilings {
	public static int solution(int N) {

		int swapVal = 0;
		String largestSiblingsNum = "";
		int[] tempNum = new int[N];
		if (String.valueOf(N).length() >= 2) {
			while (N != 0) {
				if (N == 0) {
					break;
				}
				swapVal = N % 10;
				tempNum[swapVal]++;
				N /= 10;
			}

			for (int i = tempNum.length - 1; i >= 0; i--) {
				for (int j = 0; j < tempNum[i]; j++) {
					largestSiblingsNum += i;
				}
			}
		} else {
			largestSiblingsNum = Integer.valueOf(N).toString();
		}
		System.out.println(largestSiblingsNum);
		return Integer.parseInt(largestSiblingsNum);

	}
	public static void main(String[] args) {
		solution(553);
	}
}