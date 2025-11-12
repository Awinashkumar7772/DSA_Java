package cdac;
class Node{
	int data;
	Node next;
	 Node(int data) {
		
		this.data = data;
		this.next = null;
	}
}
public class Day03_Linked_List {
	Node head;
	void addNode(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	void displayNode() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+ "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// A linked list is a linear data structure where elements called (nodes)
		//are connected using pointers,unlike array do not store data in contiguous memory
		Day03_Linked_List ls = new Day03_Linked_List();
		
	   ls.addNode(10);
	   ls.addNode(20);
       ls.addNode(30);	  
       ls.addNode(40);
       ls.addNode(50);
       ls.displayNode();
	}

}
