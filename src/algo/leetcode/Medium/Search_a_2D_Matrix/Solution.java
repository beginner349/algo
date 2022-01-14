package algo.leetcode.Medium.Search_a_2D_Matrix;

public class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        // get the index of the row if exist
        int start_i = 0;
        int end_i = matrix.length - 1;
        while (start_i <= end_i) {
            int mid = (end_i - start_i) / 2 + start_i;
            if (matrix[mid][0] > target) {
                end_i = mid - 1;
            } else {
                start_i = mid + 1;
            }
        }
        int index_i = start_i - 1;
        if (index_i < 0) {
            return false;
        }

        // search for the number
        int start_j = 0;
        int end_j = matrix[0].length - 1;
        while (start_j <= end_j) {
            int mid = (end_j - start_j) / 2 + start_j;
            if (matrix[index_i][mid] == target) {
                return true;
            } else if (matrix[index_i][mid] > target) {
                end_j = mid - 1;
            } else {
                start_j = mid + 1;
            }
        }
        return false;
    }
}
