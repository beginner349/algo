package algo.leetcode.Easy.Implement_Stack_using_Queues;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

	Queue<Integer> q1;
	Queue<Integer> q2;
    Queue<Integer> temp;

	
    /** Initialize your data structure here. */
    public MyStack() {
    	q1 = new LinkedList<Integer>();
    	q2 = new LinkedList<Integer>();
    	temp = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
    	q1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (q1.size() != 1) {
        	q2.add(q1.remove());
        }
        int value = q1.remove();
        temp = q1;
        q1 = q2;
        q2 = temp;
        return value;
    }
    
    /** Get the top element. */
    public int top() {
    	while (q1.size() != 1) {
        	q2.add(q1.remove());
        }
        int value = q1.peek();
    	q2.add(q1.remove());
        temp = q1;
        q1 = q2;
        q2 = temp;
        return value;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.size() == 0;
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