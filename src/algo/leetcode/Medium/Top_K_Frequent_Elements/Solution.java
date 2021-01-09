package algo.leetcode.Medium.Top_K_Frequent_Elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {

	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> elementsToCounts = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int element = nums[i];
			if (elementsToCounts.containsKey(element)) {
				elementsToCounts.put(element, elementsToCounts.get(element) + 1);
			} else {
				elementsToCounts.put(element, 1);
			}
		}

		Queue<Integer> queue = new PriorityQueue<Integer>((x1, x2) -> {
			return elementsToCounts.get(x2) - elementsToCounts.get(x1);
		});

		elementsToCounts.forEach((key, value) -> {
			queue.add(key);
		});

		int[] result = new int[k];
		for (int i = 0; i < result.length; i++) {
			result[i] = queue.remove();
		}

		return result;
	}

}
