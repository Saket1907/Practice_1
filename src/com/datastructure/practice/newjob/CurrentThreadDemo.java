package com.datastructure.practice.newjob;

public class CurrentThreadDemo {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("Current Thread : "+t);
		t.setName("This Is My Thread");
		System.out.println("Thread Name After Change : "+t);
		
		try{
			for(int i = 5; i > 0; i--){
				System.out.println(i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted");
		}

	}

}
