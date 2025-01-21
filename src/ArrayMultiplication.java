
public class ArrayMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1, 2, 3, 4]
		// [24, 12, 8, 6]
		
		int arr[] = {1, 2, 3, 4};
		for(int i = 0; i <= arr.length - 1; i++){
			arr[i] = arr[i]*arr[i];
			System.out.println(arr[i]);
			
		}

	}

}
