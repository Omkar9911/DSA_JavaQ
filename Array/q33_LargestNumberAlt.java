
//Arrange given numbers to form the biggest number
/*
concatenating them in order, it results in the largest possible number. Since the result may be very large, return it as a string.

Examples:

Input: arr[] =  [3, 30, 34, 5, 9]
Output: “9534330”
Explanation: The arrangement [9, 5, 34, 3, 30], gives the largest value “9534330”.


Input: arr[] =  [54, 546, 548, 60]
Output: “6054854654”
Explanation: The arrangement [60, 548, 546, 54], gives the largest value “6054854654”.


Input: arr[] =  [3, 4, 6, 5, 9]
Output: “96543”
Explanation: The arrangement [9, 6, 5, 4, 3], gives the largest value “96543”.

*/


package Array;

import java.util.Arrays;
import java.util.Comparator;

public class q33_LargestNumberAlt {

    public static String formLargestNumber(int[] arr) {
        // Convert the integers to strings
        String[] strArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            strArr[i] = String.valueOf(arr[i]);
        }

        // Sort strings using a simple Comparator
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Sort in descending order
            }
        });

        // If the largest number is "0", return "0"
        if (strArr[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted strings
        StringBuilder result = new StringBuilder();
        for (String num : strArr) {
            result.append(num);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 30, 34, 5, 9};
        System.out.println(formLargestNumber(arr1)); // Output: "9534330"

        int[] arr2 = {54, 546, 548, 60};
        System.out.println(formLargestNumber(arr2)); // Output: "6054854654"

        int[] arr3 = {3, 4, 6, 5, 9};
        System.out.println(formLargestNumber(arr3)); // Output: "96543"

        int[] arr4 = {0, 0, 0};
        System.out.println(formLargestNumber(arr4)); // Output: "0"
    }
}
