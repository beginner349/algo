package algo.leetcode.Easy.First_Unique_Character_in_a_String;

class Solution {

	public int firstUniqChar(String s) {
		int[] indexArray = new int[26];
		for (int i = 0; i < indexArray.length; i++) {
			indexArray[i] = -1;
		}
		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			if (indexArray[index] == -1) {
				indexArray[index] = i;
			} else {
				indexArray[index] = -2;
			}
		}
		int smallestIndex = Integer.MAX_VALUE;
		for (int i = 0; i < indexArray.length; i++) {
			if (indexArray[i] >= 0 && indexArray[i] < smallestIndex) {
				smallestIndex = indexArray[i];
			}
		}
		if (smallestIndex == Integer.MAX_VALUE) {
			return -1;
		} else {
			return smallestIndex;
		}

	}

}
