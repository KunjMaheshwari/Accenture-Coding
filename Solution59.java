// Alex gives you a positive Number N and wants you to rearrnage the bits of the number in its binary represntation such that all set bits are in consecutive order. Your task is to find and return an integer valye representing the minimum possible number that can be formed after re arrangement the bits of the Number N.

public class Code1{
    public static int rearrnagement(int n){
        int setBits = Integer.bitCount(n);

        int result = (1 << setBits) -1;

        return result;
    }
    public static void main(String args[]){
        int N  =10;

        System.out.println(rearrnagement(N));
    }
}
