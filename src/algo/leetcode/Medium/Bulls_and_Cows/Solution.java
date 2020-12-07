package algo.leetcode.Medium.Bulls_and_Cows;

class Solution {

	public String getHint(String secret, String guess) {
		int bulls = 0;
		int cows = 0;
		int[] secretArray = new int[10];
		int[] guessArray = new int[10];
		for (int i = 0; i < secret.length(); i++) {
			if (secret.charAt(i) == guess.charAt(i)) {
				bulls++;
			} else {
				int s = secret.charAt(i) - '0';
				int g = guess.charAt(i) - '0';
				secretArray[s] = secretArray[s] + 1;
				guessArray[g] = guessArray[g] + 1;
			}
		}
		for (int i = 0; i < guessArray.length; i++) {
			cows = cows + Math.min(guessArray[i], secretArray[i]);
		}
		return bulls + "A" + cows + "B";

	}

}
