package com.datastructure.practice.newjob;

class TableMultiplication{
	void printTable(int n) {
		synchronized(this) {
			for(int i = 1; i <= 5; i++) {
				System.out.println("Table : "+n*i);
				try {
					Thread.sleep(4000);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

class MyThread1 extends Thread{
	TableMultiplication tMultiplication;
	MyThread1(TableMultiplication tMultiplication){
		this.tMultiplication = tMultiplication;
	}
	@Override
	public void run() {
		tMultiplication.printTable(5);
	}
}

class MyThread2 extends Thread{
	TableMultiplication tMultiplication;
	MyThread2(TableMultiplication tMaltiMultiplication){
		this.tMultiplication = tMultiplication;
	}
	@Override
	public void run() {
		this.tMultiplication.printTable(100);
	}
}

public class ThreadSynchronized {

	public static void main(String[] args) {
		TableMultiplication tM = new TableMultiplication();
		MyThread1 mT1 = new MyThread1(tM);
		MyThread2 mT2 = new MyThread2(tM);
		mT1.start();
		mT2.start();

	}

}
