import java.util.Arrays;

public class ShiftingArray {
    public static void main(String[] args) {
        int[] inputArray = {
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11
        };
        int[] shiftedArray = new int[inputArray.length];
        int placeHolderForUnitShift = 6;
        int rightArrayLeftShift = 0;
        if (placeHolderForUnitShift > inputArray.length) {
            placeHolderForUnitShift = placeHolderForUnitShift % inputArray.length;
        }
        int leftArrayRightShift = placeHolderForUnitShift;
        shiftArray(inputArray, shiftedArray, placeHolderForUnitShift, rightArrayLeftShift, leftArrayRightShift);
        printShiftedArray(shiftedArray);
    }

    private static void shiftArray(int[] inputArray, int[] shiftedArray, int placeHolderForUnitShift, int rightArrayLeftShift,
            int leftArrayRightShift) {       
            for (int i = inputArray.length - placeHolderForUnitShift; i <= inputArray.length - 1; i++) {
                shiftedArray[rightArrayLeftShift] = inputArray[i];
                rightArrayLeftShift++;
            }
            for (int i = 0; i <= inputArray.length - placeHolderForUnitShift - 1; i++) {
                shiftedArray[leftArrayRightShift] = inputArray[i];
                leftArrayRightShift++;
            } 
            System.out.println(Arrays.toString(shiftedArray)); 
    }

    private static void printShiftedArray(int[] shiftedArray) {
        System.out.println(Arrays.toString(shiftedArray)); 
        }   
}
