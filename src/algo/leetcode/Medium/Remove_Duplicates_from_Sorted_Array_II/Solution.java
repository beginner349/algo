package algo.leetcode.Medium.Remove_Duplicates_from_Sorted_Array_II;

class Solution {

	public int removeDuplicates(int[] nums) {
		int count = 1;
		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				count++;
			} else {
				count = 1;
			}
			nums[index] = nums[i];
			if (count <= 2) {
				index++;
			}
		}

		return index;

	}

}
