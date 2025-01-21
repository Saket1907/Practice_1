package com.datastructure.practice.newjob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class NotSecondHighestAddition {

	public static void main(String[] args) {
		int[] inputArray = {2, 4, 1, 6, 3, 8, 0, 7, 5, 17, 9};
		
		int intialIndex = 3;
		int finalIndex = 7;
		int tempValue;
//		for(int i = 3; i < 7; i++) {
//			if(inputArray[i] > inputArray[i+1]){
//				 tempValue = inputArray[i];   //temp = 3;
//				 inputArray[i+1] = inputArray[i]; // 
//				 inputArray[i] = tempValue;
//				}else {
//					inputArray[i] = inputArray[i];
//					inputArray[i+1] = inputArray[i+1];
//				}
//		}
//		for(int j = 0; j < inputArray.length; j++) {
//			System.out.println(inputArray[j]);
//		}
		
		Arrays.sort(inputArray, intialIndex, finalIndex);
		for(int i = 0; i< inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
		
	}

}
