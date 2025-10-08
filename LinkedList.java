
class Node {
	int data; // storing value of the node
	Node next; // pointing to the next node

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class SinglyLinkedList {
	Node head; // this is head of the list

	// inserting at the end of the list
	void insertAtEnd(int data) {
		Node newNode = new Node(data); // created a new node but this is not connected yet
		if (head == null) {
			head = newNode; // if list is empty newNode becomes head
		} else {
			Node temp = head; // start from the head
			while (temp.next != null) { // Traverse to the last node
				temp = temp.next;
			}
			temp.next = newNode; // link last node to the new node
		}
	}

	void insertAtStart(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	void insertInAfter(int data, int target) {
		Node newNode = new Node(data);

		if (head == null) {
			System.out.println("List is empty cannot insert after target");
			return;
		}
		Node temp = head;

		while (temp != null && temp.data != target) {
			temp = temp.next; // traverse until target is found

		}
		if (temp == null) {
			System.out.println("Target is not in the list");
			return;
		}
		System.out.println(temp.data);
		System.out.println(temp.next.data);
		newNode.next = temp.next; // link the newNode to the next of the target
		temp.next = newNode; // link target to the new node

	}

	void insertInBefore(int data, int target) {
		Node newNode = new Node(data);

		if (head == null) {
			System.out.println("List is empty and new Node cannot be inserted before the target");
			return;
		}
		Node prev = head;
		Node temp = head; // traversing from the head
		while (temp != null && temp.data != target) {
			prev = temp;
			temp = temp.next;
		}
		newNode.next = temp;
		prev.next = newNode;

	}

	void display() {
		Node temp = head; // start from head
		while (temp != null) {
			System.out.print(temp.data + " -> "); // print the node data
			temp = temp.next; // move to the next node
		}
		System.out.println("null");
	}
}

public class LinkedList {
	public static void main(String[] args) {
		SinglyLinkedList sl = new SinglyLinkedList();
		sl.insertAtStart(10);
		sl.insertAtEnd(20);
		sl.insertAtEnd(30);
		sl.insertAtStart(5);

		sl.insertInBefore(25, 20);
		

		sl.display();
	}

}
