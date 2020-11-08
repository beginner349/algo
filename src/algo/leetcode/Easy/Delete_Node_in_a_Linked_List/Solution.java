package algo.leetcode.Easy.Delete_Node_in_a_Linked_List;

class Solution {
	
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
	
}
