//find the maximum element and its index in an array

public class Question21 {
    public static int[] maxElementAndIndex(int arr[]){
        int maxElement = arr[0];
        int maxIndex = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > maxElement){
                maxElement = arr[i];
                maxIndex = i;
            }
        }
        return new int[]{maxElement, maxIndex};
    }
    public static void main(String[] args) {
        int arr[] = {12,91,82,192,9191, 92,33};
        int result[] = maxElementAndIndex(arr);
        
        int maxElement = result[0];
        int maxIndex = result[1];

        System.out.println(maxElement);
        System.out.println(maxIndex);
    }
}
