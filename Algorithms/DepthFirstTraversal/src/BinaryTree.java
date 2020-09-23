
class Node {

	Node left=null, right=null;
	int data;
	public Node(int data)
	{
		this.data=data;
		left=right=null;
	}
	
}


public class BinaryTree {
    Node root;
 
  public void inorder(Node node)
  {
	  if(node==null)
		  return ;
	  
	  inorder(node.left);
	  System.out.print(node.data +" ");
	  inorder(node.right);
  }
  
  public void preorder(Node node)
  {
	  if(node==null)
		  return ;
	  
	  System.out.print(node.data +" ");
	  preorder(node.left);
	  preorder(node.right); 
  }
  
  public void postorder(Node node)
  {
	  if(node==null)
		  return ;
	  
	  postorder(node.left);
	  postorder(node.right);
	  System.out.print(node.data +" ");
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
 
        System.out.print("\nPreorder Taversal of a tree : ");
        tree.preorder(tree.root);
        
        System.out.print("\nInorder Taversal of a tree : ");
        tree.inorder(tree.root);
        
        System.out.print("\nPostorder Taversal of a tree : ");
        tree.postorder(tree.root);
    }
}