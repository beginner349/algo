package algo.leetcode.Medium.Linked_List_Random_Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Solution {

	/**
	 * @param head The linked list's head. Note that the head is guaranteed to be
	 *             not null, so it contains at least one node.
	 */
	
	static List<Integer> list;
    Random r = new Random();
    
	public Solution(ListNode head) {
		list = new ArrayList<Integer>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
	}

	/** Returns a random node's value. */
	public int getRandom() {
		int index = r.nextInt(list.size());
		return list.get(index);
	}
	
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
