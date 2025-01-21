package com.java8;

import java.util.Arrays;
import java.util.List;

/**
 * @author saku.isaket
 * forEach method, act as internal loop, it makes it even faster.
 * -> lamda expression
 *      
 */
public class ForEachMethod {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		values.forEach(j -> System.out.println(j));
	}
}
