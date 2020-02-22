package algo.leetcode.Medium.Binary_Tree_Inorder_Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
    	Stack<TreeNode> stack = new Stack<TreeNode>();
    	while (true) {
    		if (root != null) {
    			stack.push(root);
    			root = root.left;
    		} else if (stack.size() != 0) {
    			root = stack.pop();
    			result.add(root.val);
    			root = root.right;
    		} else {
    			break;
    		}
    	}
    	return result;
    }
    
}
