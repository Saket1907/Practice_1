import java.util.LinkedList;
import java.util.List;

public class ProducerConsumerThreads {

	public static void main(String[] args) throws InterruptedException {
		final ProducerConsumerDriverClass pcdc = new ProducerConsumerDriverClass();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pcdc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pcdc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}

class ProducerConsumerDriverClass {
	List<Integer> inputList = new LinkedList<Integer>();
	int CAPACITY = 2;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				while (inputList.size() == CAPACITY)
					wait();
				System.out.println("Producer produced ------ " + value);
				inputList.add(value++);
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (inputList.size() == 0)
					;
				wait();
				int val = inputList.remove(0);
				System.out.println("Consumer consumes ------ " + val);
				notify();
				Thread.sleep(1000);
			}
		}
	}
}