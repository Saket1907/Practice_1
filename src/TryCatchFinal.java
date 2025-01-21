
public class TryCatchFinal {

	public static void main(String[] args) {
		TryCatchFinal tcf = new TryCatchFinal();
		int store = tcf.add(6, 9);
        System.out.println("value :: "+store);
	}

	private int add(int i, int j) {
		try {
			int addIt = i + j;
			return addIt;
		}finally {
			System.out.println("Let's see if it comes here or not");
		}
	}
}
