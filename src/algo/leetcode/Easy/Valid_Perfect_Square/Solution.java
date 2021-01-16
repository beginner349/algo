package algo.leetcode.Easy.Valid_Perfect_Square;

class Solution {

	public boolean isPerfectSquare(int num) {

		int low = 1;
		int high = num;
		while (low <= high) {
			int mid = (high - low) / 2 + low;
			if ((double) num / mid == mid) {
				return true;
			} else if ((double) num / mid < mid) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}

}
