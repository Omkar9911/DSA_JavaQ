package String;

import java.util.Stack;

public class q42_Valid_Parentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                // Push opening brackets onto the stack
                stack.push(c);
            } else {
                // If stack is empty or top of stack does not match, it's invalid
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets are matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        q42_Valid_Parentheses solution = new q42_Valid_Parentheses();
        System.out.println(solution.isValid("()")); // true
        System.out.println(solution.isValid("()[]{}")); // true
        System.out.println(solution.isValid("(]")); // false
        System.out.println(solution.isValid("([])")); // true
        System.out.println(solution.isValid("{[()]}")); // true
        System.out.println(solution.isValid("[")); // false
    }
}



