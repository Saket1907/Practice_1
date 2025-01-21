package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceDemo {
	public static void main(String[] args) {
		Predicate<Integer> predicate = (t) -> {
			if(t % 2 == 0) {
				return true;
			}else return false;
		};
		System.out.println(predicate.test(5));
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().filter(predicate).forEach(t -> System.out.println("Print even : "+t)); 
	}

}
