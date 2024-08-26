import java.util.*;

public class Code1{
    public static int countPermutation(String str){
        HashSet<Character> map = new HashSet<>();
        map.add('a');
        map.add('e');
        map.add('i');
        map.add('o');
        map.add('u');

        int count = 0;
        str = str.toLowerCase();
        for(char ch : str.toCharArray()){
            if(!map.contains(ch)){
                count++;
            }
        }
        if(count == 0){
            return 0;
        }

        return factorial(count);
    }
    public static int factorial(int count){
        if(count == 0 || count == 1){
            return 1;
        }
        return count* factorial(count-1);
    }
    public static void main(String args[]){
        String str = "ABC";

        System.out.println(countPermutation(str));
    }
}
