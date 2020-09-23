package com.santosh.algo;

public class BinaryTree {
    Node root;
 
    int minimumDepth()
    {
        return minimumDepth(root);
    }
 

    @SuppressWarnings("unused")
	int minimumDepth(Node root)
    {
    	System.out.print(root.data+ " ");
    	
			if (root == null)
			    return 0;

			 // Base case : Leaf Node. This accounts for height = 1.
			if (root.left == null && root.right == null)
			    return 1;
 
			  // If left subtree is NULL, recur for right subtree
			if (root.left == null)
			    return minimumDepth(root.right) + 1;
 
			
			// If right subtree is NULL, recur for left subtree
			if (root.right == null)
			    return minimumDepth(root.left) + 1;
 
        return Math.min(minimumDepth(root.left),
                        minimumDepth(root.right)) + 1;
    }
 
    public static void main(String args[])
    {
    	/*
    	 * 					1
    	 * 				  /   \
    	 * 				 2	    3
    	 *             /   \   /  \
    	 *            4     5  6    7
    	 *           /
    	 *           8
    	 * 
    	 */
    	
    	
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left= new Node(6);
        tree.root.right.right= new Node(7);
        tree.root.left.left.left= new Node(8);
 
        System.out.println("The minimum depth of "+
          "binary tree is : " + tree.minimumDepth());
    }
}