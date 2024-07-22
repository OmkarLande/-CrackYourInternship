//Implement Queue using Stacks

import java.util.Stack;

class MyQueue {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        //method 1: if stack2 is empty, push all elements from stack1 to stack2
        //method 2: if stack2 is not empty, pop from stack2

        if(empty()){
             throw new IllegalArgumentException("queue is empty");
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    
    public int peek() {
        //method 1: if stack2 is empty, push all elements from stack1 to stack2
        //method 2: if stack2 is not empty, peek from stack2
        if(empty()){
             throw new IllegalArgumentException("queue is empty");
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */