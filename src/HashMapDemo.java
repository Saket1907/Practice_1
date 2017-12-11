import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> hm = new HashMap<String, Double>();
		hm.put("Saket", new Double(452.265));
		hm.put("Neha", new Double(458.36));
		hm.put("Anit", new Double(298.2658));
		hm.put("Priti", new Double(0.22569));
		hm.put("Kanishk", new Double(569));

		Set<Map.Entry<String, Double>> set = hm.entrySet();
		for (Map.Entry<String, Double> me : set) {
			System.out.println(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

		double balance = hm.get("Saket");
		hm.put("Saket", balance + 50);

		System.out.println("Saket new balance is :" + hm.get("Saket"));
		System.out.println();

		for (Map.Entry<String, Double> me : set) {
			System.out.println(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
	}
}