package algo.leetcode.Easy.Binary_Tree_Postorder_Traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result) {
        if (root != null) {
            helper(root.left, result);
            helper(root.right, result);
            result.add(root.val);
        }
    }
}
