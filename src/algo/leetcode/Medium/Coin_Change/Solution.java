package algo.leetcode.Medium.Coin_Change;

class Solution {

	public int coinChange(int[] coins, int amount) {
		int[] numberOfCoins = new int[amount + 1];
		numberOfCoins[0] = 0;
		for (int i = 1; i < amount + 1; i++) {
			int initialCoins = Integer.MAX_VALUE;
			for (int j = 0; j < coins.length; j++) {
				if (i >= coins[j] && 
						numberOfCoins[i - coins[j]] != -1) {
					int currentCoins = numberOfCoins[i - coins[j]] + 1;
					if (currentCoins < initialCoins) {
						initialCoins = currentCoins;
					}
				}
			}
			if (initialCoins == Integer.MAX_VALUE) {
				initialCoins = -1;
			}
			numberOfCoins[i] = initialCoins;
		}

		return numberOfCoins[amount];
	}

}
