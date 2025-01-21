package com.java8;

public class ThreadLocalExample {
	public static class MyRunnable implements Runnable {

		private ThreadLocal<Integer> tLI = new ThreadLocal<Integer>();

		@Override
		public void run() {
			tLI.set((int) (Math.random() * 50D));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(tLI.get());
		}

		public static void main(String[] args) {
			MyRunnable myRunnable = new MyRunnable();
			Thread t1 = new Thread(myRunnable);
			Thread t2 = new Thread(myRunnable);

			t1.start();
			t2.start();

		}

	}
}
