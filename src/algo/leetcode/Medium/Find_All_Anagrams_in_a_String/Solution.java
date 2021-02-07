package algo.leetcode.Medium.Find_All_Anagrams_in_a_String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<Integer>();
		if (s.length() < p.length()) {
			return result;
		}
		int[] sArray = new int[26];
		int[] pArray = new int[26];
		for (int i = 0; i < p.length(); i++) {
			sArray[s.charAt(i) - 'a']++;
			pArray[p.charAt(i) - 'a']++;
		}
		if (Arrays.equals(sArray, pArray)) {
			result.add(0);
		}
		for (int i = p.length(); i < s.length(); i++) {
			sArray[s.charAt(i) - 'a']++;
			sArray[s.charAt(i - p.length()) - 'a']--;
			if (Arrays.equals(sArray, pArray)) {
				result.add(i - p.length() + 1);
			}
		}

		return result;
	}

}
