import java.util.HashSet;
import java.util.Set;

public class CheckPalStringInAnyString {

	public static void main(String[] args) {

		String inputString = "nameissaketradariuseyes";
		
		Set<String> outputSet = findPalUsingCentre(inputString);
		System.out.println(outputSet);

	}

	public  static Set<String> findPalUsingCentre(String inputString) {
		Set<String> thisSet = new HashSet<>();
		for(int i = 0; i < inputString.length(); i++) {
			thisSet.addAll(findPal(inputString, i, i + 1));
			thisSet.addAll(findPal(inputString, i, i));
		}
		return thisSet;
	}

	public  static Set<String> findPal(String inputString, int low, int high) {
		Set<String> result = new HashSet<>();
		while(low >= 0 && high < inputString.length() && inputString.charAt(low) == inputString.charAt(high)) {
			result.add(inputString.substring(low, high + 1));
			low--;
			high++;
		}
		return result;
	}
	
}
