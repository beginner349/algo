package algo.leetcode.Medium.Validate_Binary_Search_Tree;


class Solution {
    public boolean isValidBST(TreeNode root) {
    	// long type to handle Integer.MAX_VALUE and Integer.MIN_VALUE corner cases
        long initialMin = Long.MIN_VALUE;
        long initialMax = Long.MAX_VALUE;
        if (root == null) {
        	return true;
        }
    	return helper(root, initialMin, initialMax);
    }

	private boolean helper(TreeNode root, long initialMin, long initialMax) {
		if (root == null) {
			return true;
		} else if (root.val <= initialMin || root.val >= initialMax) {
			return false;
		} else {
			return helper(root.left, initialMin, root.val) 
					&& helper(root.right, root.val, initialMax);
		}
	}
	
}