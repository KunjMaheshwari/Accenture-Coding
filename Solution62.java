// Given an array of length n, find the length of largest subarray which contains equal number of O's and 1's.

import java.util.*;
public class Code1{
    public static int largestSubArray(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for(int i=0;i<arr.length;i++){
            sum = (arr[i] == 0) ? (sum -1) : (sum+1);

            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            }else{
                map.put(sum, i);
            }
        }
        return maxLen;

    }
    public static void main(String args[]){
        int n[] = {1,0,1,1,1,0,0};

        System.out.println(largestSubArray(n));
    }
}
