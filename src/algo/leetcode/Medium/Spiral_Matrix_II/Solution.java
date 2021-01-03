package algo.leetcode.Medium.Spiral_Matrix_II;

class Solution {

	public int[][] generateMatrix(int n) {

		int value = 1;
		int i = 0;
		int j = 0;
		int magnitude = n - 1;
		int[][] matrix = new int[n][n];

		while (value <= n * n) {
			for (int k = j; k <= j + magnitude; k++) {
				matrix[i][k] = value;
				value++;
			}
			for (int k = i + 1; k <= i + magnitude; k++) {
				matrix[k][j + magnitude] = value;
				value++;
			}
			for (int k = j + magnitude - 1; k >= j; k--) {
				matrix[i + magnitude][k] = value;
				value++;
			}
			for (int k = i + magnitude - 1; k > i; k--) {
				matrix[k][j] = value;
				value++;
			}
			magnitude = magnitude - 2;
			i++;
			j++;
		}

		return matrix;

	}

}
