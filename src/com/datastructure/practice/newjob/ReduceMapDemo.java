package com.datastructure.practice.newjob;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceMapDemo {

	public static void main(String[] args) {
		List<Integer> addInTheList = Arrays.asList(1, 2, 5, 78, 34,97);
		
		int  addList = addInTheList.stream().reduce(0, (a , b) -> a + b);
		System.out.println("Sum is :: "+addList);
	}

}
