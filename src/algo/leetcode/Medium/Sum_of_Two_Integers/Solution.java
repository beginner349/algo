package algo.leetcode.Medium.Sum_of_Two_Integers;

class Solution {

	public int getSum(int a, int b) {
		while (true) {
			int value = a ^ b;
			b = (a & b) << 1;
			a = value;
			if (b == 0) {
				break;
			}
		}
		return a;
	}

}
