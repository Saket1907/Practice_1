import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private String stName;
    private String stAge;

    public Student(String stName, String stAge) {
        this.stName = stName;
        this.stAge = stAge;
    }

    public String getStName() {
        return stName;
    }
    public String getStAge() {
        return stAge;
    }
    public void setStName(String stName) {
        this.stName = stName;
    }
    public void setStAge(String stAge) {
        this.stAge = stAge;
    }
    
    
}

public class StreamReduce {
    public static void main(String[] args) {
        System.out.println("---- Application started ----");
        List<String> colours = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
        List<Integer> numbers = Arrays.asList(112, 234, 563, 199, 896, 1087);
        List<Integer> addNumber = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Student st1 = new Student("saket", "32");
        Student st2 = new Student("kumar", "25");
        Student st3 = new Student("rahul", "13");
        Student st4 = new Student("patel", "19");
        Student st5 = new Student("modi", "15");
        Student st6 = new Student("betichod", "12");

        List<Student> myList = new ArrayList<Student>();

        myList.add(st6);
        myList.add(st5);
        myList.add(st4);
        myList.add(st3);
        myList.add(st2);
        myList.add(st1);

        System.out.println(myList
        .stream()
        .map(q -> Integer.parseInt(q.getStAge()))
        .filter(k -> k >= 19)
        .collect(Collectors.toList()));

        myList
        .stream()
        .forEach(qp -> System.out.println(qp.getStAge()+" "+qp.getStName()));

        System.out.println(colours
        .stream()
        .map(x -> x.toUpperCase())
        .collect(Collectors.toList()));

        System.out.println(numbers
        .stream()
        .map(y -> String.valueOf(y))
        .filter(z -> z.startsWith("1"))
        .collect(Collectors.toList()));



        String input = "employee_address_line_ok";
        char[] inputToChar = input.toCharArray();

        for(int i = 0; i <= inputToChar.length -1; i++){
            char temp = inputToChar[i];
            if(temp == '_'){
                String tempToString = String.valueOf(inputToChar[i+1]).toUpperCase();
                inputToChar[i+1] = tempToString.charAt(0);                
            }
        }
        System.out.println(String.valueOf(inputToChar).replace("_",""));

        System.out.println(addNumber.stream().filter(q -> q % 2 != 0).reduce((k1, k2) -> k1 + k2));
    }
}

