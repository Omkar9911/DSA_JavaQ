// Q5. Chocolate Distribution Problem

/*
Given an array arr[] of n integers where arr[i] represents the number of chocolates in ith packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets exactly one packet.
The difference between the maximum and minimum number of chocolates in the packets given to the students is minimized.

Examples:

Input: arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 3
Output: 2
Explanation: If we distribute chocolate packets {3, 2, 4}, we will get the minimum difference, that is 2.


Input: arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 5
Output: 7
Explanation: If we distribute chocolate packets {3, 2, 4, 9, 7}, we will get the minimum difference, that is 9 – 2 = 7.

 */





import java.util.Arrays;

public class q5_chocolate_distribution {

    public static int minDiffChocolates(int[] arr, int n, int m) {
        if (m > n) {
            return -1; // Not enough chocolates to distribute to all students
        }

        // Sort the array
        Arrays.sort(arr);

        // Initialize variables to track minimum difference
        int minDiff = Integer.MAX_VALUE;

        // Find the minimum difference by comparing subsets of m packets
        for (int i = 0; i <= n - m; i++) {
            int currentDiff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, currentDiff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int n = arr.length;
        int m = 7; // Number of students

        int result = minDiffChocolates(arr, n, m);
        System.out.println("Minimum difference: " + result);
    }
}