// The function accepts an integer array arr of size n as its argument. The function needs to return the index of an equilibrium point in the array, where the sum of elements on the left of the index is equal to the sum of elements on the right of the index. If no equilibrium point exist return -1. 

public class Code1{
    public static int equlibriumPoint(int arr[]){
        int totalSum = 0;
        int leftSum = 0;


        for(int i=0;i<arr.length;i++){
            totalSum += arr[i];
        }

        for(int i=0;i<=arr.length;i++){
            totalSum -= arr[i]; // rightsum calculation

            if(totalSum == leftSum){
                return i;
            }

            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};

        System.out.println(equlibriumPoint(arr));
    }
}
