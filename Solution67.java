public class Code1{
    public static int nthFibonnaci(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return (nthFibonnaci(n-1) + nthFibonnaci(n-2));
    }
    public static void main(String args[]){
        int n = 9;

        System.out.println(nthFibonnaci(n));
    }
}
