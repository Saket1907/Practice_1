import java.util.Scanner;

public class JumpCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int forward_jump = sc.nextInt();
		int back_jump = sc.nextInt();

		int hight_wall = sc.nextInt();

		System.out.println("Forward Jump : " + forward_jump);
		System.out.println("Back Jump : " + back_jump);
		System.out.println("Hight of Wall : " + hight_wall);

		System.out.println("<########><#########>");

		int node = 0, back_node = 0;
		int count = 0;
		while (node < hight_wall) {
			node = node + forward_jump;
			back_node = node - back_jump;
			System.out.println("Node : " + node);
			System.out.println("Back Node : " + back_node);
			node = back_node;
			int new_node = node + forward_jump;
			System.out.println("New Node " + new_node);
			System.out.println("<########><#########>");
			count++;
		}
		System.out.println("Counter : " + count);
	}
}
