package source;

public class ReverseNumber {

	static int reverseNum(int num) {

		int ret = 0;
		while (num != 0) {
			ret = ret * 10 + num % 10;
			num /= 10;
		}
		return ret;
	}

	public static void main(String[] args) {

		System.out.println(reverseNum(1598746));
	}

}
