package com.java8;

import java.util.HashMap;
import java.util.Map;

public class DuplicationInSentance {

	public static void main(String[] args) {
		String inputSentance = "my name is saket kumar currently i am at bangalore but basically i am from dhanbad jharkhand i am indian";
		String inpuStringWithoutSpaces = inputSentance.replaceAll("\\s", "");
		char[] inpuStringWithoutSpacesChar = inpuStringWithoutSpaces.toCharArray();
		Map<Character, Integer> inputSentanceMap = new HashMap<Character, Integer>();
		for (int i = 0; i < inpuStringWithoutSpacesChar.length; i++) {
			char tempMapCheck = inpuStringWithoutSpacesChar[i];
			if (inputSentanceMap.containsKey(tempMapCheck)) {
				inputSentanceMap.put(tempMapCheck, inputSentanceMap.get(tempMapCheck) + 1);
			} else {
				inputSentanceMap.put(tempMapCheck, 1);
			}
		}
		inputSentanceMap.entrySet().stream().forEach(System.out::println);
	}
}
