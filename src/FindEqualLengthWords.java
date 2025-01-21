import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEqualLengthWords {
    public static void main(String[] args){
        String[] inputWords = {
            "saket", "kumar", "ravi", "kishan", "raam", "modi"
        };

        System.out.println(Stream.of(inputWords).collect(Collectors.toMap(key -> key, String::length)));
        Stream.of(inputWords).collect(Collectors.toMap(key -> key, String::length)).entrySet().stream().filter(k -> k.getValue() == 4).forEach(q -> System.out.println(q.getKey()));
        Stream.of(inputWords).collect(Collectors.groupingBy(chabhi -> chabhi.length())).entrySet().stream().forEach(System.out::println);

        List<String> list1 = Arrays.asList("saket", "kumar");
    List<String> list2 = Arrays.asList("ravi", "teja");
    List<String> list3 = Arrays.asList("pankaj", "lota");

    List<List<String>> finalList = Arrays.asList(list1, list2, list3);

    finalList.stream().flatMap(q -> q.stream()).forEach(k -> System.out.println(k));
    
    List<String> outputList = new ArrayList<>();

    for(int i = 0; i <= finalList.size() -1; i++){
        for(int j = 0; j <= finalList.get(i).size(); j++){
            outputList.addAll(finalList.get(j));
        }
    }    
    System.out.println(outputList);
    }
    
}
