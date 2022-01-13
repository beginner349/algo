package algo.leetcode.Easy.Intersection_of_Two_Arrays_II;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> intersections = new ArrayList<>();
        int[] array1 = new int[1001];
        for (int i = 0; i < nums1.length; i++) {
            array1[nums1[i]]++;
        }
        for (int i = 0; i < nums2.length; i++) {
            if (array1[nums2[i]] > 0) {
                intersections.add(nums2[i]);
                array1[nums2[i]]--;
            }
        }
        return intersections.stream().mapToInt(i -> i).toArray();
    }
}
