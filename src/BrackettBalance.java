import java.util.LinkedList;
import java.util.Queue;

public class BrackettBalance {

	public static void main(String[] args) {
		String inputBrackett = "{[[][[[[]]]]]}";
		Queue<String> myQueue = new LinkedList<>();
		for (int i = 0; i < inputBrackett.length(); i++) {
			myQueue.add(inputBrackett);

			if (inputBrackett.equals("}")) {
				String pollCurl = myQueue.poll();
				if (!pollCurl.equals("{")) {
					System.out.println("Not balanced");
					break;
				}
			}
			if (inputBrackett.equals("]")) {
				String pollSquare = myQueue.poll();
				if (!pollSquare.equals("[")) {
					System.out.println("Not balanced");
					break;
				}
			}
		}

	}

}
