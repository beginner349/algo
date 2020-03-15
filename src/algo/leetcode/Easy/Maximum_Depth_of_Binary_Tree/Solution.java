package algo.leetcode.Easy.Maximum_Depth_of_Binary_Tree;

class Solution {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}	
		return helper(root, 1);
	}

	private int helper(TreeNode root, int depth) {
		if (root.left == null && root.right == null) {
			return depth;
		} else if (root.left == null && root.right != null) {
			return helper(root.right, depth + 1);
		} else if (root.left != null && root.right == null) {
			return helper(root.left, depth + 1);
		} else {
			return Math.max(helper(root.left, depth + 1), helper(root.right, depth + 1));
		}
	}

}