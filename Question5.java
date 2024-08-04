//Find the missing number in an array

public class Question5 {
    public static int missingNumber(int arr[]){
        // Sum s1 and s2 
        // we know the sum of first n natural number is n(n+1)/2;

        int n = arr.length;

        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i=0;i<n;i++){
            sum2 += arr[i];
        }
        return (sum1 - sum2);
    }
    public static void main(String[] args) {
        int arr[] = {3,0,1};

        System.out.println(missingNumber(arr));
    }
}
