import java.util.Scanner;

public class StringToArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		System.out.println("Entered Name: " + input);

		char[] arr = input.toCharArray();
		for (int i = 0; i <= arr.length; i++) {
			System.out.print(arr[i]);

		}
		System.out.println("Length of Array : " + arr.length);
		
	}
	
}
