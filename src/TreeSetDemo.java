import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("A");
		ts.add("Z");
		ts.add("1");
		ts.add("@");
		ts.add("R");
		ts.add("2");
		ts.add("P");
		
		System.out.println("TreeList : "+ts);
		
		System.out.println(ts.subSet("A", "T")); // Subset of string. 
	}

}