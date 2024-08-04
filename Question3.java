// Return the maximum element of an array 

public class Question3{
    public static int maxElementArray(int arr[]){
        int maxElement = Integer.MIN_VALUE;
        int currElement = 0;

        for(int i=0;i<arr.length;i++){
            currElement = arr[i];
            if(currElement > maxElement){
                maxElement = currElement;
            }
            maxElement = Math.max(currElement, maxElement);
        }
        return maxElement;
    }
    public static void main(String[] args) {
        int arr[] = {18,20,55,90,43};
        System.out.println(maxElementArray(arr));
    }
}