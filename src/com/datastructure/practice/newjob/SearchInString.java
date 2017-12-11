package com.datastructure.practice.newjob;

import java.util.Scanner;

public class SearchInString {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your string----->");
		String inputString = sc.nextLine();
		System.out.println("Input is : " + inputString);

		System.out.println("Search here----->");
		String toBeSearched = sc.nextLine();
		System.out.println("Search : " + toBeSearched);

//		char inputArray[] = inputString.toCharArray();
//		char searchArray[] = toBeSearched.toCharArray();
//
//		for (i = 0; i < inputArray.length; i++) {
//			System.out.print(inputArray[i]);
//		}
//
//		System.out.println("<----------------->");
//
//		for (j = 0; j < searchArray.length; j++) {
//			System.out.print(searchArray[j]);
//		}
//
//		for (i = 0; i < inputArray.length; i++) {
//			for (j = 0; j < searchArray.length; j++) {
//				if (inputArray[i] == searchArray[j]) {
//					System.out.println("True");
//				} else
//					System.out.println("False");
//			}
//
//		}
		
		Boolean found = inputString.contains(toBeSearched);
		System.out.println(found);
	}
}
