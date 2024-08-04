// Given an array of integers, find the average of all positive numbers in the array.

public class Question48{
    public static int average(int arr[]){
        int sum = 0;
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 0){
                sum += arr[i];
                count = count+1;
            }
        }
        return sum/count;
    }
    public static void main(String args[]){
        int arr[] = {5, 2, -4, 1, 3};

        System.out.println(average(arr));
    }
}