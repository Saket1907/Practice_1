import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewCode {
    public static void main(String[] args){

        int constantNumber = 12;
        List<Integer> myList = new ArrayList<Integer>();
        List<Integer> opList = new ArrayList<Integer>();
        myList.add(7);
        myList.add(5);
        myList.add(5);
        myList.add(7);
        myList.add(6);
        myList.add(6);
        myList.add(9);
        myList.add(1);

        for(int i = 0; i <= myList.size() -1; i++){
            int diff = constantNumber - myList.get(i);
            if(myList.contains(diff)){
                opList.add(myList.get(i));
            }
        }
        System.out.println("printing list <> "+opList);
        
    }
}
