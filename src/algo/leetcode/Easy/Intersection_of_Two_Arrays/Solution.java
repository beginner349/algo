package algo.leetcode.Easy.Intersection_of_Two_Arrays;

import java.util.HashSet;
import java.util.Set;

class Solution {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < nums1.length; i++) {
			set1.add(nums1[i]);
		}

		Set<Integer> intersection = new HashSet<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			if (set1.contains(nums2[i])) {
				intersection.add(nums2[i]);
			}
		}

		return intersection.stream().mapToInt(Integer::intValue).toArray();

	}

}
