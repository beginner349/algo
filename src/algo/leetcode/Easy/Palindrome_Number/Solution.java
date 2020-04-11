package algo.leetcode.Easy.Palindrome_Number;


class Solution {

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		int initial = x;
		int result = 0;
		while (x > 0) {
			int remainder = x % 10;
			result = result*10 + remainder;
			x = x / 10;
		}
		return initial == result;
	}

}
