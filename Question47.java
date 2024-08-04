//Given an integer array, find the minimum value and its index in the array.

public class Question47 {
    public static int[] minValuePrint(int[] arr) {
        
        int minValue = Integer.MAX_VALUE;
       
        int minIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minIndex = i;
            }
        }

        return new int[]{minValue, minIndex};
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,4,5};

        int result[] = minValuePrint(arr);
        if(result.length == 2){
            System.out.println(result[0]+" "+result[1]);
        }

    }
}
