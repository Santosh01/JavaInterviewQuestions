package source;


import java.util.HashMap;
import java.util.Map;

public class DifferenceArray {

	public static void differenceArray(int[] inpArr) {
		Map<Integer, StringBuilder> mp = new HashMap<Integer, StringBuilder>();

		int length = inpArr.length - 1;
		String seperator = ",";
		StringBuilder sb = new StringBuilder();

		for (int l = 0; l < length; l++) {
			int storeNum = inpArr[l + 1] - inpArr[l];
			String abc = "(" + inpArr[l + 1] + (seperator) + inpArr[l] + ")" + "=" + storeNum + "|";
			if (!sb.equals(abc)) {
				sb.append("(" + inpArr[l + 1] + (seperator) + inpArr[l] + ")" + "=" + storeNum + "|");
			}
			if (!mp.containsValue(sb.toString())) {
				mp.put(l, sb);
			} else {
				System.out.println("not added " + sb);

			}

		}

		System.out.println("HashMap " + mp);
		System.out.println("StringBuilder " + sb);

	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 4, 5, 6, 8, 9, 9, 12, 9, 9 };
		differenceArray(input);
	}
}
