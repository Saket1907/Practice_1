package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
	public static void main(String[] args) {
		Consumer<Integer> consumer = t -> System.out.println("Printing  ---> " + t);
		// for single argument () {} not required.
		consumer.accept(10);
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().forEach(consumer);
	}
}
