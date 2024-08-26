// You are provided two strings s1 and s2. In s1, you can perfrom operations such as adding, removing or swapping letters. Each operation has a specific Cost value associated with it as shown below. 

// If a letter is removed from S1 the cost is 0.
// If a pair of letter are swapped in s1 the cost is 0.
// If a new letter is added to the end of s1 then cost is 1.

// your task is to find and return an integer value representing the minimum cost required to transform string s1 to s2.

import java.util.*;

public class Code1{
    public static int similarStrings(String str1, String str2){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str2.toCharArray()){
            // this will check the frequnecy of each character in the string.
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char ch : str1.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
            }
        }

        int sum = 0;
        for(int value : map.values()){
            sum += value;
        }
        return sum;
    }
    public static void main(String args[]){
        String str1 = "ABD";
        String str2 = "AABCCAAD";

        System.out.println(similarStrings(str1, str2));
    }
}
