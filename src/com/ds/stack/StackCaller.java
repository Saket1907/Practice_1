package com.ds.stack;


public class StackCaller {

	public static void main(String[] args) {
		StacksUsingArray stack = new StacksUsingArray(6);
		stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.display();
        System.out.println();
        System.out.println("Popped element is " + stack.pop());
        System.out.println("Popped element is " + stack.pop());
        System.out.println("Popped element is " + stack.pop());
        System.out.println("Popped element is " + stack.pop());
        System.out.println("Popped element is " + stack.pop());
        System.out.println("Popped element is " + stack.pop());// Output: 3
        System.out.println("Top element is " + stack.peek());   // Output: 2
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: False
        System.out.println("Is stack full? " + stack.isFull());   // Output: False
        stack.display();
	}

}
