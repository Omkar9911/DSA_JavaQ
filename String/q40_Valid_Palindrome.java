//Q.40 Valid Palindrome String

/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/



package String;

public class q40_Valid_Palindrome {

    public boolean isPalindrome(String s) {
        // convert string to lowercase and use StringBuilder to filter alphanumeric characters
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }

        // check if the filtered string is a palindrome
        int left = 0;
        int right = filtered.length() - 1;
        while (left < right) {
            if (filtered.charAt(left) != filtered.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        q40_Valid_Palindrome solution = new q40_Valid_Palindrome();
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(solution.isPalindrome(s1)); // Output: true
        System.out.println(solution.isPalindrome(s2)); // Output: false
        System.out.println(solution.isPalindrome(s3)); // Output: true
    }


}
