//Find the sum of the divisors for the N integer number

public class Question34{
    public static int sumOfDivisor(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int n = 100;
        System.out.println(sumOfDivisor(n));
    }
}