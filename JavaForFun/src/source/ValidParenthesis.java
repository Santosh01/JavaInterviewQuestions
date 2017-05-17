package source;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

	boolean isValidParen(String inp) {

		boolean isValid = false;
		Stack<String> st = new Stack<String>();
		String c;

		for (int i = 0; i < inp.length(); i++) {
			c = Character.toString(inp.charAt(i));

			if (c.equals(")") || c.equals("]") || c.equals("}")) {

				if (st.isEmpty()) {

					return false;

				}

				String opening = st.peek();

				if (c.equals(")") && opening.equals("(")) {

					st.pop();
				} else if (c.equals("]") && opening.equals("[")) {

					st.pop();
				} else if (c.equals("}") && opening.equals("{")) {

					st.pop();
				}

			} else if (c.equals("(") || c.equals("{") || c.equals("[")) {

				st.push(c);

			}

		}

		if (st.isEmpty()) {
			isValid = true;
		}
		
		System.out.println(isValid);
		return isValid;
	}

	public static void main(String[] args) {

		System.out.println("Enter the values: ");
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();

		ValidParenthesis sp = new ValidParenthesis();

		sp.isValidParen(inp);

	}

}
