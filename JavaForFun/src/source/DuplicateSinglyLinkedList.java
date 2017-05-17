package source;

public class DuplicateSinglyLinkedList {

	static Node head;

	public class Node {
		int data;
		Node next;

		Node(int d) {

			data = d;
			next = null;
		}

	}

	void removeDuplicate() {
		System.out.println("head - >" + head.data);

		Node prev = head;
		Node next = head.next;

		if (head == null) {

			return;
		}

		while (prev.next != null) {
			System.out.println("PREV.data - > " + prev.data);
			System.out.println("current.data - > " + next.data);

			if (next.next != null) {
				if (prev.data == next.next.data) {

					prev = next;
					next = next.next.next;
					prev.next = null;
					prev = head.next;
					next = prev.next;

				} else {

					if (next.next != null) {

						next = next.next;

					} else {

						prev = prev.next;
						next = prev.next;

					}

				}
			}else{
				
				prev = prev.next;
				next = prev.next;

			}
		}

	}

	void printList() {

		Node temp = head;

		while (temp != null) {

			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

		System.out.println();
	}

	public void push(int new_data) {

		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

	public static void main(String[] args) {

		DuplicateSinglyLinkedList LinkedList = new DuplicateSinglyLinkedList();

		LinkedList.push(5);
		LinkedList.push(1);
		LinkedList.push(2);
		LinkedList.push(3);
		LinkedList.push(1);

		LinkedList.removeDuplicate();

		LinkedList.printList();
	}

}
