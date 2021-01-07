package algo.leetcode.Medium.Odd_Even_Linked_List;

class Solution {

	public ListNode oddEvenList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode oddPointer = head;
		ListNode initialEven = head.next;
		ListNode evenPointer = initialEven;

		while (true) {
			if (oddPointer.next == null || evenPointer.next == null) {
				break;
			}
			oddPointer.next = oddPointer.next.next;
			oddPointer = oddPointer.next;
			evenPointer.next = evenPointer.next.next;
			evenPointer = evenPointer.next;
		}
		
		oddPointer.next = initialEven;
		return head;
	}
}
