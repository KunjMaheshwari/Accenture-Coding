// You are given an integer N and string s, your task is to find and return new string which consist of the orignal string repeated N times. 


public class Code1{
    public static String repeatedNtimes(int N, String str){
        String newStr = "";
        while(N > 0){
            newStr += str;
            N--;
        }
        return newStr;
    }
    public static void main(String args[]){
        int N = 3;
        String str = "abc";

        System.out.println(repeatedNtimes(N, str));
    }
}
