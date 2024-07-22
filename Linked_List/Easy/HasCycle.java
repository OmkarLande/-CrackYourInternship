//Linked List Cycle

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean hasCycle(ListNode head) {
        //method 1: using hashset
        // Set<ListNode> set = new HashSet<>();
        // while (head != null) {
        //     if (!set.add(head)) {
        //         return true;
        //     }
        //     head = head.next;
        // }
        // return false;

        //method 2: using two pointers
        if (head == null || head.next == null) {
          return false;
        }
    
        ListNode slow = head;
        ListNode fast = head;
    
        while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
    
          if (slow == fast) {
            return true;
          }
        }
    
        return false;  
    }
}