import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add("I");

		System.out.println("Initial Content : " + al);

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		ListIterator litr = al.listIterator();
		while (litr.hasNext()) {
			Object element = litr.next();
			System.out.print(element + "+ ");
		}
		System.out.println("Modified List : " + al);

		System.out.print("Modified list backwards: ");
		while (litr.hasPrevious()) {
			Object element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
