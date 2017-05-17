package source;

import org.apache.commons.lang3.StringUtils;

public class SinglePassString {

	public static void findUniqueString(String inp) {

		StringBuffer sb = new StringBuffer();
		sb.append(inp.toLowerCase());
		String temp = "";
		int length = sb.length();
		for (int i = 0; i < length;) {
			if (StringUtils.isBlank(temp)) {
				temp = Character.toString(sb.charAt(i));
				sb.deleteCharAt(i);
			}
			if (sb.toString().contains(temp.toLowerCase())) {
				System.out.println("repeated: " + temp);

				int indexOfChar = sb.toString().indexOf(temp);
				sb.deleteCharAt(indexOfChar);
			} else {
				System.out.println("not repeated: " + temp);
			}
			
			length = sb.length();
			temp = "";
		}

	}

	public static void main(String[] args) {
		String inpString = "UNITED STATES";
		findUniqueString(inpString);

	}

}
