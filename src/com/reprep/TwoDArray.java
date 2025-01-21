package com.reprep;

import java.util.Arrays;
import java.util.stream.Stream;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] input2DArray = {
            {1, 3, 9},
            {4, 6, 8},
            {5, 1, 7}
        };

        Stream.of(input2DArray).sorted((a, b) -> a[0]-b[0]).forEach(q -> System.out.println(Arrays.toString(q)));
    }
}
