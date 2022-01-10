package algo.leetcode.Medium._132_Pattern;

import java.util.Stack;

public class Solution {

    public boolean find132pattern(int[] nums) {
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < min.length; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (true) {
                if (stack.isEmpty() || nums[i] <= stack.peek()) {
                    stack.add(nums[i]);
                    break;
                } else {
                    int two = stack.pop();
                    if (two > min[i]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
