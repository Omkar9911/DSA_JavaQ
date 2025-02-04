package String;

public class q51_PalindromicSubstrings {

    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expandAroundCenter(s, i, i);     // Odd length palindromes
            count += expandAroundCenter(s, i, i + 1); // Even length palindromes
        }
        return count;
    }

    private int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        q51_PalindromicSubstrings solution = new q51_PalindromicSubstrings();
        System.out.println(solution.countSubstrings("abc")); // Output: 3
        System.out.println(solution.countSubstrings("aaa")); // Output: 6
    }


}
