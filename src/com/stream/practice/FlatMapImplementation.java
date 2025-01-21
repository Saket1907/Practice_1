package com.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapImplementation {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("gfg", "Geeks");
		
		myList.stream().flatMap(str -> Stream.of(str.charAt(1))).forEach(System.out::println);

	}

}
