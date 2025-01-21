public class BinarySearch {

	public static void main(String[] args) {
		int[] inputArray = new int[] { 10, 12, 24, 29, 39, 40, 51, 56, 69 };
		int toBeFound = 56;

		int resultForBS = binarySearch(inputArray, 0, inputArray.length - 1, toBeFound);

		if (resultForBS == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("Found");
		}
	}

	private static int binarySearch(int[] inputArray, int initial, int end, int toBeFound) {
		int mid;
		if (end >= initial) {
			mid = (initial + end) / 2;
			if (inputArray[mid] == toBeFound) {
				return mid + 1;
			} else if (inputArray[mid] > toBeFound) {
				return binarySearch(inputArray, initial, mid - 1, toBeFound);
			} else {
				return binarySearch(inputArray, mid + 1, end, toBeFound);
			}
		}
		return -1;
	}
}
