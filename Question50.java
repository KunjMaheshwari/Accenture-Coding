/* You are given a binary string consisting of a sequence of 1s and 0s. This binary string is an encoded version of an English word. Each uppercase letter in the word id 
represented by a sequence of 1s of varying length while 0s act as separator between these sequence. Your task is to decode the binary string and determine the original word.*/


import java.util.*;

public class Question50{
    public static String decodedString(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);

            if(currentChar == '1'){
                count++;
            }else if(currentChar == '0' && count > 0){
                sb.append((char)('A' + count -1));
                count = 0;
            }
        }
        if(count>0){
            sb.append((char)('A' + count - 1));
        }

        return sb.toString();
    }
    public static void main(String args[]){
        String s = "1110101111";
        System.out.println(decodedString(s));
    }
}
