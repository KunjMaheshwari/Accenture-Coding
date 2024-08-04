/*Write a function FindMaxInArray, which will find the greatest number from
an array with its desired index? The greatest number and its desired index
should be printed in separate lines.*/

public class Question27 {
    public static int[] MaximumNumberandIndex(int arr[]){
        int maxNumber =arr[0];
        int index = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > maxNumber){
                maxNumber = arr[i];
                index = i;
            }
        }
        return new int[]{maxNumber, index};
    }
    public static void main(String[] args) {
        int arr[] = {12,2,4,56,77,123,92};

        int newArr[] = MaximumNumberandIndex(arr);

        int maxNumber = newArr[0];
        int index = newArr[1];

        System.out.println(maxNumber);
        System.out.println(index);
    }
}
