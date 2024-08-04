import java.util.*;

public class Question44 {
    public static int[] findPair(int[] arr, int sum) {
        // Sort the array
        Arrays.sort(arr);

        // Initialize two pointers
        int left = 0;
        int right = arr.length - 1;

        // Traverse the array with two pointers
        while (left < right) {
            int currentSum = arr[left] + arr[right];

            // Check if the current sum is equal to the desired sum
            if (currentSum == sum) {
                return new int[]{arr[left], arr[right]};
            }

            // If the current sum is less than the desired sum, move the left pointer to the right
            if (currentSum < sum) {
                left++;
            }
            // If the current sum is greater than the desired sum, move the right pointer to the left
            else {
                right--;
            }
        }

        return new int[]{};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int sum = 9;

        int result[] = findPair(arr, sum);

        if (result.length == 2) {
            System.out.println("Pair found: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("No pair found");
        }

    }
}
