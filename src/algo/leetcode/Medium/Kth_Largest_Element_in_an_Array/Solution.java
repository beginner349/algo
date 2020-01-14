package algo.leetcode.Medium.Kth_Largest_Element_in_an_Array;

import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    
	public int findKthLargest(int[] nums, int k) {
        Queue<Integer> pq = new PriorityQueue<Integer>();
        for (int i : nums) {
			if (pq.size() < k) {
				pq.add(i);
			} else {
				if (pq.peek() < i) {
					pq.remove();
					pq.add(i);
				}
			}
		}
    	return pq.peek();
    }
}
