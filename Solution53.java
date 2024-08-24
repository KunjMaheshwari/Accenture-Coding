// Alice has to climb N stairs to reach top. In each step Alice cam climb either 1 step or M steps. Find the minimum number of steps to reach the top. 

// Input -> 5 2 
// Output -> 3

public class Solution53{
    public static int minSteps(int N, int M){
        int mSteps = N/M;
        int remainingSteps = N%M;

        return mSteps+remainingSteps;
    }
    public static void main(String args[]){
        int N = 5;
        int M = 2;

        System.out.println(minSteps(N, M));
    }
}
