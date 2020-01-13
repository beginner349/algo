package algo.leetcode.Easy.Reverse_Integer;

class Solution {
	public int reverse(int x) {
		int rev = 0;
		int MIN = Integer.MIN_VALUE; // -2^31
		int MAX = Integer.MAX_VALUE - 1; // 2^31 - 1
		while (x != 0) {
			int remainder = x % 10;
			// handle positive integer overflows
			if (x > 0 && (MAX - remainder) / 10 < rev) {
				return 0;
			}
			// handle negative integer overflows
			if (x < 0 && (MIN - remainder) / 10 > rev) {
				return 0;
			}
			rev = rev * 10 + remainder;
			x = x / 10;
		}
		return rev;
	}
}
