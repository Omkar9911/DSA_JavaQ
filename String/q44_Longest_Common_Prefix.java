package String;

public class q44_Longest_Common_Prefix {
        public String longestCommonPrefix(String[] strs) {

            if (strs == null || strs.length == 0) {
                return "";
            }

            // Start with the first string as the prefix
            String prefix = strs[0];

            // Compare the prefix with each string in the array
            for (int i = 1; i < strs.length; i++) {
                // Keep reducing the prefix until it matches the beginning of strs[i]
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }

            return prefix;
        }

        public static void main(String[] args) {
            q44_Longest_Common_Prefix solution = new q44_Longest_Common_Prefix();
            String[] strs1 = {"flower", "flow", "flight"};
            System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs1)); // Output: "fl"

            String[] strs2 = {"dog", "racecar", "car"};
            System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs2)); // Output: ""
        }






}
