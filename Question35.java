// revering the word in Strings.

public class Question35 {
    public static String reverseWords(String s) {
        String str[] = s.trim().split("\\s+");
        String out = "";

        for (int i = str.length - 1; i > 0; i--) {
            out += str[i] + " ";
        }

        return out + str[0];
    }

    public static void main(String[] args) {
        String str = "The sky is Blue.";
        System.out.println(reverseWords(str));
    }
}
