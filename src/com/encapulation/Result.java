package com.encapulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Result {
	public static void main(String args[]){
		List<Details> listInsert = new ArrayList<>();
		listInsert.add(new Details(70, "Saket", "Dhanbad"));
		listInsert.add(new Details(24, "Kumar", "Ranchi"));
		listInsert.add(new Details(60, "Hero", "Patna"));
		listInsert.add(new Details(80, "Heera", "Bangalore"));
		listInsert.add(new Details(77, "Laal", "Delhi"));
		listInsert.add(new Details(56, "Peela", "Mumbai"));
		
		for(Details i : listInsert) {
			System.out.print("   " + i.getMarks() +"  ");
		}
		
		System.out.println("============================");

		Iterator<Details> itDetails = listInsert.iterator();
		while(itDetails.hasNext()) {
			System.out.print("  "+itDetails.next().getName() +"  ");
		}
		
		System.out.println("============================");
		
		listInsert.forEach(
				itr -> System.out.print("  " + itr.getAddress() +"  "));
		
		System.out.println("============================");
		
		listInsert.stream().forEach(
				streamItr -> System.out.print("  " + streamItr.getAddress() +"  "));
		
		System.out.println("============================");
		
		listInsert.stream().filter(
				streamfilter -> streamfilter.getMarks() < 56).forEach(
						opVal -> System.out.println(opVal.getMarks()));
	}

}
