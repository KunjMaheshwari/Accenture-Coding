//Count the occurence of each element in an array


import java.util.*;

public class Question9 {
    public static void countOccurence(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }else{
                    break;
                }
            }
            System.out.println(arr[i]+" -> "+ count);
            i+= (count-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,1,2,1,9,9,3,1,2,6,8,5};
        countOccurence(arr);
    }
}