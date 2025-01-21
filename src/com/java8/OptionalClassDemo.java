package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OptionalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer sumOfList = Stream.of(1, 2, 4, 6, 3).reduce(0, (a, b) -> a + b);
		System.out.println(sumOfList);
		
		Integer maxInList = Stream.of(1, 2, 4, 6, 3).reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(maxInList);
		
		List<String> inputString = Arrays.asList("Saket", "Rishi", "Gosh", "Heroheeralaal", "Paneriya");
		String here = inputString.stream().reduce((inputString1, inputString2) -> inputString1.length() > inputString2.length() ? inputString1 : inputString2).get();
        System.out.println(here);
	}

}
