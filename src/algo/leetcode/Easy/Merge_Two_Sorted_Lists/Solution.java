package algo.leetcode.Easy.Merge_Two_Sorted_Lists;


class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(-1);
        ListNode cur = temp;
        while (l1 != null && l2 != null) {
        	if (l1.val <= l2.val) {
        		cur.next = l1;
        		l1 = l1.next;
        	} else {
        		cur.next = l2;
        		l2 = l2.next;
        	}
        	cur = cur.next;
        }
        // if l1 is not empty, append l1 to the end
        if (l1 != null) {
        	cur.next = l1;
        } 
        // else it means l2 is not empty, append l2 to the end
        if (l2 != null) {
        	cur.next = l2;
        }
        return temp.next;
    }
}