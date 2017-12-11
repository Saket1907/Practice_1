package com.datastructure.practice.newjob;

class A{
	void display(){
		System.out.println("1");
	}
}

class B extends A{
	void display(){
		System.out.println("2");
	}
	
}

public class Inheritance {

	public static void main(String[] args) {
	    A ab = new B();
	    ab.display();

	}

}
