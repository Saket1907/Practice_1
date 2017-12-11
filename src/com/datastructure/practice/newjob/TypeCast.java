package com.datastructure.practice.newjob;

import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
        String Input = sc.nextLine();
        
        int INPUT_INTEGER = Integer.parseInt(Input);
        
        System.out.println("VALUE : " +INPUT_INTEGER);
        
        int LengthOfInteger = Input.length();
        
        System.out.println(LengthOfInteger);
        
	}
	
}
