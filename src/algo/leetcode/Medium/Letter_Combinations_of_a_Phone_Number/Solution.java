package algo.leetcode.Medium.Letter_Combinations_of_a_Phone_Number;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public List<String> letterCombinations(String digits) {
		
		String[] digitStringMap = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		List<String> result = new ArrayList<String>();
		if (digits.length() == 0) {
    		return result;
    	}
		concatenate(digits, digitStringMap, 0, "", result);
		return result;
	}

	private void concatenate(String digits, String[] digitString, int index, String intermediateString, List<String> result) {
		if (intermediateString.length() == digits.length()) {
			result.add(intermediateString);
			return;
		}
		String stringChars = digitString[digits.charAt(index) - '0'];
		for (int i = 0; i < stringChars.length(); i++) {
			String tempString = intermediateString + stringChars.charAt(i);
			concatenate(digits, digitString, index+1, tempString, result);
		}
	}
}
