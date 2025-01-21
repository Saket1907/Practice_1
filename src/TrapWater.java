import java.util.Arrays;

public class TrapWater {
    public static int trap(int[] height){
            int unitOfTrappedWater = 0;  
            int placeHolderForWater;     
            int[] temp = height.clone();
            Arrays.sort(temp);
            if(height.length == 0 || height.length <= 2){
                return unitOfTrappedWater;
            }else{
                placeHolderForWater = temp[temp.length - 2];
            }
            if(height[0]== 0){
                for(int j = 2; j < height.length-2; j++){
                    unitOfTrappedWater = unitOfTrappedWater + (placeHolderForWater - height[j]);
                }
            }else{
                for(int j = 1; j < height.length-1; j++){
                    unitOfTrappedWater = unitOfTrappedWater + (placeHolderForWater - height[j]);
                }
            }
        return unitOfTrappedWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
