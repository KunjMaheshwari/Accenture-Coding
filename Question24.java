//Sum of divisor of N numbers.

public class Question24 {
    public static int sumOfDivisor(int N){
        int sum = 0;

        for(int i=1;i<=Math.sqrt(N);i++){
            if(N%i == 0){
                sum += i;

                if(i != N/i){
                    sum += N/i;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int N = 24;
        System.out.println(sumOfDivisor(N));
    }
}