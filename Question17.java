// Find the Kth largest element in the arrays

import java.util.*;

public class Question17 {
    public static int largest(int arr[], int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,6,8,2,9};
        int k = 2;

        System.out.println(largest(arr, k));
    }
}
