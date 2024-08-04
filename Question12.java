//Find the length of longest substring without repeating the characters.

public class Question12 {
    public static int longestSubstring(String str){
        int maxCount = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0;i<str.length();i++){
            while(str.charAt(i) == str.charAt(i+1)){
                count++;
                maxCount = count;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        String str = "aabbbbcccccccd";
        System.out.println(longestSubstring(str));
    }
}