//22. Generate Parentheses

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("");

        while (!queue.isEmpty()) {
            String s = queue.poll();

            int open = countChar(s, '(');
            int close = countChar(s, ')');

            if (s.length() == n * 2) {
                if (open == close) {
                    result.add(s);
                }
                continue;
            }

            if (open < n) {
                queue.add(s + "(");
            }
            if (close < open) {
                queue.add(s + ")");
            }
        }

        return result;
    }

    private int countChar(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c)
                count++;
        }
        return count;
    }
}