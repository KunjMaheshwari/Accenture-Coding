// Given an array of random numbers, push all the zeros of the given array to the end of the array. All the non zero elements should come in front and order of the all non zero elements should be same.

import java.util.*;
public class Question52{
    public static void printArray(int arr[]){
        ArrayList<Integer> newArr = new ArrayList<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                newArr.add(arr[i]);
            }else{
                count++;
            }
        }
        while(count>0){
            newArr.add(0);

            count--;
        }

        System.out.println(newArr);

    }
    public static void main(String args[]){
        int arr[] = {0,1,2,0,23,0,44};

        printArray(arr);
    }
}
