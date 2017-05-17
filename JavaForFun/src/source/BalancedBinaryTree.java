package source;

import java.util.Arrays;

class Tree {
	int data;
	Tree left, right;

	public Tree(int item) {
		data = item;
		left = right = null;
	}
}

class BalancedBinaryTree{
	Tree root;

	public static boolean isBalanced(Tree root) {
		if (root == null)
			return true;

		if (checkBalanced(root) == -1)
			return false;

		return true;
	}

	private static int checkBalanced(Tree root) {
		if (root == null) {
			return 0;
		}
		
		int l = checkBalanced(root.left);
		int r = checkBalanced(root.right);

		if (Math.abs(l - r) > 1) {
			return -1;
		}

		return Math.max(l, r) + 1;
	}

	static int missingNumber(int[] nums) {
	    int sum=0;
	    for(int i=0; i<nums.length; i++){
	        sum+=nums[i];
	    }
	 
	    int n=nums.length;
	    return n*(n+1)/2-sum;
	}

	public static void main(String[] args) {
		BalancedBinaryTree b = new BalancedBinaryTree();
		b.root = new Tree(1);
		b.root.left = new Tree(2);
		b.root.right = new Tree(3);
		b.root.left.left = new Tree(4);
		b.root.left.right = new Tree(5);
		

		System.out.println(isBalanced(b.root));
		
		
		int [] nums = {0,1,3,4,5};
		
		
		System.out.println(missingNumber(nums));
		
		
	}

}
