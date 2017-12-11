package com.datastructure.practice.newjob;

public class StackCustom {
	
	int size;
	int arr[];
	int top;
	
	StackCustom(int size){
		this.size = size;
		this.arr = new int[size];
		this.top = top;
	}
	
	public void push(int pushedElement){
		if(!isFull()){
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed Element : "+pushedElement);
		}else{
			System.out.println("==Stack full==");
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			int returnedTop = top;
			top--;
			System.out.println("Poped Element :"+arr[returnedTop]);
			return arr[returnedTop];
		}else{
			System.out.println("==Stack empty==");
			return -1;
		}
	}
	
	public int peek(){
		return arr[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (size - 1 == top);
	}


	public static void main(String[] args) {
		StackCustom sc = new StackCustom(10);
		sc.pop();
		System.out.println("===============================");
		sc.push(101);
		sc.push(112);
		sc.push(501);
		sc.push(161);
		sc.push(10);
		sc.push(11);
		sc.push(1);
		sc.push(29);
		sc.push(56);
		System.out.println("=================================");
		sc.pop();
		sc.pop();
		sc.pop();
		System.out.println("=================================");
		
		

	}

}
