package algo.leetcode.Medium.Add_Two_Numbers;


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-100);
		int carry = 0;
		ListNode cur = temp;
		while (l1 != null || l2 != null) {
			int val = 0;
			if (l1 == null) {
				val = l2.val + carry;
				l2 = l2.next;
			} else if (l2 == null) {
				val = l1.val + carry;
				l1 = l1.next;
			} else {
				val = l1.val + l2.val + carry;
				l1 = l1.next;
				l2 = l2.next;
			}
			carry = val / 10;
			cur.next = new ListNode(val % 10);
			cur = cur.next;
		}
		if (carry == 1) {
			cur.next = new ListNode(carry);
		}
		return temp.next;
    }
}