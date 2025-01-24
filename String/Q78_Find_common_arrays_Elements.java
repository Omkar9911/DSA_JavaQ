
//Find common elements in three sorted arrays

/*
Given three sorted arrays in non-decreasing order, print all common elements in these arrays.
Note: In case of duplicate common elements, print only once.

Examples:
Input: A[] = {1, 5, 10, 20, 30} , B[] = {5, 13, 15, 20}, C[] = {5, 20}
Output: 5 20
Explanation: 5 and 20 are common in all the arrays.

Input: A[] = {2, 5, 10, 30}, B[] = {5, 20, 34}, C[] = {5, 13, 19}
Output: 5
*/
package String;

import java.util.ArrayList;
import java.util.List;

public class Q78_Find_common_arrays_Elements {

    public static List<Integer> findCommonElements(int[] A, int[] B, int[] C) {
        // List to store the common elements
        List<Integer> commonElements = new ArrayList<>();

        // Pointers for A, B, and C
        int i = 0, j = 0, k = 0;

        // Traverse through all arrays simultaneously
        while (i < A.length && j < B.length && k < C.length) {
            // If elements are equal in all arrays
            if (A[i] == B[j] && B[j] == C[k]) {
                // Avoid duplicates in the result list
                if (commonElements.isEmpty() || commonElements.get(commonElements.size() - 1) != A[i]) {
                    commonElements.add(A[i]);
                }
                i++;
                j++;
                k++;
            }
            // Increment the pointer for the smallest value
            else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }

        return commonElements;
    }

    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 30};
        int[] B = {5, 13, 15, 20};
        int[] C = {5, 20};

        List<Integer> result = findCommonElements(A, B, C);

        System.out.println("Common Elements: " + result);
    }



}
