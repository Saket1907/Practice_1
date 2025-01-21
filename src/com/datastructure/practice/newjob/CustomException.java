package com.datastructure.practice.newjob;


class InvalidAgeException extends Exception{
	   InvalidAgeException(String s){
		super(s);
	}
}

public class CustomException {
	static void validate(int age) throws InvalidAgeException{
		if(age < 18)
			throw new InvalidAgeException("Not valid");
		else
			System.out.println("Eligible to vote!");
	}

	public static void main(String[] args) {
		try {
			validate(13);
		}catch(Exception e) {
			System.out.println("Error occured : "+e);
		}
		System.out.println("<<!||!>>");

	}

}
