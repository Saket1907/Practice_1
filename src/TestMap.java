import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//[0000001111111]
public class TestMap {

	public static void main(String[] args) {
		int[] inArray = { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1 };
		int[] opArray = new int[inArray.length];
		for (int i = 0;  i < inArray.length; i++) {
			if(inArray[i] == 0) {
				opArray[i] = 0;
			}else {
				opArray[inArray.length - (i + 1)] = 1;
			}
		}
		for(int i = 0; i < opArray.length; i++) {
			System.out.print(opArray[i]);
		}
	}

}
