// Reverse Linked List
class Solution{

    public ListNode reverseList(ListNode head) {
        //method 1: using iterative
        // ListNode prev = null;
        // ListNode curr = head;
        // while(curr != null){
        //     ListNode nextTemp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = nextTemp;
        // }
        // return prev;

        //method 2: using recursive
        if( head == null || head.next == null) return head;
        
        ListNode newHead = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;

        //method 3: using stack
        // Stack<ListNode> stack = new Stack<>();
        // while(head != null){
        //     stack.push(head);
        //     head = head.next;
        // }
        // ListNode dummy = new ListNode(0);
        // ListNode curr = dummy;
        // while(!stack.isEmpty()){
        //     curr.next = stack.pop();
        //     curr = curr.next;
        // }
        // curr.next = null;
        // return dummy.next;

        //method 4: using two pointers
        // ListNode prev = null;
        // ListNode curr = head;
        // while(curr != null){
        //     ListNode nextTemp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = nextTemp;
        // }
        // return prev;
    }
}

