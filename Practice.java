
class Node3 {
	int data;
	Node3 next;

	Node3(int data) {
		this.data = data;
		this.next = null;
	}
}

class SSinglyLinkedList {
	Node3 head;

	void insertAtEnd(int data) {
		Node3 newNode = new Node3(data);
		if (head == null) {
			head = newNode;
		} else {
			Node3 temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	void insertAtStart(int data) {
		Node3 newNode = new Node3(data);
		newNode.next = head;
		head = newNode;
	}

	void deleteAtEnd() {
		if (head == null) {
			System.out.println("Already empty");
			return;
		}
		Node3 temp = head;
		Node3 prev = head;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}

	void deleteAtValue(int value) {
		if (head == null) {
			System.out.println("Empty");
			return;
		}
		Node3 temp = head;
        Node3 prev = head;
		while (temp.next != null && temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		temp.next = null;
		

	}

	void display() {
		Node3 temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println("null");
	}
}

public class Practice {
	public static void main(String[] args) {
		SSinglyLinkedList sl = new SSinglyLinkedList();
		sl.insertAtEnd(10);
		sl.insertAtEnd(20);
		sl.insertAtEnd(30);
		sl.insertAtEnd(40);
		sl.deleteAtValue(30);

		sl.insertAtStart(5);

		sl.display();
	}
}
