// Remove duplicates from an Array

public class Question8 {
    public static int duplicates(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,5,6};
        System.out.println(duplicates(arr));
    }
}