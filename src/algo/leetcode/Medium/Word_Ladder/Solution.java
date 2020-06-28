package algo.leetcode.Medium.Word_Ladder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Solution {

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> wordSet = new HashSet<String>(wordList);
		if (!wordSet.contains(endWord)) {
			return 0;
		}
		Set<String> usedWords = new HashSet<String>();
		usedWords.add(beginWord);
		Queue<String> queue = new LinkedList<String>();
		queue.add(beginWord);
		int sequence = 1;
		while (!queue.isEmpty()) {
			int queueLength = queue.size();
			for (int i = 0; i < queueLength; i++) {
				String curWord = queue.remove();
				if (curWord.equals(endWord)) {
					return sequence;
				}
				for (int j = 0; j < curWord.length(); j++) {
					char[] charArray = curWord.toCharArray();
					for (char c = 'a'; c <= 'z'; c++) {
						charArray[j] = c;
						String diff_by_1_letter_word = new String(charArray);
						if (wordSet.contains(diff_by_1_letter_word) && !usedWords.contains(diff_by_1_letter_word)) {
							queue.add(diff_by_1_letter_word);
							usedWords.add(diff_by_1_letter_word);
						}
					}
				}

			}
			sequence++;
		}
		if (!usedWords.contains(endWord)) {
			return 0;
		}
		return sequence;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String beginWord = "hot";
		String endWord = "dog";
		List<String> wordList = new ArrayList<String>(Arrays.asList("hot", "dog"));
		System.out.println(solution.ladderLength(beginWord, endWord, wordList));
	}

}
