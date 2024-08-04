// Write a function that reverses a String 

// import java.util.*;

// public class Question1 {

//     public static void reverseString(char[] s) {
//         Stack<Character> st = new Stack<>();
//         int idx = 0;

//         while (idx < s.length) {
//             st.push(s[idx]);
//             idx++;
//         }

//         StringBuilder sb = new StringBuilder();
//         while (!st.isEmpty()) {
//             char curr = st.pop();
//             sb.append(curr);
//         }
//         System.out.println(sb.toString());
//     }

//     public static void main(String[] args) {
//         char[] s = {'a', 'b', 'c', 'd'};
//         reverseString(s);
//     }
// }


public class Question1{
    public static String reveString(String str){
        String reversedString = "";
        for(int i=0;i<str.length();i++){
            reversedString = str.charAt(i) + reversedString;
        }
        return reversedString;
    }
    public static void main(String args[]){
        String str = "hello";
        System.out.println(reveString(str));
    }
}