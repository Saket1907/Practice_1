import java.util.HashMap;
import java.util.Map;

import javax.xml.namespace.QName;

public class HashMapEmployee {

	public static void main(String[] args) {
		Map<Integer, String> myHashMap = new HashMap<Integer, String>();
		myHashMap.put(1, "Saket");
		myHashMap.put(2, "Kumar");
		
		myHashMap.entrySet().stream().filter(entry -> entry.getValue() == "Kumar")
		.forEach(q -> System.out.println(q.getKey()));
		for(int i=0; i < myHashMap.size(); i++) {
			if(myHashMap.containsValue("Kumar")) {
				System.out.println(myHashMap);
			}
		}

	}

}
