/* In a competitive gardening contest, participants are provided with a list of plant heights represented as positive numbers in a single-line array, each value separated by spaces. The task at hand is to identify the most significant difference in height between any two plants. The challenge is to select a pair of plants, denoted as (i, j). The subtracted value of i and j should be the maximum when compared with different values of i and j in the array, and also the value of j should be greater than the value of i.

Example

Input:

8 //size of the array

9

10

2

6

7

12

8

1

Output:

5

Explanation: 

The difference between the values 0 and 5 is 5. If i = 0 and j = 5, It also satisfies the other condition j > i.

Input format :
The first line contains a single integer n, which represents the number of integers in the list.

The second line contains n integers in n lines, which represent the list of elements.

Output format :
The output consists of a single integer, which represents the maximum difference between two integers in the list such that the larger integer appears after the smaller integer.

Sample test cases :
Input 1 :
8
2 
4 
6 
10 
12 
8 
14 
20
Output 1 :
7
Input 2 :
8
9
10
2
6
7
12
8
1
Output 2 :
5 */


import java.util.Scanner;

public class Question49 {

    public static int findMaxDifference(int[] heights, int n) {
        // Initialize minimum value to the first element
        int min_value = heights[0];
        int max_difference = 0;

        // Traverse through the array
        for (int i = 1; i < n; i++) {
            // Calculate the difference
            int difference = heights[i] - min_value;

            // Update max_difference if the current difference is greater
            if (difference > max_difference) {
                max_difference = difference;
            }

            // Update min_value to the current element if it's smaller
            if (heights[i] < min_value) {
                min_value = heights[i];
            }
        }

        return max_difference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        int n = sc.nextInt();

        // Input the array elements
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        // Find and print the maximum difference
        System.out.println(findMaxDifference(heights, n));
        
        sc.close();
    }
}
