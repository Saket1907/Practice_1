import java.util.Arrays;

public class VirInt {

    public static void printPermu(String inputString, String result){
            if(inputString.length() == 0){
                System.out.println(result);
            }
            for(int i = 0; i < inputString.length(); i++){
                char fixed = inputString.charAt(i);
                String toBePermu = inputString.substring(0, i) + inputString.substring(i + 1);
                printPermu(toBePermu, result + fixed);
            } 
        }
    public static int getFactorial(int initialNumber){
        if(initialNumber == 0){
            return 1;
    }
        return getFactorial(initialNumber - 1) * initialNumber;
    }
    public static int getReverseNumber(int numberToReverse){
        int reverse = 0;
        while(numberToReverse != 0){
            reverse = (reverse * 10) + (numberToReverse % 10);
            numberToReverse = numberToReverse / 10;
        }
        return reverse;
    }
    public static int findFibo(int fibboTill){
        if(fibboTill == 0){
            return 0;
        }
        if(fibboTill == 1){
            return 1;
        }
        return findFibo(fibboTill - 1) + findFibo(fibboTill - 2);
    }
    public static boolean isAnagram(int anagramNumber){
        if(anagramNumber == getReverseNumber(anagramNumber)){
            return true;
        }else{
            return false;
        }
    }
        public static void main(String[] args) {
            String inputString = "abc";
            int initialNumber = 6;
            int numberToReverse = 1234;
            int fibboTill = 9;
            int anagramNumber = 193931;
            int[] inputArray = {3,6,8,1,2,0};
            int[] copyOf = inputArray.clone();
            printPermu(inputString, ""); 
            System.out.println("---");
            System.out.println(getFactorial(initialNumber));
            System.out.println("---");
            System.out.println(getReverseNumber(numberToReverse));
            System.out.println("---");
            System.out.println(findFibo(fibboTill));
            System.out.println("---");
            System.out.println(isAnagram(anagramNumber));
            System.out.println("---");
            //Arrays.sort(inputArray);
            for(int z = 0; z <= copyOf.length -1; z++){
                System.out.println(copyOf[z]);
            }
            System.out.println(inputArray[inputArray.length -2]);
        }
}
