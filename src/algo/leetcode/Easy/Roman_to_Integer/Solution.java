package algo.leetcode.Easy.Roman_to_Integer;

class Solution {
    public int romanToInt(String s) {
    	int result = 0;
        for (int i = 0; i < s.length(); i++) {
			int val = value(s.charAt(i));
			// handle "IV", "IX", "XL', "XC", "CD", "CM"
			if (i + 1 < s.length() && val < value(s.charAt(i+1))) {
				result = result - val;
			} else {
				result = result + val;
			}
		}
    	return result;
    }
    
    private int value(char c) {
    	if (c == 'I') {
    		return 1;
    	} else if (c == 'V') {
    		return 5;
    	} else if (c == 'X') {
    		return 10;
    	} else if (c == 'L') {
    		return 50;
    	} else if (c == 'C') {
    		return 100;
    	} else if (c == 'D') {
    		return 500;
    	} else {
    		return 1000;
    	}
    }
}
