package algo.leetcode.Easy.Implement_Queue_using_Stacks;

import java.util.Stack;

class MyQueue {
	
	Stack<Integer> stack;
	Stack<Integer> elements;
	
	/** Initialize your data structure here. */
	public MyQueue() {
		stack = new Stack<Integer>();
		elements = new Stack<Integer>();
	}

	/** Push element x to the back of queue. */
	public void push(int x) {
		stack.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	public int pop() {
		if (elements.isEmpty()) {
			while (!stack.isEmpty()) {
				elements.push(stack.pop());
			}
		}
		return elements.pop();
	}

	/** Get the front element. */
	public int peek() {
		if (elements.isEmpty()) {
			while (!stack.isEmpty()) {
				elements.push(stack.pop());
			}
		}
		return elements.peek();
	}

	/** Returns whether the queue is empty. */
	public boolean empty() {
		return stack.size() + elements.size() == 0;
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
