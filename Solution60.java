// You are on a hiking trail represented by an Array A of length N. where the trial initially ascends and then descends forming a single peek. Your task is to find and return an integer valye representing the elevation of the summit.


public class Code1{
    public static int hikingPoint(int arr[], int N){
        int maxValue = 0;

        for(int i=0;i<N;i++){
            int currentValue = arr[i];
            if(currentValue > maxValue){
                maxValue = currentValue;
            }
            maxValue = Math.max(currentValue, maxValue);
        }
        return maxValue;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,4,3,2,1};
        int N = arr.length;

        System.out.println(hikingPoint(arr, N));
    }
}
