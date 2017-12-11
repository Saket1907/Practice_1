package com.datastructure.practice.newjob;

public class ArrayAddition {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int arrayOne[] = {1, 2, 3, 4, 5};
		int arrayTwo[] = {6, 7, 8, 9, 10};
		
		final int sum = 14;
		int count = 0;
		
		for(int i = 0; i < arrayOne.length; i++){
			System.out.print(arrayOne[i]);
		}
		
		System.out.println();
		
		for(int j = 0; j < arrayTwo.length; j++){
			System.out.print(arrayTwo[j]);
		}
		
		System.out.println();
		
		for(int i = 0; i < arrayOne.length; i++){
			for(int j = arrayTwo.length; j > 0; j--){
				int checkSum = arrayOne[i]+arrayTwo[j - 1];
				System.out.println(checkSum);
				if (checkSum == sum){
					count++;
					break;
				}
			}
			System.out.println();
			
		}
		
		System.out.println("No. of times = "+count);
		System.out.println("Slider It is!");
		long endTime = System.currentTimeMillis() - startTime;
		System.out.println("Execution Time : "+endTime);
	}

}
