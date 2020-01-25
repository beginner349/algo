package algo.leetcode.Medium.Search_in_Rotated_Sorted_Array;

class Solution {

	public int search(int[] nums, int target) {
		if (nums.length == 0) {
			return -1;
		}
		// find the pivot index
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
        	int mid = (right - left) / 2 + left;
        	if (nums[mid] > nums[right]) {
        		left = mid + 1; 
        	} else {
        		right = mid;
        	}
        }
        // left is the pivot index
        // find the boundary for the binary search 
        int start = 0;
        int end = nums.length - 1;
        if (target >= nums[left] && target <= nums[nums.length-1]) {
        	start = left;
        } else {
        	end = left - 1;
        }
        // binary search
        while (start <= end) {
        	int mid = (end - start) / 2 + start;
        	if (nums[mid] == target) {
        		return mid;
        	} else if (nums[mid] < target) {
        		start = mid + 1;
        	} else {
        		end = mid - 1;
        	}
        }
		return -1;
    }
}
