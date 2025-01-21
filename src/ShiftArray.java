public class ShiftArray {

	public static void main(String[] args) {
		int [] inputArray = new int[] {
				1, 2, 3, 4, 5, 6, 7
		};
		int numberOfTimesToBeRotated = 3;
		for(int i = 0; i < numberOfTimesToBeRotated; i++) {
			int j, last;
			last = inputArray[inputArray.length - 1];
			
			for(j = inputArray.length - 1; j > 0; j--) {
				inputArray[j] = inputArray[j - 1];
			}
			inputArray[0] = last;
		}
		System.out.println("Printing array ------------------->");
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}

}
