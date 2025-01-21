
public class BinaryOdd1sCount {

	
	public static void main(String[] args) {
		int inputPow = 4;
		int outputWithPow = (int) Math.pow(2, inputPow) - 1;
		int totalCount = 0;
		System.out.println(outputWithPow);

		for (int i = 1; i < outputWithPow; i++) {
			int totalCountOfOdd1s = 0;
			String toBinary = Integer.toBinaryString(i);
			for(int k = 0; k < toBinary.length(); k++) {
				char temp = toBinary.charAt(k);
				if (String.valueOf(temp).equals("1")) {
					totalCountOfOdd1s++;
					System.out.println("totalCountOfOdd1s :: "+totalCountOfOdd1s);
				}
			}
			if (totalCountOfOdd1s / 2 != 0) {
				totalCount++;
				System.out.println("totalCount :: "+totalCount);
			}
		}
		System.out.println(totalCount);
	}

}
