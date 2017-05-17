package source;

import java.util.LinkedList;
import java.util.Queue;

//Java program on Binary Tree and BST

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class BinaryTree {

	Node root;

	private boolean isBalanced(Node node) {
		{
			if (node == null)
				return false;
			else {
				int maxlen = Math
						.max(maxDepthorHeight(node.left), maxDepthorHeight(node.right)) + 1;
				int minlen = Math
						.min(maxDepthorHeight(node.left), maxDepthorHeight(node.right)) + 1;

				return (maxlen - minlen) <= 1 ? true : false;
			}

		}

	}

	private int maxDepthorHeight(Node node) {
		if (node == null)
			return 0;
		else {
			return Math.max(maxDepthorHeight(node.left), maxDepthorHeight(node.right)) + 1;
		}
	}
	
	private Node LCA(Node node, int n1, int n2) 
    {
        if (node == null)
            return null;
  
        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.data > n1 && node.data > n2)
            return LCA(node.left, n1, n2);
  
        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.data < n1 && node.data < n2) 
            return LCA(node.right, n1, n2);
  
        return node;
    }
	
	 private int diameter(Node root)
	    {
	        if (root == null)
	            return 0;
	        int lheight = maxDepthorHeight(root.left);
	        int rheight = maxDepthorHeight(root.right);
	 
	        int ldiameter = diameter(root.left);
	        int rdiameter = diameter(root.right);

	        return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
	 
	    }
	
	 private void printLevelOrder() 
	    {
	        Queue<Node> queue = new LinkedList<Node>();
	        queue.add(root);
	        while (!queue.isEmpty()) 
	        {
	 
	            Node tempNode = queue.poll();
	            System.out.print(tempNode.data + " ");
	 
	            /*Enqueue left child */
	            if (tempNode.left != null) {
	                queue.add(tempNode.left);
	            }
	 
	            /*Enqueue right child */
	            if (tempNode.right != null) {
	                queue.add(tempNode.right);
	            }
	        }
	        
	    }
	 
	 
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.right.right = new Node(6);

		System.out.println("Height of tree is : " + tree.maxDepthorHeight(tree.root));
		System.out.println("Is tree balanced : " + tree.isBalanced(tree.root));
		Node lca = tree.LCA(tree.root, 5,3);
		System.out.println("LCA : " + lca.data);
		
		System.out.println("Tree Diameter: " + tree.diameter(tree.root));
		
		System.out.println("Level order Traversal: ");
		tree.printLevelOrder();
	}
}
