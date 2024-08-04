// 143. Reorder List
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
            return;
        ListNode middle = findMiddle(head);
        ListNode secondHalf = middle.next;
        middle.next = null;

        secondHalf = reverseList(secondHalf);

        mergelist(head, secondHalf);
    }

    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void mergelist(ListNode first, ListNode second) {
        ListNode pointer1 = first;
        ListNode pointer2 = second;

        while (pointer2 != null) {
            ListNode temp1 = pointer1.next;
            ListNode temp2 = pointer2.next;
            pointer1.next = pointer2;
            pointer2.next = temp1;
            pointer1 = temp1;
            pointer2 = temp2;
        }
    }
}