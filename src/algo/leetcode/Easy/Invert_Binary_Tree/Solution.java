package algo.leetcode.Easy.Invert_Binary_Tree;

public class Solution {

    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }

    private TreeNode helper(TreeNode root) {
        if (root != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            helper(root.left);
            helper(root.right);
        }
        return root;
    }
}
