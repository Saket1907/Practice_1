package com.java8;

interface Phone{
	void call();
	default void message() {
		System.out.println("interface called as its default interface");
	}
	static void callblocker() {
		System.out.println("static so calling directtly");
	}
	
}

class ImplPhone implements Phone{
	public void call() {
		System.out.println("interface called through implements");
	}
}
public class DefaultInterface {

	public static void main(String[] args) {
		Phone phn = new ImplPhone();
		phn.call();
		phn.message();
		Phone.callblocker();

	}

}
