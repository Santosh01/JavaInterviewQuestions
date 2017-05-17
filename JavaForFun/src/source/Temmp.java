package source;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Temmp {
	
	public static String countAndSay(String start, int n) {
		if (n <= 0)
			return null;
		int i = 1;
	 
		while (i < n) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < start.length(); j++) {
				if (start.charAt(j) == start.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(start.charAt(j - 1));
					count = 1;
				}
			}
	 
			sb.append(count);
			sb.append(start.charAt(start.length() - 1));
			start = sb.toString();
			i++;
		}
	 
		return start;
	}


	public static void main(String[] args) throws Exception {
		
		System.out.println(countAndSay("11", 2));
	}

}
