//Given a string str, a character ch1, and a character ch2, replace all
//occurrences of ch1 in str with ch2 and vice versa.

public class Question46 {
    public static String characterReplacement(String str, char ch1, char ch2){

        String newStr = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ch1){
                newStr += ch2;
            }else if (str.charAt(i) ==  ch2){
                newStr += ch1;
            }else{
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "aabbaa";
        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println(characterReplacement(str, ch1, ch2));
    }
}
