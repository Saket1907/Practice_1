
public class ArrayPair {

	public static void main(String[] args) {
		int[] inputArray = {1, 3, 5, 8, 10, 7, 6, 9} ;
		int temp;
		for(int i = 0; i < inputArray.length; i = i+2) {
			temp = inputArray[i];
			inputArray[i] = inputArray[i +1];
			inputArray[i+1] = temp;
		}
		for(int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i]);
		}

	}

}
