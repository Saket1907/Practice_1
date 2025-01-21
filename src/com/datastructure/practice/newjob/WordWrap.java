package com.datastructure.practice.newjob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an array of words, write a method to convert these words into wrapped words in such a way that it should not exceed the wrap limit (say here: 13).

Example: 
words: [“The”, “day”, “begin”, “as”, “still”, “as”, “bright”]

Output: 
words: [
	“The-day-begin”,
	“as-still-as”,
	“bright”
]*/

public class WordWrap {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		List<String> inputArray = Arrays.asList("The", "day", "begin", "as", "still", "bright" );
		int maxLength = 13;
	    List<String> outArray = new ArrayList<String>();
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i = 0; i < inputArray.size(); i++) {
	    	inputArray.get(i).length();
	    	sb.length();
	    	if(inputArray.get(i).length() <= 13 && sb.length() <= 13) {
	    		sb.append(inputArray.get(i));
	    		outArray.add(sb.toString());
	    	}
	    }
	    //outArray.add(sb.toString().trim().replaceAll(" ", "-"));
	    System.out.println(outArray);
		
	}

}
