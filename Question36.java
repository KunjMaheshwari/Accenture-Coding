//count the number of swaps required to sort the array using selection sort

public class Question36 {
    public static int SelectionSorting(int arr[]){
        int count = 0;

        for(int i=0;i<arr.length;i++){
            int minIdx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }

            if(minIdx != i){
                // swapping
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
                count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        int arr[] = {3,2,6,1,4};
        System.out.println(SelectionSorting(arr));
    }
}
