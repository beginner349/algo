package algo.leetcode.Easy.Sqrt_x;

class Solution {

	public int mySqrt(int x) {
		// base cases 0, 1
		if (x <= 1) {
			return x;
		}
		int low = 0;
		int high = x;
		while (low <= high) {
			int mid = (high - low) / 2 + low;
			if (mid * mid == x) {
				return mid;
			} else if (x / mid < mid) { // same as mid * mid > x (handle integer overflow)
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return high;
	}
}
