public class OverloadingExample {

	public static void main(String[] args) {
		
		printFromHere("saket Kumar");
		printFromHere(1);

	}

	private static void printFromHere(String string) {
		System.out.println("here in string one");		
	}
	private static void printFromHere(Object string) {
		System.out.println("here in object one");		
	}
	private static void printFromHere(Integer i) {
		System.out.println("here in integer one");		
	}

}
