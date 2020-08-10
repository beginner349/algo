package algo.leetcode.Easy.Happy_Number;

import java.util.HashSet;
import java.util.Set;

class Solution {

	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<Integer>();
		while (true) {
			int value = calculateSumOfSquares(n);
			if (value == 1) {
				return true;
			} else if (set.contains(value)) {
				return false;
			} else {
				set.add(value);
				n = value;
			}
		}
		
	}

	private int calculateSumOfSquares(int n) {
		String s = String.valueOf(n);
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int temp = s.charAt(i) - '0';
			result = result + temp*temp;
		}
		return result;
	}

}
