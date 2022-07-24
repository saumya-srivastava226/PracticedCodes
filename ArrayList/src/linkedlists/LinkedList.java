package linkedlists;

public class LinkedList {
	
	Node head;// first node of the link
	// The inner class is made static so that the main can access it
	static class Node{
		int data;// integer type data
		Node next;// the reference to the next node
		
		Node(int d)
		{
			data=d;
			next=null;
			
		}
	}
	
	public  void printList() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data+ " ");
			n=n.next;
		}
	}
	
	public static void main(String args[]) {
		LinkedList llist= new LinkedList();
		
		llist.head=new Node(1);
		Node first=new Node(2); 
		Node second=new Node(3);
		
		llist.head.next=first;
		first.next=second;
		llist.printList();
	}
	

}
