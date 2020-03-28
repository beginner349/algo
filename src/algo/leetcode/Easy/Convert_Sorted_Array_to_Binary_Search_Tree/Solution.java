package algo.leetcode.Easy.Convert_Sorted_Array_to_Binary_Search_Tree;


class Solution {
	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		int start = 0;
		int end = nums.length - 1;
		return helper(start, end, nums);
	}

	private TreeNode helper(int start, int end, int[] nums) {
		if (start > end) {
			return null;
		}
		int mid = (end - start) / 2 + start;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = helper(start, mid - 1, nums);
		root.right = helper(mid + 1, end, nums);
		return root;
	}

}
