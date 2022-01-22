package algo.leetcode.Medium.Insert_into_a_Binary_Search_Tree;

public class Solution {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        helper(root, val);
        return root;
    }

    private void helper(TreeNode root, int val) {
        if (val > root.val) {
            if (root.right == null) {
                root.right = new TreeNode(val);
            } else {
                helper(root.right, val);
            }
        } else {
            if (root.left == null) {
                root.left = new TreeNode(val);
            } else {
                helper(root.left, val);
            }
        }
    }
}
