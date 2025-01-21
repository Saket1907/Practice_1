import java.util.concurrent.atomic.LongAdder;

public class LongAdderIncrement {

	public static void main(String[] args) {
		LongAdder longAdder = new LongAdder();
		
		System.out.println("longAdder :: "+longAdder);
		longAdder.add(56);
		longAdder.add(5);
		System.out.println("new longAdder :: "+longAdder);

	}

}
