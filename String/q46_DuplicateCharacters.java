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
