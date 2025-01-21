package com.reprep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConcatedSubstringLeetCodeHard {
	public static List<Integer> findSubstring(String inputConcatedString, String[] toBeMatched) {
		int tSize = toBeMatched[0].length() * toBeMatched.length;
		List<Integer> myList = new ArrayList<Integer>();
		Map<String, Integer> myMap = new HashMap<>();
		for (int z = 0; z <= toBeMatched.length - 1; z++) {
			if (myMap.containsKey(toBeMatched[z])) {
				myMap.put(toBeMatched[z], myMap.get(toBeMatched[z]) + 1);
			} else {
				myMap.put(toBeMatched[z], 1);
			}
		}
		System.out.println("intial map : " + myMap);
		if (inputConcatedString.length() < toBeMatched.length) {
			myList.add(0);
			return myList;
		}
		for (int initialIndex = 0; initialIndex <= inputConcatedString.length() - tSize; initialIndex++) {
			String subStringToBeChecked = inputConcatedString.substring(initialIndex, initialIndex + tSize);
			System.out.println(subStringToBeChecked);
			//
			String[] subStringToArray = new String[toBeMatched.length];
			Map<String, Integer> intMap = new HashMap<String, Integer>();
			System.out.println("intMap  start: " + intMap);
			int itrCount = 0;
			for (int p = 0; p <= subStringToBeChecked.length() - toBeMatched[0].length(); p = p
					+ toBeMatched[0].length()) {
				subStringToArray[itrCount] = subStringToBeChecked.substring(p, p + toBeMatched[0].length());
				itrCount++;
			}
			System.out.println(Arrays.toString(subStringToArray));
			for (int k = 0; k <= subStringToArray.length - 1; k++) {
				if (intMap.containsKey(subStringToArray[k])) {
					System.out.println("inside put "+intMap);
					intMap.put(subStringToArray[k], myMap.get(subStringToArray[k]) + 1);
				} else {
					System.out.println("inside else put "+intMap);
					intMap.put(subStringToArray[k], 1);
				}
			}
			System.out.println("intMap : " + intMap);
			if (intMap.equals(myMap)) {
				myList.add(initialIndex);
			}
			//
		}
		return myList;
	}

	public static void main(String[] args) {
		String inputConcatedString = "wordgoodgoodgoodbestword";
		String[] toBeMatched = { "word", "good", "best", "good" };
		List<Integer> outputIndexes = findSubstring(inputConcatedString, toBeMatched);
		System.out.println(outputIndexes);
	}
}
