package com.reprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        List<String> immutableList = new ArrayList<>();
        immutableList.add("saket");
        immutableList.add("kumar");
        immutableList.add("ravi");
        immutableList.add("kishan");

        immutableList = Collections.unmodifiableList(immutableList);
        immutableList.add("lota");

        System.out.println(immutableList);
    }
}
