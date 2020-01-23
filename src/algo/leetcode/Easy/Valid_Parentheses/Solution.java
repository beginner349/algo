package algo.leetcode.Easy.Valid_Parentheses;

import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					return false;
				} else if ( (c == ')' && stack.peek() != '(') || 
							(c == '}' && stack.peek() != '{') || 
							(c == ']' && stack.peek() != '[') ) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
        if (!stack.isEmpty()) {
        	return false;
        } 
        return true;
    }
}
