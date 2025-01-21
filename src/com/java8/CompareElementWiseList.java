package com.java8;

import java.util.ArrayList;
import java.util.List;

public class CompareElementWiseList {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		int count = 0;
		List<Integer> listOne = new ArrayList<Integer>();
		List<Integer> listTwo = new ArrayList<Integer>();

		for (int i = 1; i < 16; i++) {
			listOne.add(i);
		}

		for (int i = 13; i < 28; i++) {
			listTwo.add(i);
		}
		System.out.println(listOne);
		System.out.println(listTwo);
		
		for(int i = 0; i < listTwo.size(); i++) {
			if(listTwo.contains(listOne.get(i))) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
