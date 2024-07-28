// 1290. Convert Binary Number in a Linked List to Integer

// The comment `// 1290. Convert Binary Number in a Linked List to Integer` is providing a brief
// description or title for the code that follows. It indicates that the code below is likely related
// to solving the LeetCode problem with ID 1290, which involves converting a binary number represented
// as a linked list to an integer.

class Solution {
    public int getDecimalValue(ListNode head) {
        int result = 0;
        while (head != null) {
            result = (result * 2) + head.val;
            head = head.next;
        }
        return result;
    }
}