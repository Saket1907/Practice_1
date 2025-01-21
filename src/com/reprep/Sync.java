package com.reprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sync {
    public static void main(String args[]){
        int[]  inputArray = {6,3,10,5,1};
        int k = 3;
        //op - [3 5 6] 

        int minUnfair = 0;

        List<Integer> oList = new ArrayList<Integer>();

        //Arrays.sort(inputArray);
        //System.out.println(Arrays.toString(inputArray));

        for(int i = 0; i <= inputArray.length -1; i++){
            for(int j = 0; j <= inputArray.length -1; j++){
                int tempUnfair = inputArray[i] - inputArray[j];
                System.out.println(tempUnfair);
                if(tempUnfair < minUnfair){
                    minUnfair = tempUnfair;
                    oList.add(inputArray[i]);
                    oList.add(inputArray[j]);
                    oList.add(inputArray[i+j/2]);
                }
            }
        }
        System.out.println(oList);
    }


}
