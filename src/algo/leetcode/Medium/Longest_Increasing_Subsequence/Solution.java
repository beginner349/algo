package algo.leetcode.Medium.Longest_Increasing_Subsequence;

class Solution {

	public int lengthOfLIS(int[] nums) {

		int[] subLengths = new int[nums.length];
		for (int i = 0; i < subLengths.length; i++) {
			subLengths[i] = 1;
		}
		int max = 1;
		for (int i = 0; i < nums.length; i++) {
			int subMax = subLengths[i];
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					int tempMax = subLengths[j] + 1;
					if (tempMax > subMax) {
						subMax = tempMax;
					}
				}
			}
			subLengths[i] = subMax;
			if (subLengths[i] > max) {
				max = subLengths[i];
			}
		}
		return max;
	}

}
