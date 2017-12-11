package com.datastructure.practice.newjob;

import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {

		int AnagramCount = 0;

		Scanner sc = new Scanner(System.in);

		String InputOne = sc.nextLine();
		String InputTwo = sc.nextLine();

		System.out.println("First String : " + InputOne + " Second String : "
				+ InputTwo);

		char[] InputArrayOne = InputOne.toCharArray();
		char[] InputArrayTwo = InputTwo.toCharArray();

		if (InputArrayOne.length == InputArrayTwo.length) {

			System.out.println(InputArrayOne);
			System.out.println(InputArrayTwo);

			for (int i = 0; i < InputArrayOne.length; i++) {
				for (int j = 0; j < InputArrayTwo.length; j++) {
					if (InputArrayOne[i] == InputArrayTwo[j]) {
						AnagramCount++;
					} else {

					}
				}
			}

		} else {
			System.out.println("Cant be");
		}
		if (AnagramCount == InputArrayOne.length
				&& AnagramCount == InputArrayTwo.length) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
