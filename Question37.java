import java.util.*;

public class Question37 {
    public static int ChocolateProblem(int arr[], int n){
        // base condition
        if(n ==0 || arr.length == 0){
            return 0;
        }

        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0;i+n-1<arr.length;i++){
            int diff = arr[i+n-1] - arr[i];
            if(diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int[] chocolates = {7, 3, 2, 4, 9, 12, 56};
        int n = 3; 

        System.out.println(ChocolateProblem(chocolates, n));
    }
}
