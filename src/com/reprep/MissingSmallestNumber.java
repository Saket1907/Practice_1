package com.reprep;

import java.util.HashMap;
import java.util.Map;

public class MissingSmallestNumber {
    public static void main(String[] args) {
        int[] inputArray = {
            1, 8, 9, 11, 12
        };

        int missingNumber = firstMissingPositive(inputArray);
                        System.out.println("missing number :: "+missingNumber);
                    }
        
                    private static int firstMissingPositive(int[] inputArray) {
                        Map<Integer, Boolean> myMapNumbFind = new HashMap<Integer, Boolean>();
                        int missingMin = Integer.MIN_VALUE;
                        for(int i = 0; i <= inputArray.length -1; i++){
                            myMapNumbFind.put(inputArray[i], true);
                            System.out.println("missingMin "+missingMin+"  "+"value from array "+inputArray[i]);
                            missingMin = Math.max(missingMin, inputArray[i]);
                            System.out.println("here "+missingMin);
                        }
                        for(int j = 1; j < missingMin; j++){
                            System.out.println("counter");
                            if(!myMapNumbFind.containsKey(j)){
                                System.out.println("return1");
                                return j;
                            }
                        }
                        System.out.println("return2");
                        return missingMin < 0 ? 1 : missingMin + 1;
                    }
        }
        
