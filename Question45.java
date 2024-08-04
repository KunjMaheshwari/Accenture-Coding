//Maximum subarray sum -> Kadans Algorithm


public class Question45 {
    public static int MaximumSubArraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            currSum += arr[i];
            if(currSum <0){
                return -1;
            }
            if(currSum > maxSum){
                maxSum = currSum;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(MaximumSubArraySum(arr));
    }
}
