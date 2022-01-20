package algo.leetcode.Easy.Binary_Tree_Preorder_Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (true) {
			if (root != null) {
				result.add(root.val);
				stack.add(root.right);
				root = root.left;
			} else if (!stack.isEmpty()) {
				root = stack.pop();
			} else {
				break;
			}
		}
		return result;
		
	}
}
