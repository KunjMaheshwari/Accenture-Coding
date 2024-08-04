//Write a function to find the sum of second largest even number and the second smallest odd number 
import java.util.*;

public class Question25 {
    public static int SmallLargeSum(int arr[]){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        even.add(arr[0]);

        for(int i=1;i<arr.length;i++){
            if(i%2 == 0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        return (even.get(even.size()-2)+odd.get(1));
    }
    public static void main(String[] args) {
        int arr[] = {10, 3,2,1,6,4,8,9};

        System.out.println(SmallLargeSum(arr));
    }
}
