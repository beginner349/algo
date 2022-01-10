package algo.leetcode.Easy.Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> elements = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (elements.contains(nums[i])) {
                return true;
            }
            elements.add(nums[i]);
        }
        return false;
    }
}
