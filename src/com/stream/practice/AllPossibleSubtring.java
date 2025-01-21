package com.stream.practice;
public class AllPossibleSubtring {
    public static void main(String[] args) {
        String inputStringToGetSubstrings = "abdcdapertf";

        for(int i = 0; i <= inputStringToGetSubstrings.length(); i++){
            for(int j = i + 1; j <= inputStringToGetSubstrings.length(); j++){
                System.out.println(inputStringToGetSubstrings.substring(i, j));
            }
        }
    }
}
