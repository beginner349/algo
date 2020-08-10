package algo.leetcode.Medium.Number_of_Islands;

import java.util.LinkedList;
import java.util.Queue;

class Solution {

	private static int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	
	public int numIslands(char[][] grid) {
		// breadth first search solution
		int islands = 0;
		if (grid.length == 0) {
			return islands;
		}
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1' && visited[i][j] == false) {
					Queue<int[]> queue = new LinkedList<int[]>();
					int[] coordinate = {i, j};
					queue.add(coordinate);
					bfs(grid, queue, visited);
					visited[i][j] = true;
					islands++;
				}
			}
		}
		return islands;
		
	}
	
	private void bfs(char[][] grid, Queue<int[]> queue, boolean[][] visited) {
		while (!queue.isEmpty()) {
			int curSize = queue.size();
			for (int k = 0; k < curSize; k++) {
				int[] coordinate = queue.remove();
				for (int m = 0; m < directions.length; m++) {
					int i = coordinate[0] + directions[m][0];
					int j = coordinate[1] + directions[m][1];
					if (i >= 0 && i < grid.length && 
						j >= 0 && j < grid[0].length && 
						grid[i][j] == '1' && visited[i][j] == false) {
						int[] temp = {i, j};
						queue.add(temp);
						visited[i][j] = true;
					}
				}
			}
		}
	}

}
