import java.util.List;

public class DifferenceInChar {
	private int findChars(String parentString, String toFindCharInBetween) {
		String newString = parentString.replaceAll("\\s", "");
		char[] newStringToChar = newString.toCharArray();
		int i = 0;
		for(i = 0; i < newStringToChar.length; i++) {
			if(String.valueOf(newStringToChar[i]).equals(toFindCharInBetween)) {
				System.out.println("Value of i = "+i);
			}
			System.out.println("value of total i = "+i);
		}
		return 0;
	}

	public static void main(String[] args) {
		String parentString = "my name is saket";
		String toFindCharInBetween = "a";
		DifferenceInChar dic = new DifferenceInChar();
		dic.findChars(parentString, toFindCharInBetween);
	}
}
