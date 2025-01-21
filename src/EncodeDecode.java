import java.util.HashMap;
import java.util.Map;

public class EncodeDecode {
    public static void main(String args[]){
        Map<Integer, String> decodeMap = new HashMap<Integer, String>();
        decodeMap.put(1, "A"); 
        decodeMap.put(2, "B"); 
        decodeMap.put(3, "C"); 
        decodeMap.put(4, "D"); 
        decodeMap.put(5, "E"); 
        decodeMap.put(6, "F"); 
        decodeMap.put(7, "G"); 
        decodeMap.put(8, "H"); 
        decodeMap.put(9, "I"); 
        decodeMap.put(10, "J"); 
        decodeMap.put(11, "K"); 
        decodeMap.put(12, "L"); 
        decodeMap.put(13, "M"); 
        decodeMap.put(14, "N"); 
        decodeMap.put(15, "O"); 
        decodeMap.put(16, "P"); 
        decodeMap.put(17, "Q"); 
        decodeMap.put(18, "R"); 
        decodeMap.put(19, "S"); 
        decodeMap.put(20, "T"); 
        decodeMap.put(21, "U"); 
        decodeMap.put(22, "V"); 
        decodeMap.put(23, "W"); 
        decodeMap.put(24, "X"); 
        decodeMap.put(25, "Y"); 
        decodeMap.put(26, "Z"); 

        String inputEncode = "12";

        decodeValues(inputEncode, decodeMap);
    }

    private static void decodeValues(String inputEncodeVale, Map<Integer, String> decodeMap) {
        int[] inputPossibleArray = new int[inputEncodeVale.length() + 1];
        for(int i = 1; i <= inputPossibleArray.length - 1; i++){
            inputPossibleArray[0] = Integer.parseInt(inputEncodeVale);
            inputPossibleArray[i] = Integer.parseInt(String.valueOf(inputEncodeVale.charAt(i-1)));
        }
        for(int j = 0; j <= inputPossibleArray.length -1; j++){
            System.out.print(" "+inputPossibleArray[j]);         
        }
        System.out.print("\n"); 
        System.out.println("========================");
        for(int j = 0; j <= inputPossibleArray.length -1; j++){
            System.out.print(" "+decodeMap.get(inputPossibleArray[j]));
        }
    }
}
