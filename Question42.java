/*The function accepts two strings ‘str1’ and ‘str2’ as its argument. The function needs to return the index of the first occurrence of substring ‘str2’ in string ‘str1’ or -1 if the substring is not found. */

public class Question42 {
    public static int firstOccurence(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        if(m>n){
            return -1;
        }

        for(int i=0;i<n-m+1;i++){
            if(str1.substring(i, i+m).equals(str2)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "World";

        System.out.println(firstOccurence(str1, str2));
    }
}
