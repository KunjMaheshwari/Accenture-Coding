// Find the intersection of two arrays
import java.util.*;

public class Question6 {
    public static ArrayList<Integer> intersectionArray(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> Intersection = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        // Convert arrays to ArrayLists
        for (int i = 0; i < n; i++) {
            list1.add(arr1[i]);
        }
        
        for (int i = 0; i < m; i++) {
            list2.add(arr2[i]);
        }
        
        // Sort the ArrayLists to enable two-pointer technique
        Collections.sort(list1);
        Collections.sort(list2);
        
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).equals(list2.get(j))) {
                // Add to result if it's not already present
                if (Intersection.isEmpty() || !Intersection.get(Intersection.size() - 1).equals(list1.get(i))) {
                    Intersection.add(list1.get(i));
                }
                i++;
                j++;
            } else if (list1.get(i) < list2.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        
        return Intersection;
    }
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        int n = nums1.length;
        int m = nums2.length;


        intersectionArray(nums1, nums2, n, m);
    }
}
