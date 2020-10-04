package algo.leetcode.Medium.Kth_Smallest_Element_in_a_BST;

import java.util.Stack;

class Solution {

	public int kthSmallest(TreeNode root, int k) {
		int count = 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (true) {
			if (root != null) {
				stack.add(root);
				root = root.left;
			} else if (!stack.isEmpty()) {
				root = stack.pop();
				// count refer to the element visited, starting from the smallest
				count = count + 1;
				if (count == k) {
					return root.val;
				}
				root = root.right;
			} else {
				break;
			}
		}
		return -1;
	}

}
