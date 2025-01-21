package com.stream.practice;

public class CallGetSetField {

	public static void main(String[] args) {
		GetSetField gsf = new GetSetField(0);
		System.out.println("value is : "+gsf.getId(28));
		try {
			System.out.println("Here");
		}finally {
			System.out.println("here in finally");
		}
	}

}
