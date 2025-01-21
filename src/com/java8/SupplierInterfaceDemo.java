package com.java8;

import java.util.function.Supplier;

public class SupplierInterfaceDemo {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			return "hi Saketwa";
		};
		System.out.println(supplier.get());
	}

}
