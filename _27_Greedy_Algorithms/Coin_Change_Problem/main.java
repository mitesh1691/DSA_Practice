package _27_Greedy_Algorithms.Coin_Change_Problem;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 10, 1000};
        int[] coins1 = {1, 2, 5, 10, 20, 50, 1000};
        int amount = 2035;
        int amount1 = 3034;
        int amount2 = 3036;

        System.out.println("Problem 1");
        System.out.println("Coins Available: " + Arrays.toString(coins));
        System.out.println("Target amount: " + amount);
        CoinChangeProblem.coinChangeProblem(coins, amount);

        System.out.println("\n \nProblem 2");
        System.out.println("Coins Available: " + Arrays.toString(coins1));
        System.out.println("Target amount: " + amount1);
        CoinChangeProblem.coinChangeProblem(coins1, amount1);

        System.out.println("\n \nProblem 2");
        System.out.println("Coins Available: " + Arrays.toString(coins1));
        System.out.println("Target amount: " + amount2);
        CoinChangeProblem.coinChangeProblem(coins1, amount2);
    }
}
