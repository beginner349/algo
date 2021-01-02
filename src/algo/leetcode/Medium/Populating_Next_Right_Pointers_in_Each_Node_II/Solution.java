package algo.leetcode.Medium.Populating_Next_Right_Pointers_in_Each_Node_II;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public Node connect(Node root) {
		if (root == null) {
			return root;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int length = queue.size();
			Node nextNode = null;
			for (int i = 0; i < length; i++) {
				Node cur = queue.remove();
				if (cur.right != null) {
					queue.add(cur.right);
				}
				if (cur.left != null) {
					queue.add(cur.left);
				}
				cur.next = nextNode;
				nextNode = cur;
			}
		}

		return root;
	}
}
