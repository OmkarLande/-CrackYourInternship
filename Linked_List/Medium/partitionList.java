// 86. Partition List

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lesser = new ListNode(0);
        ListNode gretter = new ListNode(0);
        ListNode l = lesser;
        ListNode g = gretter;

        ListNode current = head;
        while (current != null) {
            if (current.val < x) {
                l.next = current;
                l = l.next;
            } else {
                g.next = current;
                g = g.next;
            }
            current = current.next;
        }

        g.next = null;
        l.next = gretter.next;

        return lesser.next;
    }
}