//You are required to input the size of the matrix then the elements of matrix, then you have to divide the main matrix in two sub matrices (even and odd) in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on. Then you have sort the even and odd matrices in ascending order and print the sum of second largest number from both the matrice

import java.util.*;

public class Question28 {
    public static int getSecondLargest(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = n * n;

        int[] matrix = new int[size];
        for (int i = 0; i < size; i++) {
            matrix[i] = sc.nextInt();
        }

        int[] even = new int[(size + 1) / 2];
        int[] odd = new int[(size) / 2];

        int evenIdx = 0;
        int oddIdx = 0;

        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                even[evenIdx++] = matrix[i];
            } else {
                odd[oddIdx++] = matrix[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        int secondLargestEven = getSecondLargest(even);
        int secondLargestOdd = getSecondLargest(odd);

        int result = secondLargestEven + secondLargestOdd;
        System.out.println(result);

        sc.close();
    }
}
