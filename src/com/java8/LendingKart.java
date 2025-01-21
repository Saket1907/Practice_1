package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
1 2 100
5 5 200
2 3 300
6 1 500

threshoad=2
1, 2 (acount number)
asec order

*/
public class LendingKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> payeeAcount = new ArrayList<String>();
		List<String> paidAccount = new ArrayList<String>();
		List<String> inputList = new ArrayList<String>();
		List<String> outputArray = new ArrayList<String>();
		inputList.add("1 2 100");
		inputList.add("5 5 200");
		inputList.add("2 3 300");
		inputList.add("6 1 500");
		int count = 0;
		
        for(String itr : inputList) {
        	payeeAcount.add(inputList.get(0).replaceAll("\\s", "").substring(0, 1));
        	paidAccount.add(inputList.get(0).replaceAll("\\s", "").substring(1, 2));
        }
		
        if(payeeAcount.size() == paidAccount.size()) {
        	for(int i = 0; i < payeeAcount.size(); i++) {
        		if(payeeAcount.get(i).contains((CharSequence) paidAccount)) {
        			outputArray.add(payeeAcount.get(i));
        			count++;
        			if(count >= 2) {
        				System.out.println(outputArray);
        			}
        		}
}
        }
	}
}
