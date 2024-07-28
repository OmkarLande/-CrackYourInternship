// 227. Basic Calculator II

class Solution {
    public int calculate(String s) {
        Stack<Integer> numberStack = new Stack<>();
        int number = 0;
        char operator = '+';
        for (int index = 0; index < s.length(); index++) {
            char charValue = s.charAt(index);
            if (Character.isDigit(charValue)) {
                number = (number * 10) + (charValue - '0');
            }

            if ((!Character.isDigit(charValue) && charValue != ' ') || (index == s.length() - 1)) {
                if (operator == '+') {
                    numberStack.push(number);
                } else if (operator == '-') {
                    numberStack.push(-1 * number);
                } else if (operator == '*') {
                    numberStack.push(number * numberStack.pop());
                } else if (operator == '/') {
                    numberStack.push(numberStack.pop() / number);
                }
                number = 0;
                operator = charValue;
            }
        }
        int sum = 0;
        while(!numberStack.isEmpty()){
            sum += numberStack.pop();
        }
        return sum;
    }
}