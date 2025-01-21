package com.datastructure.practice.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CallingComparableComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Details> listDetails = new ArrayList<>();

		listDetails.add(new Details(1, "LG", "Dhanbad", "Jan"));
		listDetails.add(new Details(2, "SONY", "Bokaro", "July"));
		listDetails.add(new Details(4, "SAMSUNG", "Ranchi", "Sept"));
		listDetails.add(new Details(6, "LOGITECH", "Giridih", "Feb"));
		listDetails.add(new Details(3, "APPLE", "Tundi", "Dec"));
		listDetails.add(new Details(5, "ACER", "Maithon", "Mar"));
		listDetails.add(new Details(9, "MSI", "Bhatinda", "May"));

		Comparator<Details> comp = new Comparator<Details>() {
			public int compare(Details d1, Details d2) {
				if (d1.getId() > d2.getId()) {
					return 1;
				} else {
					return -1;
				}
			}
		};

		Collections.sort(listDetails, comp);

		
		  for(Details d : listDetails) { System.out.println(d); }
		 

	}

}
