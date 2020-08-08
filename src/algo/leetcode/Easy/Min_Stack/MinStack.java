package algo.leetcode.Easy.Min_Stack;

import java.util.Stack;

class MinStack {
	
	Stack<Integer> stack;
	Stack<Integer> minStack;
	
	/** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if (stack.isEmpty()) {
        	minStack.push(x);
        } else {
        	if (x < minStack.peek()) {
            	minStack.push(x);
            } else {
            	minStack.push(minStack.peek());
            }
        }
        stack.push(x);

    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
	
}
