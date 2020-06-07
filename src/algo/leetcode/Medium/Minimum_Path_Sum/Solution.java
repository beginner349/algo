package algo.leetcode.Medium.Minimum_Path_Sum;

class Solution {

	public int minPathSum(int[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		int rows = grid.length;
		int columns = grid[0].length;

		int[][] pathSum = new int[rows][columns];
		pathSum[0][0] = grid[0][0];
		for (int i = 1; i < columns; i++) {
			pathSum[0][i] = grid[0][i] + pathSum[0][i - 1];
		}
		for (int i = 1; i < rows; i++) {
			pathSum[i][0] = grid[i][0] + pathSum[i - 1][0];
		}
		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < columns; j++) {
				pathSum[i][j] = Math.min(pathSum[i][j - 1], pathSum[i - 1][j]) + grid[i][j];
			}
		}
		return pathSum[rows - 1][columns - 1];
	}

}
