package com.reprep;

import java.util.Stack;

public class BrackettBalance {
    public static void main(String[] args) {
        String inputString = "{{(())}}[[()]](";
        Stack<Character> myStack = new Stack<>();
        for(int i = 0; i <= inputString.length() - 1; i++){
            if(inputString.charAt(i) == '{' || inputString.charAt(i) == '[' || inputString.charAt(i) == '('){
                myStack.add(inputString.charAt(i));
            }else if(inputString.charAt(i) == '}'){
                if(myStack.pop() == '{'){
                    continue;
                }else{
                    break;
                }
            }else if(inputString.charAt(i) == ')'){
                if(myStack.pop() == '('){
                    continue;
                }else{
                    break;
                }
            }else if(inputString.charAt(i) == ']'){
                if(myStack.pop() == '['){
                    continue;
                }else{
                    break;
                }
            }
        }
        System.out.println("size :: "+myStack.size());
        if(myStack.size() == 0){
            System.out.println("bal");
        }else{
            System.out.println("not");
        }
    }
}
