package algo.leetcode.Easy.Reshape_the_Matrix;

public class Solution {
    
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int matRow = mat.length;
        int matColumn = mat[0].length;
        if (matRow * matColumn != r * c) {
            return mat;
        }
        int[][] reshaped = new int[r][c];
        int row = 0;
        int column = 0;
        for (int i = 0; i < matRow; i++) {
            for (int j = 0; j < matColumn; j++) {
                if (column > c - 1) {
                    column = 0;
                    row++;
                }
                reshaped[row][column] = mat[i][j];
                column++;
            }
        }
        return reshaped;
    }
}
