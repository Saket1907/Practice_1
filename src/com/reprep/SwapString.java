package com.reprep;

public class SwapString {

	public static void main(String[] args) {
		String s1 = "good";
		String s2 = "morning";
		String s3 = "saket is my anme call me saket";
		
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("output :: "+ s1 + " " + s2);

		String s4 = s3.replace("//s", ",");
		System.out.println(s4);
	}

}
