import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListRepeat {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		Set<String> mySet = new HashSet<String>();
		myList.add("saket");
		myList.add("ravi");
		myList.add("ravi");
		myList.add("kumar");
		myList.add("rahul");
		myList.add("saket");
		myList.add("rajan");
		myList.add("saket");
		myList.add("ravi");

		for(int i = 0; i < myList.size(); i++) {
			for(int j = i+1; j < myList.size(); j++) {
				if(myList.get(i).equals(myList.get(j))) {
					System.out.println(myList.get(i));
					System.out.println(myList.get(j));
					myList.remove(j);
				}
			}
		}
	}

}
