import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String inputString = "saketkumar";
		char[] inputToArray = inputString.toCharArray();
		int count = 1;
		Map<Character, Integer> intoMap = new HashMap<Character, Integer>();
		for (int i = 0; i < inputToArray.length; i++) {
			char tempValue = inputToArray[i];
			if (intoMap.containsKey(tempValue)) {
				intoMap.put(tempValue, count + 1);
			} else {
				intoMap.put(tempValue, count);
			}
		}
		intoMap.entrySet().stream().filter(q -> q.getValue() == 1).collect(Collectors.toList())
				.forEach(z -> System.out.print("  " + z.getKey()));
	}
}
