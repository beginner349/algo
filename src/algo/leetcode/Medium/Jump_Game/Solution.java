package algo.leetcode.Medium.Jump_Game;


class Solution {

	public boolean canJump(int[] nums) {
		if (nums.length == 0 || nums.length == 1) {
			return true;
		}
		int curJump = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if (curJump < i) {
				return false;
			}
			curJump = Math.max(curJump, i+nums[i]);
		}
		if (curJump >= nums.length-1) {
			return true;
		}
		return false;
	}
	
}
