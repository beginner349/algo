package algo.leetcode.Easy.Remove_Linked_List_Elements;

class Solution {
	
	public ListNode removeElements(ListNode head, int val) {
		ListNode temp = new ListNode(-500);
		ListNode cur = temp;
		while (head != null) {
			if (head.val != val) {
				cur.next = head;
				cur = cur.next;
			}
			head = head.next;
		}
		cur.next = null;
		return temp.next;
	}

}
