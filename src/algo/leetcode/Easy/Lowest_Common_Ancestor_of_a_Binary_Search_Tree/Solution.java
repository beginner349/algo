package algo.leetcode.Easy.Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (true) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                // two cases
                // 1. p is equal to root, q is left/right of root -> Common Ancestor == root
                // 2. p is left of root, q is right of root -> Common Ancestor == root
                return root;
            }
        }
    }
}
