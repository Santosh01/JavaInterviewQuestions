package source;

public class NumberReverse {

	public static void main(String[] args) {

		int number = 16;

		int reverse = 0;

		while (number != 0) {

			reverse = reverse * 10 + number % 10;
		
			number = number / 10;
			
			System.out.print(reverse);
		}

		

	}

}
