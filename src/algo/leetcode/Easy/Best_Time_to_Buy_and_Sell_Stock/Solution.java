package algo.leetcode.Easy.Best_Time_to_Buy_and_Sell_Stock;

public class Solution {

    public int maxProfit(int[] prices) {
        int curMin = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < curMin) {
                curMin = price;
            } else {
                maxProfit = Math.max(maxProfit, price - curMin);
            }
        }
        return maxProfit;
    }
}
