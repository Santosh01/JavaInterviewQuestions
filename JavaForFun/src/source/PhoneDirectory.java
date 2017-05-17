package source;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PhoneDirectory {
	static Map<Integer, String> mp = new HashMap<Integer, String>();

	public static void chkPhNum(Map<Integer, String> maps) {
		inputPhone();
		Iterator itr = mp.entrySet().iterator();

		for (String str : mp.values()) {
			Map.Entry<Integer, String> entry = (Entry<Integer, String>) itr.next();
			System.out.println("entyset: " + entry);
			if (entry.getValue().equals(str) ) {
				System.out.println("Stored Value: " + entry.getValue()+ entry.getKey());
			}

		}

	}

	public static Map<Integer, String> inputPhone() {

		Scanner sc = new Scanner(System.in);
		Scanner phonenum = new Scanner(System.in);
		while (true) {
			System.out.println("enter name : ");
			String inputString = sc.nextLine();

			System.out.println("enter number : ");
			int phoneNumber = phonenum.nextInt();

			mp.put(phoneNumber, inputString);
			if (sc.nextLine().equals("exit")) {
				System.out.println("Exiting...");
				break;
			}
		}
		System.out.println("map" + mp);
		return mp;
	}

	public static void main(String[] args) {

		chkPhNum(mp);

	}

}
