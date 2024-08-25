// Frequency counter

/*
 * Input - babdc
 * Output - a1b2c1d1
 */

import java.util.*;
public class Code1{

    public static String countTheFrequency(String str){
        TreeMap<Character, Integer> map = new TreeMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for(char c : map.keySet()){
            sb.append(c).append(map.get(c));
        }

        return sb.toString();

    }
    public static void main(String args[]){
        String str = "babdc";

        System.out.println(countTheFrequency(str));
    }
}
