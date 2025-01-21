public class ImplementLinkedList {
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node head;

	private void printMiddle() {
		Node slow_pointer = head;
		Node fast_pointer = head;
		if (head != null) {
			while (fast_pointer != null && fast_pointer.next != null) {
				fast_pointer = fast_pointer.next.next;
				slow_pointer = slow_pointer.next;
			}
			System.out.println("Middle element is :: " + slow_pointer.data);
		}
	}

	private void push(int i) {
		Node node = new Node(i);
		node.next = head;
		head = node;
	}

	private void printList() {
		Node tNode = head;
		while (tNode != null) {
			System.out.print(tNode.data + " ->");
			tNode = tNode.next;
		}
		System.out.println("Null");
	}

	public static void main(String[] args) {
		ImplementLinkedList ill = new ImplementLinkedList();
		for (int i = 5; i > 0; i--) {
			ill.push(i);
			ill.printList();
			ill.printMiddle();
		}

	}
}
