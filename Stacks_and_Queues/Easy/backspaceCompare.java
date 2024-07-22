//Backspace String Compare

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        //method 1: using stack
       return converted(s).equals(converted(t));

       //method 2: using two pointers
        // int i = s.length() - 1;
        // int j = t.length() - 1;
        // int skipS = 0;
        // int skipT = 0;

        // for (; i >= 0 || j >= 0; i--, j--) {
        //     while (i >= 0) {
        //         if (s.charAt(i) == '#') {
        //             skipS++;
        //             i--;
        //         } else if (skipS > 0) {
        //             skipS--;
        //             i--;
        //         } else {
        //             break;
        //         }
        //     }

        //     while (j >= 0) {
        //         if (t.charAt(j) == '#') {
        //             skipT++;
        //             j--;
        //         } else if (skipT > 0) {
        //             skipT--;
        //             j--;
        //         } else {
        //             break;
        //         }
        //     }

        //     if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
        //         return false;
        //     }

        //     if ((i >= 0) != (j >= 0)) {
        //         return false;
        //     }
        // }

        // return true;

    }

    public String converted(String str) {
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch != '#') stack.push(ch);
            else if(!stack.isEmpty()) stack.pop();
        }



        return String.valueOf(stack);
    }
}