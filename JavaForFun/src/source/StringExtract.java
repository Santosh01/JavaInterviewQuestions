package source;

public class StringExtract {

	public static void extractString(String inp) {
		
		String[] stringPattern = inp.split(" ");

		for (int i = 0; i < stringPattern.length; i++) {
			
			String temp = stringPattern[i];

			if (!String.valueOf(temp.charAt(0)).equals("(")) {

				if (temp.contains("(")) {

					temp = temp.substring(0, temp.indexOf("("));

					System.out.println(temp.replace(")", ""));

				} else {

					System.out.println(temp.replace(")", ""));
				}

			}

		}

	}

	public static void main(String[] args) {

		String inp = "(S (NP (NNP James)) (VP (VBZ is) (NP (NP (DT a)(NN boy))(VP (VBG eating) (NP (NNS sausages))))))";
		
		//String inp = "(NP(DT a) (NN boy))";
		extractString(inp);

	}

}
