package algo.leetcode.Medium.Remove_K_Digits;

import java.util.Stack;

class Solution {

	public String removeKdigits(String num, int k) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < num.length(); i++) {
			int val = num.charAt(i) - '0';
			while (k > 0) {
				if (!stack.isEmpty() && stack.peek() > val) {
					stack.pop();
					k--;
				} else {
					break;
				}
			}
			stack.push(val);

		}
		while (k > 0) {
			stack.pop();
			k--;
		}
		String result = "";
		while (!stack.isEmpty()) {
			result = stack.pop() + result;
		}

		for (int i = 0; i < result.length(); ++i) {
			char c = result.charAt(i);
			if (c != '0') {
				return result.substring(i);
			}
		}
		return "0";

	}

}
