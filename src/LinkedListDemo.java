import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("S");
		ll.add("A");
		ll.add(2, "K");
		ll.addLast("R");
		ll.addFirst("Saket");

		System.out.println("LinkedList : " + ll);

		ll.remove("Saket");
		System.out.println("LinkedList : " + ll);

		ll.addFirst("Neha Idiot");
		System.out.println("LinkedList : " + ll);

		String val = ll.get(3);
		System.out.println("Value [3] : " + val);
		ll.set(3, "Changed");

		System.out.println("LinkedList : " + ll);

	}

}