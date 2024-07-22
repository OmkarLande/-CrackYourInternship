//Middle of the Linked List
class Solution {
    public ListNode middleNode(ListNode head) {
        //method 1: using two pointers
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
        
        //method 2: using array
        // ListNode[] A = new ListNode[100];
        // int t = 0;
        // while (head != null) {
        //     A[t++] = head;
        //     head = head.next;
        // }
        // return A[t / 2];

        //method 3: using counter
        // int count = 0;
        // ListNode curr = head;
        // while(curr != null){
        //     count++;
        //     curr = curr.next;
        // }
        // int mid = count/2;
        // curr = head;
        // while(mid > 0){
        //     curr = curr.next;
        //     mid--;
        // }
        // return curr;

    }
}