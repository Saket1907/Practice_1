package com.ds.stack;

public class StacksUsingArray {
	public int[] array;
	public int capacity;
	public int top;
	
	public StacksUsingArray(int size) {
		array = new int[size];
		capacity = size;
		top = -1;
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("stack is already full");
			return;
		}
		array[++top] = item;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		int x = array[top--];
		return x;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		return array[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity -1;
	}

	public void display() {
		for(int i = 0; i <= top; i++) {
			System.out.print(array[i]+"-->");
		}
	}
	
	
}
