// Formula -> 2*currentlevel + n-1 + totalCards at level( current level -1)


public class Code1{
    public static int totalCards(int n){
        if(n == 1){
            return 2;
        }
        return 2*n +(n-1) + totalCards(n-1);
    }
    public static void main(String args[]){
        int n = 3;

        System.out.println(totalCards(n));
    }
}
