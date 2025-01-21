import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class J8CharDuplicate {

	public static void main(String[] args) {
		String inputString = "iamsaketkumarfromdhanbad";
		
		System.out.println(Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
		System.out.println(Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList()));
	}

}
