// Reversing the word in the string

public class Question2 {
    public static String reverseWords(String s){
        String str[] = s.trim().split("\\s+");
        String out = "";
        
        for(int i=s.length()-1;i>0;i--){
            out += str[i] +" ";
        }

        return out + str[0];
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        reverseWords(s);
    }
}