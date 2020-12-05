package algo.leetcode.Easy.Move_Zeroes;

class Solution {

	public void moveZeroes(int[] nums) {
		int zeroIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[zeroIndex];
				nums[zeroIndex] = nums[i];
				nums[i] = temp;
				zeroIndex++;
			}
		}
	}
}
