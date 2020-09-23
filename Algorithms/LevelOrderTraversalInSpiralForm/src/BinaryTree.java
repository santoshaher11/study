// Java implementation of an O(n) approach of level order
// traversal in spiral form

import java.util.*;

// A Binary Tree node
class Node 
{
	int data;
	Node left, right;

	public Node(int item) 
	{
		data = item;
		left = right = null;
	}
}

class BinaryTree 
{

	Node root;

	void printSpiral(Node node) 
	{
		if (node == null) 
			return; // NULL check

		// Create two stacks to store alternate levels
		Stack<Node> s1 = new Stack<Node>();// For levels to be printed from right to left
		Stack<Node> s2 = new Stack<Node>();// For levels to be printed from left to right

		// Push first level to first stack 's1'
		s1.push(node);

		// Keep ptinting while any of the stacks has some nodes
		while (!s1.empty() || !s2.empty()) 
		{
			// Print nodes of current level from s1 and push nodes of
			// next level to s2
			while (!s1.empty()) 
			{
				Node temp = s1.peek();
				s1.pop();
				System.out.print(temp.data + " ");

				// Note that is right is pushed before left
				if (temp.right != null) 
					s2.push(temp.right);
				
				if (temp.left != null) 
					s2.push(temp.left);
				
			}

			// Print nodes of current level from s2 and push nodes of
			// next level to s1
			while (!s2.empty()) 
			{
				Node temp = s2.peek();
				s2.pop();
				System.out.print(temp.data + " ");

				// Note that is left is pushed before right
				if (temp.left != null)
					s1.push(temp.left);
				if (temp.right != null)
					s1.push(temp.right);
			}
		}
	}

	public static void main(String[] args) 
	{
    	/*
    	 * 					5
    	 * 				  /   \
    	 * 				 2	    7
    	 *             /   \   /  \
    	 *            1     3  6    8
    	 *                   \       \
    	 *                    4        9
    	 *           
    	 * 1234 5 6789
    	 */
    	
    	
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.right= new Node(7);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(3);
        tree.root.left.right.right = new Node(4);
        tree.root.right.left= new Node(6);
        tree.root.right.right= new Node(8);
        tree.root.right.right.right= new Node(9);
        
		System.out.println("Spiral Order traversal of Binary Tree is ");
		tree.printSpiral(tree.root);
	}
}

