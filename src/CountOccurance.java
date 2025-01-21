import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class CountOccurance {

	public static void main(String[] args) {
		
		String input = "ABCD ABCD PQRS PQRS Z";
		
		ConcurrentMap<Character, LongAdder> occr = new ConcurrentHashMap<>();
		for(char  character : input.toCharArray()) {
			if(character == ' ')
				continue;
			occr.computeIfAbsent(character, ch -> new LongAdder()).increment();
		}
		System.out.println(occr);

	}

}
