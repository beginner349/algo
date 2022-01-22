package algo.leetcode.Easy.Path_Sum;

public class Solution {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, 0, targetSum);
    }

    private boolean helper(TreeNode root, int curSum, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return curSum + root.val == targetSum;
        }
        return helper(root.left, curSum + root.val, targetSum) ||
                helper(root.right, curSum + root.val, targetSum);
    }
}
