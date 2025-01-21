package com.datastructure.practice.newjob;


public class Singleton {

	public static void main(String[] args) {
		Abc obj1 = Abc.getInstance();
		//Abc obj2 = new Abc(); // sholdn't be there as its singleton.
	}

}
class Abc{
	static Abc obj = new Abc();
	private Abc() {
		
	}
	public static Abc getInstance() {
		return obj;
	}
}