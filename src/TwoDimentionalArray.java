public class TwoDimentionalArray {

	public static void main(String[] args) {
		int i, j, sum = 23;
		int arr[][] = new int[4][5];

		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				arr[i][j] = sum;
				sum++;
			}
		}
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				System.out.println("arr[" + i + "][" + j + "]"+ " = " + arr[i][j]
						+ "\t");
			}
			System.out.println();
		}
		System.out.println();
	}

}
