// Everty character in the input string is followed by its frequency. 
//Write a function to decrpt the string and find nth character of the decrypted string.
// if no character exisit at that position then return -1.

// Note the frequnecy of the encrypted striong cannot be greater than single digit i.e. < 10.
// Input 1 - a2b2c2d1
// Input 2 - 5

//Output - c

public class Solution54{
    public static char printDecryptedString(String str, int N){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i+=2){
            char currentCharacter = str.charAt(i);
            int value = Character.getNumericValue(str.charAt(i+1));

            for(int j = 0;j<value;j++){
                sb.append(currentCharacter);
            }
        }
        if(N <= sb.length()){
            return sb.charAt(N-1);
        }
        return '-';
    }
    public static void main(String args[]){
        int n = 5;
        String str = "a2b2c2d1";

        System.out.println(printDecryptedString(str, n));
    }
}
