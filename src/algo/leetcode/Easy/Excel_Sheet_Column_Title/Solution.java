package algo.leetcode.Easy.Excel_Sheet_Column_Title;

class Solution {

	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			if (n % 26 == 0) {
				sb = sb.append("Z");
				n = n / 26 - 1;
			} else {
				sb = sb.append((char) (n % 26 - 1 + 65));
				n = n / 26;
			}
		}
		return sb.reverse().toString();
	}

}
