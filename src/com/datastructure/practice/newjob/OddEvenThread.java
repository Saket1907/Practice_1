package com.datastructure.practice.newjob;

class OddEvenRunnableClass implements Runnable {
	public int PRINT_NUMBERS_UPTO = 10;
	static int number = 1;
	int reminder;
	static Object lock = new Object();

	OddEvenRunnableClass(int reminder) {
		this.reminder = reminder;
	}

	@Override
	public void run() {
		while (number < PRINT_NUMBERS_UPTO) {
			synchronized (lock) {
				while (number % 2 != reminder) {
					System.out.println("Reminder :: " + reminder);
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + "  " + number);
				number++;
				lock.notifyAll();
			}
		}
	}
}

public class OddEvenThread {

	public static void main(String[] args) {
		OddEvenRunnableClass odd = new OddEvenRunnableClass(1);
		OddEvenRunnableClass even = new OddEvenRunnableClass(0);

		Thread t1 = new Thread(even, "even thread");
		Thread t2 = new Thread(odd, "odd thread");

		t1.start();
		t2.start();

	}

}
