package com.reprep;
public class ZigZagString {
    public static String convert(String s, int numRows){
        if(s.length() == 1 || s.length() < numRows){
            return s;
        }
        char[] charArray = new char[s.length()];
        int count = 0;
        int mainStep = (numRows-1)*2;
        for(int i = 0; i < numRows; i++){
            int j = i;

            while(j < s.length()){
                charArray[count++] = s.charAt(j);
                System.out.println(s.charAt(j)+" "+count);
                if(i > 0 && i <numRows - 1 ){
                    int k = j + mainStep - 2*i;
                    System.out.println("k :"+k+" j :"+j+" i :"+i);
                    if(k < s.length()){
                        charArray[count++] = s.charAt(k);
                    }
                }
                j = j + mainStep;
                System.out.println("next j index : "+j);
            }
        }
        

        return new String(charArray);
    }

    public static void main(String[] args) {
        String s = "paypalishiring";
        int numRows = 4;
        String outputS = convert(s, numRows);
        System.out.println(outputS);
    }

}
