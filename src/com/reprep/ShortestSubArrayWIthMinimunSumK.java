package com.reprep;

public class ShortestSubArrayWIthMinimunSumK {

    public static int shortestSubarray(int[] nums, int k){       
        int intial = 0;   
        int sumHolder = 0; 
        int itirateWhile = intial;  
        int countLengthMax = 0;  
        for(intial = 0; intial <= nums.length - 1; intial++){
            System.out.println("here : "+nums[intial]);
            if(nums[intial] <= k){
                if(sumHolder == k){
                    System.out.println("inside sum holder");
                    int countOfIndex = itirateWhile - intial + 1;
                    System.out.println(itirateWhile +"  "+intial);
                    countLengthMax = Math.max(countLengthMax, countOfIndex);
                    sumHolder = 0;
                }
                while(sumHolder <= k && itirateWhile <= nums.length - 1 && nums[intial] <= k){
                    System.out.println("in side while");
                    if(sumHolder < k){
                        sumHolder = sumHolder + nums[itirateWhile];
                        System.out.println("sh :: "+sumHolder);
                    }
                    itirateWhile++;
                }
            }
        }
        return countLengthMax;
    }
    public static void main(String[] args) {
        int[] nums = {77,19,35,10,-14};
        int k = 19;

        int output = shortestSubarray(nums, k);
        System.out.println(output);
    }
}
