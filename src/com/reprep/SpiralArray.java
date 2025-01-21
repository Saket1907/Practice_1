package com.reprep;

import java.util.ArrayList;
import java.util.List;

public class SpiralArray {
    public static void normalFlow(int[][] input2DArray){
        for(int i = 0; i <= input2DArray.length - 1; i++){
            for(int j = 0; j <= input2DArray[i].length -1 ; j++){
                System.out.print(input2DArray[i][j]+" ");
            }
        }
    }

    public static List<Integer> spiralFLow(int[][] input2DArray){
        int left = 0;
        int right = input2DArray[0].length - 1;
        int top = 0;
        int bottom = input2DArray.length -1;
        List<Integer> oututList = new ArrayList<Integer>();
        while(left <= right || top <= bottom){
            if(left <= right && top <= bottom){
                for(int i = left; i <= right; i++){
                    oututList.add(input2DArray[top][i]);               
                }
                top++;
            }
            if(top <= bottom){    
                for(int j = top; j <= bottom; j++){
                oututList.add(input2DArray[j][right]);
                }
                right--;
            }
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    oututList.add(input2DArray[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int j = bottom; j >= top; j--){
                    oututList.add(input2DArray[j][left]);
                }
                left++;
            }
            
        }
        return oututList;
    }
    public static void main(String[] args) {
        int[][] input2DArray = new int[][] {
            {1, 2, 3, 4}
            
        };
        //expected output  -> 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10
        normalFlow(input2DArray);
        System.out.println(spiralFLow(input2DArray));
    }
}
