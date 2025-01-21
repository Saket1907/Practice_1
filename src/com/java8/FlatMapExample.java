package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> l2 = Arrays.asList(4, 5, 6, 7);
		List<Integer> l3 = Arrays.asList(8, 9, 0);
		
		List<List<Integer>> listOfList = Arrays.asList(l1, l2, l3);
		
		System.out.println(listOfList);
		
		listOfList.stream().flatMap(x -> x.stream()).collect(Collectors.toList()).forEach(System.out::print);
		//listOfList.stream().map(n -> n * 2).collect(Collectors.toList()).forEach(System.out::print);
	}

}
