
//Q Remove Consecutive Characters
/*
You are given a string s, consisting of lowercase alphabets. Your task is to remove consecutive duplicate characters from the string.

Example:

Input: s = "aabb"
Output:  "ab"
Input:s = "aabaa"
Output: "aba"
Input: s = "abcddcba"
Output: "abcdcba"
*/

package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q43_Remove_Consecutive_Characters {

    // Method to remove consecutive duplicate characters
    public static String removeConsecutiveCharacter(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        // Read a single input string
        String S = read.readLine().trim();

        // Remove consecutive duplicate characters
        String result = removeConsecutiveCharacter(S);

        // Print the result
        System.out.println(result);
    }
}
