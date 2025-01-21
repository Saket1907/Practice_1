/*
 *  using two run() method
 */

class EvenViaThread extends Thread{
	public void run() {
		for(int i = 0; i <= 50; i++) {
			if(i%2 == 0) {
				System.out.println("Printing even number ------> "+i);
			}
		}
	}
}
class OddViaThread extends Thread{
	public void run() {
		for(int i = 0; i <= 50; i++) {
			if(i%2 != 0) {
				System.out.println("Printing odd number ------> "+i);
			}
		}
	}
}

public class OddEvenViaThread{
	public static void main(String args[]) {
		EvenViaThread evt = new EvenViaThread();
		OddViaThread ovt = new OddViaThread();
		
		evt.start();
		ovt.start();
	}
}