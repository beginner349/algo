package algo.leetcode.Medium.Ugly_Number_II;

class Solution {

	public int nthUglyNumber(int n) {
		int[] uglyNumbers = new int[n];
		uglyNumbers[0] = 1;
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		for (int i = 1; i < n; i++) {
			int multipleOf2 = uglyNumbers[i2] * 2;
			int multipleOf3 = uglyNumbers[i3] * 3;
			int multipleOf5 = uglyNumbers[i5] * 5;
			int uglyNumber = Math.min(Math.min(multipleOf2, multipleOf3), multipleOf5);
			if (uglyNumber == multipleOf2) {
				i2++;
			}
			if (uglyNumber == multipleOf3) {
				i3++;
			}
			if (uglyNumber == multipleOf5) {
				i5++;
			}
			uglyNumbers[i] = uglyNumber;
		}
		return uglyNumbers[n - 1];
	}

}
