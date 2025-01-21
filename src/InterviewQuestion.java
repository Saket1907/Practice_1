import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewQuestion {

	public static void main(String[] args) {
		//He won't be any happier there than he was here. I could not walk any farther. I can't eat any more pizza.
		
		String inputString = "He won't be any happier there than he was here. I could not walk any farther. I can't eat any more pizza.";
		inputString.replaceAll(".", " ");
		String[] splitedString = inputString.split(" ");  // [He, won't, ....... , pizza]
		String tempVal = null; 
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		for(int i = 0; i <= splitedString.length - 1; i++) {
			tempVal = splitedString[i];
			if(!myMap.containsKey(tempVal)) {
				myMap.put(tempVal, 1);
			}else {
				myMap.put(tempVal, myMap.get(tempVal) + 1);
			}	
		}
		myMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed().reversed()).forEach(r->System.out.println(r));
		
		
		

	}

}
