package com.datastructure.practice.newjob;

import java.util.Scanner;

public class PureAnagram {

	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		String Anagram = sc.nextLine();
		System.out.println("String is : "+Anagram);
		char [] ArrayAnagram = Anagram.toCharArray();
		for(int i = 1; i < Anagram.length(); i++){
			for(int j = Anagram.length(); j > 0; j--){
				if(ArrayAnagram[i] == ArrayAnagram[j]){
					System.out.println("Done");
					
				}else{
					System.out.println("Not Done");
				}
			}
		}
	}

}
