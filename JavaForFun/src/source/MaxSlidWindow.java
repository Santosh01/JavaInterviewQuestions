package source;


public class MaxSlidWindow{
	public static void findMaxSlideWindow(int[] inp) {
		int length = inp.length;
		int counter = 0;
		int[] temp = new int[2];
		int slideWindow = 2;
		int counter1 = 0;
		
		for (int i = 0; i < length; i++) {

			for (int i2 = 0; i2 < temp.length; i2++) {
				if (temp[i2] == 0) {
					temp[i2] = inp[counter];
					counter++;
				}
			}
			
			if (temp[counter1] != 0 && temp.length == slideWindow) {
				for (int j = 0; j < temp.length; j++) {
					for (int j2 = j + 1; j2 < temp.length; j2++) {
						if (temp[j] < temp[j2]) {
							System.out.println("Max in per slide window " + temp[j2]);
						}
					}
				}
			}
			
			if (temp[i] != 0 ) {
				temp = new int[2];
			}
		}

	}

	public static void main(String[] args) {
		int[] inp = { 1, 2, 3, 5, 6, 7};

		findMaxSlideWindow(inp);

	}

}
