package com.java8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighest {
    public static void main(String args[]) {
        Map<String, Integer> myList = new HashMap<String, Integer>();
        myList.put("Saket", 1000);
        myList.put("Kumar", 500);
        myList.put("Rahul", 5000);
        myList.put("Shreya", 2563);
        myList.put("Siddhu", 4152);
        myList.put("Avinash", 8523);
        myList.put("Raju", 8523);
        myList.put("Robin", 10);
        myList.put("Nidhi", 10);
        myList.put("Reena", 10);
        myList.put("Rishi", 3698);
        myList.put("Vinay", 7889);

        System.out.println(myList);
        System.out.println("---------------------------------");
        System.out.println(myList.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()));
        System.out.println("---------------------------------");
        System.out.println(myList.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(3));
        System.out.println("---------------------------------");
        System.out.println(myList.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(3));
    }
}
