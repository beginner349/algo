package algo.leetcode.Medium.Longest_Substring_Without_Repeating_Characters;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        int index = 0;
        int longestLength = 0;
        for (int j = 0; j < s.length(); j++) {
        	char curChar = s.charAt(j);
			if (charMap.containsKey(curChar)) {
				int curIndex = charMap.get(curChar) + 1;
				// handle some special case eg "abba"
				if (curIndex > index) {
					index = curIndex;
				}
			} 
			charMap.put(curChar, j);	
			int curLength = j - index + 1;
			if (curLength > longestLength) {
				longestLength = curLength;
			}
		}
    	return longestLength;
    }
}