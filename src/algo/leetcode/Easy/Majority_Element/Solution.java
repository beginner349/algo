package algo.leetcode.Easy.Majority_Element;

import java.util.HashMap;
import java.util.Map;

class Solution {

	public int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int majority = nums.length / 2;
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
			if (map.get(nums[i]) > majority) {
				return nums[i];
			}
		}
		return -1;
	}

}
