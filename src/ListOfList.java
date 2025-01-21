import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		List<List<String>> myList = new ArrayList<List<String>>();
	    myList.add(Arrays.asList("saket", "kumar", "rahul", "dhanbad"));
	    myList.add(Arrays.asList("ok", "fine", "its", "nice"));
	    myList.add(Arrays.asList("we", "will", "meet"));
	    System.out.println(myList.get(2).get(0));
	    
	    myList.stream().forEach(System.out::println);
	    
	    for(int i = 0; i < myList.size(); i++) {
	    	System.out.println(myList.get(i).size());
	    }
	}

}
