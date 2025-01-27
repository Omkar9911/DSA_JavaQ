package String;

import java.util.HashSet;

public class q47_LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Input: \"" + s1 + "\"\nOutput: " + lengthOfLongestSubstring(s1));
        System.out.println("Input: \"" + s2 + "\"\nOutput: " + lengthOfLongestSubstring(s2));
        System.out.println("Input: \"" + s3 + "\"\nOutput: " + lengthOfLongestSubstring(s3));
    }


}
