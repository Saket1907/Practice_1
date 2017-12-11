package com.datastructure.practice.newjob;

class TestThread extends Thread{

	@Override
	public void run() {
		for(int i = 0; i <= 15; i++){
			System.out.println("Thread is running  : "+i);
		}
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
		TestThread tt = new TestThread();
		TestThread tt1 = new TestThread();
		tt.start();
        tt1.start();
	}

}
