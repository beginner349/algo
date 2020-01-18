package algo.leetcode.Medium.Longest_Palindromic_Substring;

class Solution {

	public String longestPalindrome(String s) {
		if (s.length() <= 1) {
			return s;
		}
		int start = 0;
		int maxLength = 0;
		for (int i = 0; i < s.length(); i++) {
			// handle the case "..aba.."
			int center = expandCenter(s, i - 1, i + 1);
			// handle the case "..aa.."
			int gap = expandCenter(s, i, i + 1);
			if (center > maxLength && center > gap) {
				start = i - center / 2;
				maxLength = center;
			} else if (gap > maxLength && gap > center) {
				start = i - gap / 2 + 1;
				maxLength = gap;
			}
		}
		return s.substring(start, start + maxLength);
	}

	private int expandCenter(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left = left - 1;
			right = right + 1;
		}
		return right - left - 1;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String s = "neveroddoreven";
		System.out.println(solution.longestPalindrome(s));
	}

}
