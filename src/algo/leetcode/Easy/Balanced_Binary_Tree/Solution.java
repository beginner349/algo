package algo.leetcode.Easy.Balanced_Binary_Tree;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public boolean isBalanced(TreeNode root) {
		
		List<Boolean> list = new ArrayList<Boolean>();
		helper(root, list);
		
		if (list.size() == 0) {
			return true;
		}
		return false;
	}

	private int helper(TreeNode root, List<Boolean> list) {
		int height = 0;
		int height2 = 0;
		if (root == null) {
			return -1;
		} else if (root.left != null && root.right == null) {
			height = 1 + helper(root.left, list);
		} else if (root.left == null && root.right != null) {
			height2 = 1 + helper(root.right, list);
		} else {
			height = 1 + helper(root.left, list);
			height2 = 1 + helper(root.right, list);
		}
		
		if (Math.abs(height - height2) > 1) {
			list.add(false);
		}
		return Math.max(height, height2);
	}
	
}
