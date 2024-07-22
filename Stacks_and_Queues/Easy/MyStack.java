//Implement Stack using Queues

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    public Queue<Integer> queue1;
    public Queue<Integer> queue2;
    public int top;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        queue1.offer(x);
        top = x;
    }
    
    public int pop() {
        //method 1: if queue1 has more than one element, move all elements except the last one to queue2
        //method 2: if queue1 has only one element, pop that element
        if(queue1.isEmpty()){
            throw new IllegalArgumentException("stack is empty");
        }
        while(queue1.size() > 1){
            top = queue1.poll();
            queue2.offer(top);
        }
        int popElement = queue1.poll();
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        return popElement;
    }
    
    public int top() {
        return top;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */