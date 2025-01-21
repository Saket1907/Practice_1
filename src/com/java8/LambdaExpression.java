package com.java8;

interface LambdaInterface {
	void show(int i);
}

public class LambdaExpression {

	public static void main(String[] args) {
		LambdaInterface linterface = (i) -> System.out.println("Hello!! " + i);
		linterface.show(69);
	}
}
