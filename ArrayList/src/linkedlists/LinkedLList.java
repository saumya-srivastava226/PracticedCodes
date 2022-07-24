package linkedlists;

public class LinkedLList {
	Node head;// The first element of the linked list
	// Inner clas is made static so it can be called from main function
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
			next=null;
		}
		
	}
	public void printList() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	// We are going to define a function that is going to add vales in the beginning of the link
	public void push(int newData) {
		Node newNode=new Node(newData);
		newNode.next=head;
		head=newNode;
	}
	void deleteNode(int key) {
		Node temp=head,prev=null;
		if(temp!=null&&temp.data==key) {
			head=temp.next;
			return;
		}
		while(temp!=null&&temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}
		if(temp==null) {
			return;
		}
		prev.next=temp.next;
	}
	public static void main(String args[]) {
		LinkedLList ll=new LinkedLList();
		ll.head=new Node(23);
		Node second= new Node(34);
		Node third =new Node(66);
		Node fourth=new Node(22);
		
		// We know need to do the linking
		
		
		ll.head.next=second;
		second.next=third;
		third.next=fourth;
		ll.push(67);
		ll.printList();
		ll.deleteNode(67);
		ll.deleteNode(22);
		ll.printList();
		
	}

}
