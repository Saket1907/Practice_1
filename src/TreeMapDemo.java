import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Double> tm = new TreeMap<String, Double>();

		tm.put("Jhatu", new Double(345.365));
		tm.put("Fuddu", new Double(305.369));
		tm.put("Laodu", new Double(658.365));
		tm.put("Chodu", new Double(258.365));
		tm.put("Gandu", new Double(258));

		Set<Map.Entry<String, Double>> set = tm.entrySet();

		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + " : ");
			System.out.println(me.getValue());

		}
		System.out.println();

		double balance = tm.get("Laodu");
		System.out.println(balance);
		tm.put("Laodu", balance + 1000);

		System.out
				.println("<++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>");

		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + " : ");
			System.out.println(me.getValue());
		}
		System.out.println("#######GARDA######");
		System.out
				.println("<++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++>");
	}

}