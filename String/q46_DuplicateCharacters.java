
/*
Given a string S, the task is to print all the duplicate characters with their occurrences in the given string.

        Example:

Input: S = “geeksforgeeks”
Output:
e, count = 4
g, count = 2
k, count = 2
s, count = 2

Explanation: g occurs 2 times in the string, k occurs 2 times in the string, s occurs 2 times in the string while e occurs 4 times in the string rest of the characters have unique occurrences.
*/


package String;

public class q46_DuplicateCharacters {


    public static void main(String[] args) {
        // Input string
        String S = "geeksforgeeks";

        // Create an array to store the frequency of each character
        int[] charCount = new int[256]; // Assuming extended ASCII characters

        // Count occurrences of each character
        for (int i = 0; i < S.length(); i++) {
            charCount[S.charAt(i)]++;
        }

        // Print characters with frequency > 1
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ", count = " + charCount[i]);
            }
        }
    }



}
