package source;


import java.io.IOException;
import java.util.Scanner;

public class GroupNums {

	static int[] groupFor1;
	static int[] groupFor2;
	static int[] groupFor3;
	static int[] groupFor4;
	static int[] groupFor5;
	
	public static void countNum(int[] groupFor1, int[] groupFor2,int[] groupFor3, int[] groupFor4, int[] groupFor5) {
		/*
		 * Arrays.sort(groupFor1); Arrays.sort(groupFor2);
		 * Arrays.sort(groupFor3); Arrays.sort(groupFor4);
		 * Arrays.sort(groupFor5);
		 */
		int count = 1;
		for (int i = 0; i < groupFor1.length; i++) {
			for (int j = i + 1; j < groupFor1.length; j++) {
				if (groupFor1[i] == groupFor1[j] && groupFor1[j] != 0 && groupFor1[i] != 0) {
					count++;
					System.out .println("Duplicate number present in ( group 1 )" + groupFor1[i] + " " +"("+ count + ")"+ " times");
				} else if (groupFor2[i] == groupFor2[j] && groupFor2[j] != 0 && groupFor2[i] != 0) {
					count++;
					System.out.println("Duplicate number present in ( group 2 ) " + groupFor2[i] + " " +"("+ count + ")"+ " times");
				} else if (groupFor3[i] == groupFor3[j] && groupFor3[j] != 0 && groupFor3[i] != 0) {
					count++;
					System.out.println("Duplicate number present in ( group 3 ) " + groupFor3[i] + " " +"("+ count + ")"+ " times");
				} else if (groupFor4[i] == groupFor4[j] && groupFor4[j] != 0 && groupFor4[i] != 0) {
					count++;
					System.out.println("Duplicate number present in ( group 4 ) " + groupFor4[i] + " " +"("+ count + ")"+ " times");
				} else if (groupFor5[i] == groupFor5[j] && groupFor5[j] != 0 && groupFor5[i] != 0) {
					count++;
					System.out.println("Duplicate number present in ( group 5 )"+ groupFor5[i] + " " +"("+ count + ")"+ " times");
				} else {
					count = 1;
				}

			}
		}
	}


	public static void AddgroupNum(int[] nums) throws IOException {
		int length = nums.length;
		int len = 0;
		groupFor1 = new int[length];
		groupFor2 = new int[length];
		groupFor3 = new int[length];
		groupFor4 = new int[length];
		groupFor5 = new int[length];
		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				len = Integer.valueOf(nums[i]);
				if (String.valueOf(len).length() > 1 && String.valueOf(len).length() < 3) {
					groupFor2[i] = len; 
				} else if (String.valueOf(len).length() > 0 && String.valueOf(len).length() < 2) {
					groupFor1[i] = len;
				} else if (String.valueOf(len).length() > 1 && String.valueOf(len).length() < 4) {
					groupFor3[i] = len; 
				} else if (String.valueOf(len).length() > 1 && String.valueOf(len).length() < 5) {
					groupFor4[i] = len;
				} else if (String.valueOf(len).length() > 1 && String.valueOf(len).length() < 6) {
					groupFor5[i] = len;
				}

				if (groupFor2[i] != 0) {
					System.out.println("Numbers added to the (group 2): " + groupFor2[i]);
				} else if (groupFor1[i] != 0) {
					System.out.println("Numbers added to the (group 1): " + groupFor1[i]);
				} else if (groupFor3[i] != 0) {
					System.out.println("Numbers added to the (group 3): " + groupFor3[i]);
				} else if (groupFor4[i] != 0) {
					System.out.println("Numbers added to the (group 4): " + groupFor4[i]);
				} else if (groupFor5[i] != 0) {
					System.out.println("Numbers added to the (group 5): " + groupFor5[i]);
				}
			}
		}
		System.out.println("=================================");
		countNum(groupFor1, groupFor2, groupFor3, groupFor4, groupFor5);

	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the window size: ");
		int count = sc.nextInt();

		System.out.println("Now enter numbers: ");
		int[] inpNum = new int[count];
		int i = 0;
		while (sc.hasNext() == true) {
			if (!sc.hasNext("exit")) {
				inpNum[i] = sc.nextInt();
				i++;
			}

			if (sc.hasNext("exit")) {
				break;
			}

		}

		System.out.println("The loop is ended and forwarded for processing");
		System.out.println("===================================");
		AddgroupNum(inpNum);

	}

}
