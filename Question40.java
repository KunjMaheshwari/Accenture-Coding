public class Question40 {
    public static int equlibriumPoint(int arr[]){
        int totalSum = 0;
        for(int i=0;i<arr.length;i++){
            totalSum += arr[i];
        }

        int leftSum = 0;
        for(int j=0;j<arr.length;j++){
            int rightSum = totalSum - leftSum - arr[j];

            if(leftSum == rightSum){
                return j;
            }
            leftSum += arr[j];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,2,2};

        System.out.println(equlibriumPoint(arr));
    }
}