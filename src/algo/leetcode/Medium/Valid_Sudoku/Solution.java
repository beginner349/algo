package algo.leetcode.Medium.Valid_Sudoku;

public class Solution {

    public boolean isValidSudoku(char[][] board) {
        // check all rows
        for (int i = 0; i < board.length; i++) {
            int[] row = new int[9];
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    int curDigit = board[i][j] - '1';
                    if (row[curDigit] != 0) {
                        return false;
                    }
                    row[curDigit]++;
                }
            }
        }

        // check all columns
        for (int j = 0; j < board[0].length; j++) {
            int[] column = new int[9];
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] != '.') {
                    int curDigit = board[i][j] - '1';
                    if (column[curDigit] != 0) {
                        return false;
                    }
                    column[curDigit]++;
                }
            }
        }

        // check sub-boxes
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                int row = x * 3;
                int column = y * 3;
                int[] boxes = new int[9];
                for (int i = row; i < row + 3; i++) {
                    for (int j = column; j < column + 3; j++) {
                        if (board[i][j] != '.') {
                            int curDigit = board[i][j] - '1';
                            if (boxes[curDigit] != 0) {
                                return false;
                            }
                            boxes[curDigit]++;
                        }
                    }
                }
            }
        }
        return true;
    }
}
