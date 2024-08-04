// Find the second largest element in an array
import java.util.*;

public class Question10 {
    public static int secondLargest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7,19,20,88};
        System.out.println(secondLargest(arr));
    }
}
