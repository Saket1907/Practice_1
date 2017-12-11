import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {
	public int compare(String a, String b) {
		int i, j, k;
		String aStr, bStr;
		aStr = a;
		bStr = b;
		i = aStr.lastIndexOf(' ');
		j = bStr.lastIndexOf(' ');

		k = aStr.substring(i).compareTo(bStr.substring(j));
		if (k == 0)
			return aStr.compareTo(bStr);
		else
			return k;

	}
}

class TreeMapDemo2 {

	public static void main(String[] args) {
		TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());
		tm.put("Saket Kumar", new Double(2569.25886));
		tm.put("Neha Baskar", new Double(253.265));
		tm.put("Anit Kumar", new Double(58.3266));
		tm.put("Pankaj Rai", new Double(12.369));
		tm.put("Basil Zose", new Double(78.23659));

		Set<Map.Entry<String, Double>> set = tm.entrySet();

		for (Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + " : ");
			System.out.println(me.getValue());
		}
		System.out.println();
	}

}