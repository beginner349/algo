package algo.leetcode.Medium.Permutations;

import java.util.ArrayList;
import java.util.List;


class Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (nums.length == 0) {
			return result;
		}
		// convert the int[] to List<Integer> 
		List<Integer> numsList = new ArrayList<Integer>(nums.length);
		for (int i : nums) {
			numsList.add(i);
		}
		List<Integer> tempList = new ArrayList<Integer>();
		helper(numsList, tempList, result);
		return result;
	}
	
	private void helper(List<Integer> numsList, List<Integer> tempList, List<List<Integer>> result) {
		if (numsList.size() == 0) {
			result.add(tempList);
			return;
		}                                                
		for (int i = 0; i < numsList.size(); i++) {
			List<Integer> numsListCopy = new ArrayList<Integer>(numsList);
			List<Integer> tempListCopy = new ArrayList<Integer>(tempList);
			tempListCopy.add(numsListCopy.remove(i));
			helper(numsListCopy, tempListCopy, result);
		}
	}
}
