package _27_Greedy_Algorithms.Coin_Change_Problem;

import java.util.Arrays;

public class CoinChangeProblem {
    public static void coinChangeProblem(int[] coins, int amount) {
        // sort the array
        Arrays.sort(coins);

        // find largest coin Index
        int largestCoinIndex = coins.length - 1;

        int counter = 0;

        while (true) {
            int largestCoinValue = coins[largestCoinIndex];
            largestCoinIndex--;

            // the max amount that can be covered with the current largest coin
            int maxAmount = (amount / largestCoinValue) * largestCoinValue;
            // for ex: (2500 / 1000) * 1000 = 2 * 1000 = 2000

            if (maxAmount > 0) {
                System.out.println("Coin value: " + largestCoinValue + " taken count: " + (amount / largestCoinValue));
                counter = counter +  (amount / largestCoinValue);
                amount = amount - maxAmount;
            }
            if(amount == 0){
                System.out.println("Total coins required: " + counter);
                break;
            }
        }
    }
}
