package Lab;

import java.util.ArrayList;
import java.util.Scanner;

//public class ZeroOneKnapsack {
//    public int knapSack(int[] profits, int[] weights, int capacity) {
//        int n = profits.length;
//        int[][] dp = new int[n + 1][capacity + 1];
//
//        for (int i = 1; i <= n; i++) {
//            for (int w = 1; w <= capacity; w++) {
//                if (weights[i - 1] <= w) {
//                    dp[i][w] = Math.max(profits[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
//                } else {
//                    dp[i][w] = dp[i - 1][w];
//                }
//            }
//        }
//
//        return dp[n][capacity];
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of items: ");
//        int n = scanner.nextInt();
//
//        int[] profits = new int[n];
//        int[] weights = new int[n];
//
//        System.out.println("Enter profits for each item:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter profit " + (i + 1) + ": ");
//            profits[i] = scanner.nextInt();
//        }
//
//        System.out.println("Enter weights for each item:");
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter weight " + (i + 1) + ": ");
//            weights[i] = scanner.nextInt();
//        }
//
//        System.out.print("Enter the knapsack capacity: ");
//        int capacity = scanner.nextInt();
//
//        ZeroOneKnapsack knapsackSolver = new ZeroOneKnapsack();
//        int maxProfit = knapsackSolver.knapSack(profits, weights, capacity);
//
//        System.out.println("The maximum profit is: " + maxProfit);
//
//        scanner.close();
//    }
//}

import java.util.*;
public class ZeroOneKnapsack {
    public int knapSack(int[] profits, int[] weights, int capacity) {
        int n = profits.length;
        int[][] dp = new int[n + 1][capacity + 1];
        boolean[][] selected = new boolean[n + 1][capacity + 1]; // To keep track of selected items

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    int includeProfit = profits[i - 1] + dp[i - 1][w - weights[i - 1]];
                    int excludeProfit = dp[i - 1][w];

                    if (includeProfit > excludeProfit) {
                        dp[i][w] = includeProfit;
                        selected[i][w] = true; // Mark the item as selected
                    } else {
                        dp[i][w] = excludeProfit;
                    }
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // Find the selected items and their values
        int remainingCapacity = capacity;
        ArrayList<Integer> selectedItems = new ArrayList<>();
        for (int i = n; i > 0; i--) {
            if (selected[i][remainingCapacity]) {
                selectedItems.add(i - 1); // Adjust for 0-based indexing
                remainingCapacity -= weights[i - 1];
            }
        }

        // Print the selected items and their values
        System.out.println("Selected items:");
        for (int itemIdx : selectedItems) {
            System.out.println("Item " + itemIdx + ", Value: " + profits[itemIdx]);
        }

        return dp[n][capacity];
    }



    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of items: ");
            int n = scanner.nextInt();

            int[] profits = new int[n];
            int[] weights = new int[n];

            System.out.println("Enter the profits of the items:");
            for (int i = 0; i < n; i++) {
                profits[i] = scanner.nextInt();
            }

            System.out.println("Enter the weights of the items:");
            for (int i = 0; i < n; i++) {
                weights[i] = scanner.nextInt();
            }

            System.out.print("Enter the capacity of the knapsack: ");
            int capacity = scanner.nextInt();

            ZeroOneKnapsack knapsackSolver = new ZeroOneKnapsack();
            int maxProfit = knapsackSolver.knapSack(profits, weights, capacity);

            System.out.println("Maximum Profit: " + maxProfit);

            scanner.close();
    }


}

