package algo.leetcode.Medium.Group_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {
	
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (int i = 0; i < strs.length; i++) {
			// sort the string 
			char tempArray[] = strs[i].toCharArray();
			Arrays.sort(tempArray);
			String string = new String(tempArray);
			// use the sorted string as keys
			if (!map.containsKey(string)) {
				map.put(string, new ArrayList<String>());
			}
			map.get(string).add(strs[i]);
		}
		for (String string : map.keySet()) {
			result.add(map.get(string));
		}
		return result;
	}
	
}
