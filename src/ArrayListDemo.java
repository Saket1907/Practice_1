import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Intial size of ArrayList : " + al.size());
		al.add("S");
		al.add("A");
		al.add("K2");
		al.add(1, "G");
		al.add("KU");
		System.out.println("Intial size of ArrayList : " + al.size());

		System.out.println("ArrayList : " + al);

		al.remove(2);
		System.out.println("ArrayList : " + al);
		System.out.println("Intial size of ArrayList : " + al.size());

		al.remove("G");
		System.out.println("ArrayList : " + al);
		System.out.println("Intial size of ArrayList : " + al.size());
	}

}