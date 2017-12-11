import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class AlgorithmsDemo {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(-89);
		ll.add(27);
		ll.add(55);
		ll.add(-8);
		ll.add(0);
		ll.add(20);

		Comparator<Integer> r = Collections.reverseOrder();
		Collections.sort(ll, r);

		System.out.print("List Sorted in Reverse : ");
		for (int i : ll)
			System.out.println(i + " ");

		System.out.println();

		Collections.shuffle(ll);
		System.out.println("List Shuffled : ");
		for (int i : ll)
			System.out.println(i + " ");

		System.out.println();

		System.out.println("Maximum : " + Collections.max(ll));
		System.out.println("Minium : " + Collections.min(ll));

	}

}