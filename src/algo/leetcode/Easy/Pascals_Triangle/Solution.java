package algo.leetcode.Easy.Pascals_Triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        int i = 0;
        while (i < numRows) {
            List<Integer> curRow = new ArrayList<>();
            // first row of the Pascal's triangle
            if (i == 0) {
                curRow.add(1);
            } else {
                List<Integer> prevRow = rows.get(i - 1);
                for (int j = 0; j <= prevRow.size(); j++) {
                    // the leftmost and rightmost number are always 1
                    if (j == 0 || j == prevRow.size()) {
                        curRow.add(1);
                    } else {
                        curRow.add(prevRow.get(j - 1) + prevRow.get(j));
                    }
                }
            }
            i++;
            rows.add(curRow);
        }
        return rows;
    }
}
