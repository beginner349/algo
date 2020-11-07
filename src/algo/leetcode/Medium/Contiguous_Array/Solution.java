package algo.leetcode.Medium.Contiguous_Array;

import java.util.HashMap;
import java.util.Map;

class Solution {

	public int findMaxLength(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int sum = 0;
		int maxLength = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				sum = sum + 1;
			} else {
				sum = sum - 1;
			}
			if (map.containsKey(sum)) {
				int tempLength = i - map.get(sum);
				if (tempLength > maxLength) {
					maxLength = tempLength;
				}
			} else {
				map.put(sum, i);
			}

		}
		return maxLength;
	}

}
