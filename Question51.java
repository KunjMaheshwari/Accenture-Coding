// Check if the sum of digits of a number is prime or not -> isGoogly Number.

public class Question51{
    public static boolean isPrime(int n){
        if(n < 0){
            return false;
        }
        if(n == 2 || n == 3){
            return true;
        }
        if(n % 2 == 0 || n % 3 == 0){
            return false;
        }

        for(int i=5;i*i<n;i += 6){
            if(n%i == 0 && n%i+2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void isGoogly(int n){
        int sum = 0;
        while(n > 0){
            int currNum = n%10;
            sum += currNum;
            n = n/10;
        }
        if(isPrime(sum)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String args[]){
        int n = 43;
        isGoogly(n);
    }
}
