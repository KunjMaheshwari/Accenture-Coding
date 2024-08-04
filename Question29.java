//Anagram 

import java.util.*;

public class Question29 {
    public static String validAnagram(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char s1Array[] = s1.toCharArray();
        char s2Array[] = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        Boolean result = Arrays.equals(s1Array, s2Array);
        if(result){
            return "true";
        }
        return "false";


    }
    public static void main(String[] args) {
        String s1 = "abcdw";
        String s2 = "wabcd";

        System.out.println(validAnagram(s1, s2));
    }
}