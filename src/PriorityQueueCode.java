import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCode {
    public static void main(String[] args){
        PriorityQueue<Integer> myPQ = new PriorityQueue<Integer>(Comparator.reverseOrder());

        myPQ.add(7);
        myPQ.add(9);
        myPQ.add(11);
        myPQ.add(1);
        myPQ.add(4);
        myPQ.add(2);
        myPQ.add(6);
        myPQ.add(3);
        myPQ.add(5);
        myPQ.add(99);

        System.out.println(myPQ);
        System.out.println("<------------------------>");
        for(int i = 0; i <= myPQ.size(); i++){
            myPQ.poll();
            System.out.println(myPQ);
        }
    }
}
