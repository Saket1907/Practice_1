package com.builder.pattern;

public class Shop {
	public static void main(String args[]) {

		Phone ph = new PhoneBuilder().setCompanyProcessor("andu").getPhone();
		System.out.println(ph);
	}

}
