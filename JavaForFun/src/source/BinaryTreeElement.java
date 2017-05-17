package source;

import java.util.Stack;

public class BinaryTreeElement {

	public static void findLeafs(int[] arr) {
		if (arr == null || arr.length == 0)
			return;

		Stack<Integer> stack = new Stack<Integer>();
		for(int n = 1, c = 0; n < arr.length; n++, c++) {
			if (arr[c] > arr[n]) {
				stack.push(arr[c]);
			} else {
				boolean found = false;
				while(!stack.isEmpty()) {
					
					if (arr[n] > stack.peek()) {
						stack.pop();
						found = true;
					} else 
						break;		
				}
				if (found) 
					System.out.println(arr[c]);	
			}

		}
		System.out.println(arr[arr.length-1]);
	}
	
	
	
	
	public static void main(String[] args) {

		BinaryTreeElement b = new BinaryTreeElement();
		
		int[] arr = {5,3,2,4,8,7,9};
		b.findLeafs(arr);
		
		
		

	}

}
