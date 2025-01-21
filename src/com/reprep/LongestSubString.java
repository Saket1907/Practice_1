package com.reprep;

public class LongestSubString {
    public static void main(String args[]){
       int[] inputArray = {7,6,4,3,1};
        int maxDifference = 0;
       for(int i = 0; i < inputArray.length -1; i++){
        int k = i + 1;
        while(k < inputArray.length-1){
            int tempDiff = inputArray[k] - inputArray[i];
            if(tempDiff >= maxDifference){
                maxDifference = tempDiff;
            }
            k++;
        }
       }
       System.out.println(maxDifference);
    }
}
