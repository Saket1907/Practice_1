package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAscDesc {

	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(6);
		arrList.add(3);
		arrList.add(78);
		arrList.add(65);
		arrList.add(34);
		arrList.add(0);
		arrList.add(9);
		arrList.add(23);
		arrList.add(45);
		arrList.add(16);
		arrList.add(54);
		arrList.add(22);
		
		arrList.stream().sorted().forEach(s -> System.out.println(s));
		arrList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
		

	}

}
