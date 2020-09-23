import java.util.LinkedList;
import java.util.Queue;

class Node {

    Node left=null, right=null;
    int data;
    public Node(int data)
    {
        this.data=data;
        left=right=null;
    }

}

/* Class to print Level Order Traversal */
class BinaryTree {

    Node root;

    /* Given a binary tree. Print its nodes in level order
    using array for implementing queue */
    void printLevelOrder()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty())
        {

			/* poll() removes the present head.
			For more information on poll() visit 
			http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
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

    public static void main(String args[])
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

        System.out.println("Level order traversal of binary tree is - ");
        tree.printLevelOrder();
    }
}