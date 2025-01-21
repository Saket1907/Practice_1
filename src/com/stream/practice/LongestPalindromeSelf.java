package com.stream.practice;

public class LongestPalindromeSelf {
    public static void getLongestPal(String inputString){
        String longestPalindromEven = "";
        String longestPalindromOdd = "";
        if(inputString.equals(null) || inputString.isEmpty() || inputString.trim() == ""){
            System.out.println("blank string");
        }
        for(int i = 0; i < inputString.length(); i++){
            longestPalindromEven = checkLeftRight(inputString, i, i);
            longestPalindromOdd = checkLeftRight(inputString, i, i+1);
        }
        if(longestPalindromEven.length() > longestPalindromOdd.length()){
            System.out.println(longestPalindromEven);
        }else{
            System.out.println(longestPalindromOdd); 
        }   
    }
   public static String checkLeftRight(String inputString, int start, int end){
    while(start >= 0 && end < inputString.length() && inputString.charAt(start) == inputString.charAt(end)){
        start--;
        end++;
    }
    System.out.println(inputString.substring(start + 1, end));
    return inputString.substring(start + 1, end);
   }
    public static void main(String[] args) {
        String inputString = "abdcdapertf";
        getLongestPal(inputString);
    }

}
