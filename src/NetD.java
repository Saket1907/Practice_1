import java.util.Arrays;

public class NetD {

	public static void main(String[] args) {
		int[][] inputArray = {{1, 1, 1},{1, 0, 1}, {1, 1, 1}};
		
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(inputArray[i][j] == 0) {
					for(int k = 0; k < 3; k++) {
						inputArray[k][j] = 0;
					}
					for(int l = 0; l < 3; l++) {
						inputArray[i][l] = 0;
					}
					break;
				}
			}
		}
		System.out.println(Arrays.toString(inputArray));
		for(int p = 0; p < 3; p++) {
			for(int q = 0; q < 3; q++) {
				System.out.println(inputArray[p][q]);
			}
		}

	}

}
