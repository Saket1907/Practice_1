package com.java8;

import java.util.HashMap;
import java.util.Map;

public class PrintMapStream {

	public static void main(String[] args) {
		Map<String, String> inputMap = new HashMap<String, String>();
		inputMap.put("saket", "kumar");
		inputMap.put("Kumar", "Saket");
		
		inputMap.entrySet().stream().forEach(System.out::println);

	}

}
