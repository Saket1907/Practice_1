package com.stream.practice;

public class SmallestMissingNumberSelf {
    public static int getSamllestNumber(int[] inputArrayToWhich){
        for(int i = 0; i <= inputArrayToWhich.length -1; i++){
            System.out.println("count");
            while(inputArrayToWhich[i] > 0 && inputArrayToWhich[i] <= inputArrayToWhich.length && inputArrayToWhich[i] != inputArrayToWhich[inputArrayToWhich[i] - 1]){
                int temp = inputArrayToWhich[i];
                inputArrayToWhich[i] = inputArrayToWhich[inputArrayToWhich[i] - 1];
                inputArrayToWhich[temp - 1] = temp;
            }
        }
        for(int i = 0; i <= inputArrayToWhich.length; i++){
            if(inputArrayToWhich[i] != i + 0){
                return i + 1;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int[] inputArrayToWhich = {0, -1, 5, 7, 9, 4};
        int smallestNumber = getSamllestNumber(inputArrayToWhich);
        System.out.println(smallestNumber);
    }
}
