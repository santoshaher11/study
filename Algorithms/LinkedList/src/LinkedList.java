class Node
{
Node next;
int data;

Node(int data)
{
	this.data=data;
	this.next=null;
}
}

public class LinkedList {

	public static void printList(Node head)
	{
		System.out.println("\nCurrent list is : ");
		if(head==null)
		{
			System.out.println("Current list is empty");
		}
		while(head!=null)
		{
			
			System.out.print(" "+ head.data);
			head=head.next;
		}
		
	}
	
	public static Node reverseList(Node head)
	{
		Node prev, current, next;
		
		prev=null;
		current=head;
		next=head.next;
		while(next !=null)
		{
			System.out.print(" \nCurrent: "+current.data);
			System.out.print(" Next: "+next.data);
			if(prev!=null)System.out.print(" prev: "+prev.data);

			current.next=prev;//This is the important line that's it.
			prev=current;
			current=next;
			next=next.next;
		}
		current.next=prev; //This is the important line that's it.
		return current;
	}
	
	public static Node deleteNode(int data, Node head)
	{
		System.out.println("\nTrying to delete "+data);
		Node current, prev;
		current=head;
		prev=null;
		
		while(current!=null)
		{
			
			if(current.data==data)
			{
				if(prev==null)
				{
					head=current.next;
				}
				else
				{
					prev.next=current.next;
				}
				return head;
			}
			
			prev=current;
			current=current.next;
		}
		
		System.out.println("Could not find the node to delete");
			return head;
		
	}
	
	public static Node insertAtTail(Node head, int data)
	{ 
		Node node;
	    node=head;
	
		while(node.next!=null)
		{
			node=node.next;
		}
		node.next=new Node(data);
		return head; 
	}
	
	public static Node insertAtHead(Node head, int data)
	{ 
		Node node;
		node=new Node(data);
		node.next=head;
		return node; 
	}
	
	
	public static void main(String[] args) {
		Node head=null;
		head=new Node(1);
		head=insertAtTail(head, 2);
		head=insertAtTail(head, 3);
		head=insertAtTail(head, 4);
		head=insertAtTail(head, 5);
		head=insertAtTail(head, 6);
		
		head=insertAtHead(head, 0);
		
		printList(head);
		head=reverseList(head);
		printList(head);
		/*
		head=deleteNode(3, head);
		head=deleteNode(4, head);
		head=deleteNode(1, head);
		
		head=deleteNode(10, head);
		head=deleteNode(2, head);
		head=deleteNode(5, head);
		head=deleteNode(6, head);
		head=deleteNode(6, head);
		printList(head);
		*/
		
	}

}
