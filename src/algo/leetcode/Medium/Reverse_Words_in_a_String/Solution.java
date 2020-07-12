package algo.leetcode.Medium.Reverse_Words_in_a_String;

import java.util.ArrayList;
import java.util.List;

class Solution {

	public String reverseWords(String s) {
		String[] array = s.split(" ");
		List<String> list = new ArrayList<String>();
		for (int i = array.length - 1; i >= 0; i--) {
			if (!array[i].equals("")) {
				list.add(array[i]);
			}
		}
		return String.join(" ", list);
	}

}
