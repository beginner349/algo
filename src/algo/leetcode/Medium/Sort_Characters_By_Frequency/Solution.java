package algo.leetcode.Medium.Sort_Characters_By_Frequency;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {

    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (map.containsKey(letter)) {
                map.put(letter, map.get(letter) + 1);
            } else {
                map.put(letter, 1);
            }
        }

        Queue<Character> queue = new PriorityQueue<>((s1, s2) -> map.get(s2) - map.get(s1));

        queue.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Character letter = queue.remove();
            int count = map.get(letter);
            for (int i = 0; i < count; i++) {
                sb.append(letter);
            }
        }
        return sb.toString();
    }

}
