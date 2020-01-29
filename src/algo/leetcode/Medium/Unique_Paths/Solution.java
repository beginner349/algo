package algo.leetcode.Medium.Unique_Paths;

class Solution {

	public int uniquePaths(int m, int n) {
		int [][] pathArray = new int[n][m];
		// populate the first row to 1 
		for (int i = 0; i < m; i++) {
			pathArray[0][i] = 1;
		}
		// populate the first column to 1
		for (int i = 0; i < n; i++) {
			pathArray[i][0] = 1;
		}
		for (int row = 1; row < pathArray.length; row++) {
			for (int col = 1; col < pathArray[row].length; col++) {
				pathArray[row][col] = pathArray[row][col-1] + pathArray[row-1][col];
			}
		}
		return pathArray[n-1][m-1];
	}
}
