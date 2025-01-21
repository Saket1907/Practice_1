public class BjArray {

	public static void main(String[] args) {
		int n = 7;
		int col = 4;
		int[] input = new int[] {
			1, 2, 3, 4, 5, 6	
		};
		int len = input.length;

		int index = 0;

		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<col;j++)
		    {
		        int[][] ans = new int[7][4];
				ans[i][j] = input[index];
		        index++;
		        if(index>=len)
		          index = 0;
		    }
		}

	}

}
