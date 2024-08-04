/*The function accepts a string ‘str’ as its argument. The function needs to
reverse the order of the words in the string. */

public class Question43{
    public static void reversedString(String str){
        int start = 0;
        int end = str.length()-1;

        String output = "";

        for(int i=end;i>=start;i--){
            output += str.charAt(i);
        }
        System.out.println(output);
    }
    public static void main(String args[]){
        String str = "Hello World!";
        reversedString(str);

        
    }
}