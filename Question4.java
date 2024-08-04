//Check if the String is palindrome or not 

public class Question4 {
    public static boolean isPalindrome(String str){
        if(str == ""){
            return true;
        }
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-1)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "abcdcba";

        System.out.println(isPalindrome(str));
    }
}
