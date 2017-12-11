import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		

		String result = (a == 0 && b == 0)? "No Value"
				          :(a == b)? "Match"
				             :"Mismatch";
		System.out.println(result);

	}

}
