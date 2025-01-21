package com.java8;

import java.util.HashMap;
import java.util.Map;

public class HashInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> inMap = new HashMap<>();
		inMap.put(null, "Saket");
		inMap.put(null, "Kumar");
		
		for (Map.Entry in:inMap.entrySet()) {
            System.out.println(in.getKey()+" "+in.getValue());
        }

	}

}
