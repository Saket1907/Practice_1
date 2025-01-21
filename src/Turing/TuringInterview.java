package Turing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TuringInterview {
	
	public static void main(String[] args) {
		
		String s1 = "cat";
		String s2 = "act";
		
		if(s1.length() != s2.length()) {
			System.out.println("false case");
		}
		
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
				char[] toCharArray = s1.toCharArray();
		for(int i = 0; i <= toCharArray.length -1; i++) {
			char tempVal = toCharArray[i];
			
			if(myMap.containsKey(tempVal)) {
				myMap.put(tempVal, myMap.get(tempVal) +1);
			}else {
				myMap.put(tempVal, 1);
			}
		}
		for(int j = 0; j <= s2.length(); j++) {
			if(myMap.containsKey(s2.charAt(j))) {
				myMap.put(s2.charAt(j), myMap.get(s2.charAt(j) - 1));
			}else {
				System.out.println("not anagram");
			}
		}
		
	}
}
