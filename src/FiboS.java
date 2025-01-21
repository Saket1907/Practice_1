
public class FiboS {
	static int intial = 0;
	static int second = 1;
	static int storeFiboValue = 0;

	static void count(int count) {

		if (count > 0) {
			storeFiboValue = intial + second;
			intial = second;
			second = storeFiboValue;
			System.out.print("  " + storeFiboValue);
			count(count - 1);
		}
	}

	public static void main(String[] args) {
		int count = 7;
		count(count);

	}

}
