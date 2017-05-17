package source;

public class MinimumNumOfJumps {

	void findNumJumps(int[] inp) {

		int minJumps = 0;
		int maxElm = inp[0];
		int trackSteps = 0;

		for (int i = 0; i < inp.length; i++) {

			if (inp.length == 0) {

				return;

			} else {

				if (maxElm == 0) {
					
					minJumps++;
					maxElm = trackSteps;
					
				}
				if (maxElm < inp[i]) {

					trackSteps = inp[i];

				}

				maxElm--;
			}

		}
		System.out.println(minJumps);

	}

	public static void main(String[] args) {
		int[] inp = { 3, 1, 4, 1, 5, 9 };

		MinimumNumOfJumps lm = new MinimumNumOfJumps();
		lm.findNumJumps(inp);

	}

}
