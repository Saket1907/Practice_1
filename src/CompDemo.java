import java.util.Comparator;
import java.util.TreeSet;

class MyComp implements Comparator<String> {

	public int compare(String a, String b) {
		String aStr, bStr;
		aStr = a;
		bStr = b;
		return bStr.compareTo(aStr);
	}
}

class CompDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(new MyComp());

		ts.add("C");
		ts.add("B");
		ts.add("A");
		ts.add("D");
		ts.add("E");

		for (String element : ts)
			System.out.print(element + " ");

		System.out.println();

	}
}