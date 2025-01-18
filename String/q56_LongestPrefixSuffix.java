/*
Longest Prefix Suffix
Given a string of characters s, find the length of the longest prefix which is also a suffix.
Note: Prefix and suffix can be overlapping but they should not be equal to the entire string.

Examples :

Input: s = "abab"
Output: 2
Explanation: "ab" is the longest prefix and suffix.
code in java

Input: s = "aabcdaabc"
Output: 4
Explanation: The string "aabc" is the longest prefix and suffix.
Input: s = "aaaa"
Output: 3
Explanation: "aaa" is the longest prefix and suffix.
*/


package String;

public class q56_LongestPrefixSuffix {

    public static int longestPrefixSuffix(String s) {
        int n = s.length();
        int[] lps = new int[n];
        int length = 0; // Length of the previous longest prefix suffix
        int i = 1;

        // Build the LPS array
        while (i < n) {
            if (s.charAt(i) == s.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // The last value of the LPS array gives the longest prefix which is also a suffix
        return lps[n - 1];
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "abab";
        String s2 = "aabcdaabc";
        String s3 = "aaaa";

        System.out.println("Longest Prefix Suffix length for " + s1 + " is: " + longestPrefixSuffix(s1));
        System.out.println("Longest Prefix Suffix length for " + s2 + " is: " + longestPrefixSuffix(s2));
        System.out.println("Longest Prefix Suffix length for " + s3 + " is: " + longestPrefixSuffix(s3));
    }
}
