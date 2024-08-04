//Union of two arrays 

import java.util.*;

public class Question7 {
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer> Union = new ArrayList<>(); // Uninon vector
        while(i<n && j<m){
            // Case 1 
            if(arr1[i] <=arr2[j]){
                if(Union.isEmpty() || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            }else{
                // Case 2
                if(arr1[i] > arr2[j]){
                    if(Union.isEmpty() || Union.get(Union.size()-1) != arr2[j]){
                        Union.add(arr2[j]);
                    }
                    j++;
                }
            }
        }

        while(i<n){
            if(Union.isEmpty() || Union.get(Union.size()-1) != arr1[i]){
                Union.add(arr1[i]);
            }
            i++;
        }

        while(j<m){
            if(Union.isEmpty() || Union.get(Union.size()-1) != arr2[j]){
                Union.add(arr2[j]);
            }
            j++;
        }
        return Union;
    }

    public static void main(String[] args) {
        int n = 10, m = 7;
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        System.out.println(FindUnion(arr1, arr2, n, m));
    }
}
