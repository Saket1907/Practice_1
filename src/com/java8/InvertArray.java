package com.java8;

import java.util.Arrays;

public class InvertArray {

	public static void main(String[] args) {
		String inputArray[] = { "saket", "kumar", "mig", "plot", "dhanbad", "jharkhand" };
		String invertedArray[] = new String[inputArray.length];
		int j = inputArray.length;
		for (int i = 0; i < inputArray.length; i++) {
			invertedArray[j-1] = inputArray[i];
			j--;
		}
		System.out.println(Arrays.toString(invertedArray));

	}

}
