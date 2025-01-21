
public class CheckPalString {

	public static void main(String[] args) {
		String inputString = "radar";
		String revString = "";
		
		int inputInteger = 1331;
		int reverseInteger = 0;
		int reminder;
		
		for(int i = inputString.length() - 1; i  >= 0; i--) {
			revString = revString + inputString.charAt(i);
		}
		if(inputString.equals(revString)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		int originalNumber = inputInteger;
		while(inputInteger != 0) {
			reminder = inputInteger % 10;
			System.out.println("reminder - "+reminder);
			reverseInteger = reminder + (reverseInteger*10);
			System.out.println("reverseInteger - "+reverseInteger);
			inputInteger = inputInteger / 10;
			System.out.println("inputInteger - "+inputInteger);
		}
		System.out.println(reverseInteger);
		if(originalNumber == reverseInteger) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
