package source;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSerachInFile {

	static void findText(String inp) {
		String patternText = "i([^,])*";
		Pattern p = Pattern.compile(patternText);
		Matcher m = p.matcher(inp);

		while (m.find()) {

			System.out.println(m.start());
		}

	}

	public static void main(String[] args) {

		String inp = "hello world this is test to find text in a string";
		findText(inp);

	}

}
