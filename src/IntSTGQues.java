import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntSTGQues {

	public static void main(String[] args) {
		List<String> inputString = new ArrayList<String>();
		inputString.add("vikas");
		inputString.add("chandra");
		inputString.add("prashanth");
		
		List output = inputString.stream().map(q -> q.toUpperCase()).filter(q -> q.startsWith("V")).collect(Collectors.toList());
		System.out.println(output);
	}

}
