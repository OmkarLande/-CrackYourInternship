// 234. Palindrome Linked List

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        while (head != null) {
            int val = stack.pop();
            if (head.val != val) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}