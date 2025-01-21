package com.datastructure.practice.newjob;

import java.util.Arrays;

public class BreakArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] { 100, 20, 3, 498, 75, 98 };
		String str = "saket";

		Arrays.sort(input);
		System.out.println(Arrays.toString(input));
		System.out.println(input[0]);
		System.out.println(input[input.length-1]);
		
		char[] chArr = str.toCharArray();
		System.out.println(chArr.length);
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(chArr[i]);
		}

	}

}
