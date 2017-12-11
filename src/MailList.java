import java.util.LinkedList;

class Address {
	String name;
	String street;
	String city;
	String state;
	String code;

	Address(String n, String s, String c, String st, String cd) {
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;

	}

	public String toString() {
		return name + "\n" + street + "\n" + city + " " + state + " " + code;
	}
}

public class MailList {

	public static void main(String[] args) {

		LinkedList<Address> ll = new LinkedList<Address>();
		ll.add(new Address("Saket", "Housing Colony", "Dhanbad", "Jharkhand",
				"826001"));
		ll.add(new Address("Neha", "Anna Colony", "Tripur", "TN", "659840"));
		ll.add(new Address("Anit", "Housing Road", "Patna", "Bihar", "893256"));

		for (Address element : ll)

			System.out.println(element + " ");
		System.out.println();
		System.out.println();

	}

}