package algo.leetcode.Easy.Ransom_Note;

class Solution {

	public boolean canConstruct(String ransomNote, String magazine) {
		int[] countArray = new int[26];
		for (int i = 0; i < ransomNote.length(); i++) {
			int index = ransomNote.charAt(i) - 'a';
			countArray[index] = countArray[index] + 1;
		}
		for (int i = 0; i < magazine.length(); i++) {
			int index = magazine.charAt(i) - 'a';
			countArray[index] = countArray[index] - 1;
		}
		for (int i = 0; i < countArray.length; i++) {
			if (countArray[i] > 0) {
				return false;
			}
		}
		return true;
	}

}
