//Given a string you are requested to determine whether The string should be converted to all upper case or all lower case depending on the count of uppercase and lower case letter in the string.

import java.util.*;
public class Question30 {
    public static String upperandlower(String str){
        int countUpper = 0;
        int countLower = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                countUpper++;
            }else{
                countLower++;
            }
        }
        if(countLower > countUpper){
            str = str.toLowerCase();
        }else{
            str = str.toUpperCase();
        }
        return str;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(upperandlower(str));

        sc.close();
    }
}
