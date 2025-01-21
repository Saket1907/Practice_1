 package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DebjitStreamProblem {

	public static void main(String[] args) {
		
		List<String> listDebjit = new ArrayList<>();
		listDebjit.add("Saket");
		listDebjit.add("Debjit");
		listDebjit.add("Bibhakar");
		listDebjit.add("Chandan");
		listDebjit.add("Suresh");
		listDebjit.add("Heera");
		
		listDebjit.forEach(
				printlist -> System.out.println(printlist));
		
		System.out.println();
		
		listDebjit.stream().filter(
				listDebjitStream -> listDebjitStream.startsWith("S")).forEach(
						listDebjitStream -> System.out.println(listDebjitStream+" test"));
	
	}

}
