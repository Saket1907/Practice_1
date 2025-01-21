
public class RotateArray {

	public static void main(String[] args) {
		// input array = [1,2 ,3, 4, 5, 6, 7]  ->2 user
		// output array = [3, 4, 5, 6, 7, 1, 2]

		int inputArray[] = {1, 2, 3, 4, 5, 6, 7};
		int outputArray[] = new int[inputArray.length];
		int shiftBy = 2;
		int j = 0;
	
		for(int i = shiftBy; i < inputArray.length; i++) {
			outputArray[j] = inputArray[i];
			j++;
		}
		for(j = inputArray.length - shiftBy; j < outputArray.length; j++) {
			for(int i = 0; i < shiftBy; i++) {
				outputArray[j] = inputArray[i];
			}
		}
		for(int i = 0; i < outputArray.length; i++) {
			System.out.println(outputArray[i]);
		}
	}

}
