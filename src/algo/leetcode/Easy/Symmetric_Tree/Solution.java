package algo.leetcode.Easy.Symmetric_Tree;

class Solution {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return helper(root.left, root.right);
	}

	private boolean helper(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		} else if ((root1 == null && root2 != null) || (root1 != null && root2 == null)) {
			return false;
		} else {
			return (root1.val == root2.val && helper(root1.left, root2.right) && helper(root1.right, root2.left));
		}
	}
	
}
