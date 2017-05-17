package source;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.err.println(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(
						perm + word.charAt(i),
						word.substring(0, i)+ 
						word.substring(i + 1, word.length()));
			}
		}
	}

	private String checkString(String a, String b) {

		String temp = "";

		if (a.length() == 0 || b.length() == 0) {

			return "NO";
		} else {

			for (int i = 0; i < a.length(); i++) {
				if (b.toLowerCase().contains(
						Character.toString(a.charAt(i)).toLowerCase())) {
					temp += a.charAt(i);
				}

			}
			if (temp.equalsIgnoreCase(b)) {

				return "YES";
			} else {

				return "NO";
			}
		}
	}

	private static boolean isMatch(String bracket) {

		Stack<Character> stack = new Stack<Character>();
		char current, previous;

		for (int i = 0; i < bracket.length(); i++) {
			current = bracket.charAt(i);

			if ((current == '(') || (current == '[') || (current == '{')) {
				stack.push(current);
			} else if ((current == ')') || (current == ']') || (current == '}')) {
				if (stack.isEmpty()) {
					return false;
				} else {
					previous = stack.peek();

					if (((current == ')') && (previous == '('))
							|| ((current == ']') && (previous == '['))
							|| ((current == '}') && (previous == '{'))) {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		}

		if (!stack.isEmpty()) {
			return false;
		}

		return true;
	}

	static String[] braces(String[] values) {
		String[] output = new String[values.length];
		boolean isValid = false;
		int indx = 0;

		for (String eachBra : values) {
			isValid = isMatch(eachBra);

			if (isValid) {
				output[indx] = "Valid";
				indx++;
			} else {
				output[indx] = "Invalid";
				indx++;
			}
		}

		System.out.println(Arrays.toString(output));

		return output;
	}

	public static void main(String[] args) {
		Solution ts = new Solution();
		// System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		// String x = sc.nextLine();
		// String y = sc.nextLine();

		String[] values = { "{}[]()", "{[}]", "{ [ ( { } [ ] ) ] }",
				"{ ( [ ] ] }", "[{}]()[{{()}}()]", "[{}]({{()}}()]" };

		// ts.braces(values);

		ts.permutation("", "123");

		// System.out.print(ts.checkString(x, y));

	}
}
