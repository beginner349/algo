package algo.leetcode.Easy.Remove_Duplicates_from_Sorted_List;

class Solution {

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode prev = head;
		ListNode cur = prev.next;
		while (cur != null) {
			if (prev.val != cur.val) {
				prev.next = cur;
				prev = prev.next;
			}
			cur = cur.next;
		}
		// handle the case ... -> 3 -> 3 -> 3, the prev pointer 
		// will be at the first 3 so prev.next = null
		prev.next = null;
		return head;
	}
}
