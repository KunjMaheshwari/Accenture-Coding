import java.util.*;
public class Code1 {
    public static void printArr(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        ans.addAll(even);
        ans.addAll(odd);

        System.out.println(ans);
    }
    public static void main(String args[]) {
        int arr[] = {12, 34, 45, 9, 8, 90, 3};
        printArr(arr);
    }
}
