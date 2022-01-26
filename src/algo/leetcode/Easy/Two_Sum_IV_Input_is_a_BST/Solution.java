package algo.leetcode.Easy.Two_Sum_IV_Input_is_a_BST;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean findTarget(TreeNode root, int k) {
        return helper(root, k, new HashSet<>());
    }

    private boolean helper(TreeNode root, int k, Set<Integer> set) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return helper(root.left, k, set) || helper(root.right, k, set);
    }
}
