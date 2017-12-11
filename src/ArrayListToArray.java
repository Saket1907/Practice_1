import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(3);
		al.add(6);
		al.add(4);

		System.out.println("ArrayList Integer Wise :" + al);

		Integer ia[] = new Integer[al.size()];
		ia = al.toArray(ia);

		int sum = 0;
		for (int i : ia)
			sum += i;
		System.out.println("Output : " + sum);

	}

}