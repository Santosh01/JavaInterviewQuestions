package source;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class findTopUserName {

	public static void printUsers(Map<String, ArrayList<Integer>> mp) {
		int rank = 0;
		int rank2 = 0;
		String user = null;
		for (Map.Entry<String, ArrayList<Integer>> key : mp.entrySet()) {
			rank = key.getValue().get(0);
			for (Map.Entry<String, ArrayList<Integer>> key1 : mp.entrySet()) {
				rank2 = key1.getValue().get(0);
				if (rank2 > rank) {
					rank = rank2;

					if (user == null && user != key1.getKey()) {
						user = key1.getKey();
						System.out.println(key1.getKey() + " " + key1.getValue().get(0));
					}
				}

			}

		}
	}

	public static void findTop2LoggedUserName(String inpStr) {
		String[] inpArray = inpStr.split(",");
//		Arrays.sort(inpArray);

		Map<String, ArrayList<Integer>> mp = new HashMap<String, ArrayList<Integer>>();
		int temp = 0;

		for (int i = 0; i < inpArray.length; i++) {

			if (!mp.containsKey(inpArray[i])) {
				mp.put(inpArray[i], new ArrayList<Integer>());

				if (mp.get(inpArray[i]).isEmpty()) {
					mp.get(inpArray[i]).add(0, 0);
				}
			} else {

				if (temp == 0) {
					temp = temp + 1;
					mp.get(inpArray[i]).add(0, temp);

				}
				if (mp.get(inpArray[i]).get(0) != null) {
					temp = mp.get(inpArray[i]).get(0);
					temp = temp + 1;
					mp.get(inpArray[i]).add(0, temp);
				}

			}
		}

		printUsers(mp);

	}

	public static void main(String[] args) {

		String str = "user1,user1,user1,user1,user1,user1,user1,user2,user3,user3,user3,user3,user3,user3,user3,user3,user3,user3,user3,user3,user2,user1,user4,user1,user2,user4,user4,user4,user4,user4";

		findTop2LoggedUserName(str);

	}

}
