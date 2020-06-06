package algo.leetcode.Easy.Maximum_Subarray;


class Solution {

	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int[] curLargestSum = new int[nums.length];
		curLargestSum[0] = nums[0];
		for (int i = 1; i < curLargestSum.length; i++) {
			curLargestSum[i] = Math.max(nums[i], curLargestSum[i-1] + nums[i]);
			if (curLargestSum[i] > max) {
				max = curLargestSum[i];
			}
		}
		return max;
	}

}
