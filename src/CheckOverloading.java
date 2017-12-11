class Adder{
	static int sum(int a, int b){
		return a+b;
	}
	static int sum(int a, int b, int c){
		return a+b+c;
	}
}

public class CheckOverloading {

	public static void main(String[] args) {
	System.out.println(Adder.sum(112, 234));
	System.out.println(Adder.sum(123, 345, 678));

	}

}
