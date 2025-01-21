package com.java8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UnionTwoMaps {

	public static void main(String[] args) {
		Map<Integer, String> intialMap = new HashMap<Integer, String>();
		Map<Integer, String> finalMap = new HashMap<Integer, String>();
		
		intialMap.put(1, "Saket");
		intialMap.put(2, "Kumar");
		intialMap.put(3, "Dhanbad");
		intialMap.put(4, "Jharkhand");
		intialMap.put(5, "Colony");
		
		finalMap.put(1, "Saket");
		finalMap.put(3, "Dhanbad");
		finalMap.put(4, "Jharkhand");
		
		HashSet<Integer> unionMap = new HashSet<Integer>(finalMap.keySet());
		unionMap.addAll(intialMap.keySet());
		
		unionMap.removeAll(finalMap.keySet());
		System.out.println(unionMap);
	}

}
