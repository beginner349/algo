package algo.leetcode.Easy.Two_Sum;

import java.util.HashMap;
import java.util.Map;

class Solution {

	public int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		Map<Integer, Integer> valuesMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (valuesMap.containsKey(complement)) {
				indices[0] = valuesMap.get(complement);
				indices[1] = i;
				break;
 			} else {
 				valuesMap.put(nums[i], i);
 			}
		}
		return indices;
	}
}
