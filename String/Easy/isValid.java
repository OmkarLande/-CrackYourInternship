
import java.util.Stack;

//Valid Parentheses
class Solution {
    public boolean isValid(String s) {
        //method 1: using stack
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

        //method 2: using replace
        // int len = s.length();

        // while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
        //     s = s.replace("()", "");
        //     s = s.replace("[]", "");
        //     s = s.replace("{}", "");
        // }

        // return s.length() == 0;

        //method 3: using replaceAll
        // int len = s.length();
        // int len1 = 0;

        // while (len != len1) {
        //     len = s.length();
        //     s = s.replaceAll("\\(\\)", "");
        //     s = s.replaceAll("\\[\\]", "");
        //     s = s.replaceAll("\\{\\}", "");
        //     len1 = s.length();
        // }

        // return s.length() == 0;
    }
}