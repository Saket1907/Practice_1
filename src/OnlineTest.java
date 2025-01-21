import java.util.HashMap;
import java.util.Map;

public class OnlineTest {

	public static void main(String[] args) {
		String inputString = "saket kumar";
		String inputStringNoSpace = inputString.replaceAll("\\s", "");
		int i = 0;
		char[] inputToChar = inputStringNoSpace.toCharArray();
		Map<Character, Integer> mapToStoreString = new HashMap<Character, Integer>();
		for(i = 0; i < inputStringNoSpace.length(); i++) {
			char tempChar = inputToChar[i];
			if(mapToStoreString.containsKey(tempChar)) {
				mapToStoreString.put(tempChar, mapToStoreString.get(tempChar)+1);
			}else {
				mapToStoreString.put(tempChar, 1);
			}
		}
		
		mapToStoreString.entrySet().stream().forEach(System.out::println);

	}

}
