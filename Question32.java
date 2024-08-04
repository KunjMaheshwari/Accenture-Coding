/*Coding Question 7
You are given a function, Void *ReplaceCharacter(Char str[], int n, char ch1, char ch2);

The function accepts a string  ‘ str’ of length n and two characters ‘ch1’ and ‘ch2’ as its arguments . Implement the function to modify and return the string ‘ str’ in such a way that all occurrences of ‘ch1’ in original string are replaced by ‘ch2’ and all occurrences of ‘ch2’  in original string are replaced by ‘ch1’.

Assumption: String Contains only lower-case alphabetical letters.

Note:

Return null if string is null.
If both characters are not present in string or both of them are same , then return the string unchanged.
Example:

Input:
Str: apples
ch1:a
ch2:p
Output:
Paales */

public class Question32{
    public static String ReplaceCharacter(String str, char ch1, char ch2){
        String newStr = "";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch1){
                newStr += ch2;
            }else if (str.charAt(i) == ch2){
                newStr += ch1;
            }else{
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
    public static void main(String args[]){
        String str = "apple";
        char ch1 = 'a';
        char ch2 = 'p';

        System.out.println(ReplaceCharacter(str, ch1, ch2));
    }
}