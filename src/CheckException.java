public class CheckException {

	public static void main(String[] args) {
		int s;
		boolean status = false;
		try {
			s = 1 / 0;
			System.out.println("Result :" + s);
			System.out.println("staus----" + status);
		} catch (Exception e) {
			System.out.println("Gand Marao!");

		} finally {
			System.out.println("Failed");
			status = true;
			System.out.println("staus----" + status);
		}
	}

}
