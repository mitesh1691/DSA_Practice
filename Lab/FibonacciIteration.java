package Lab;

import java.util.Scanner;

public class FibonacciIteration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < number; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }

        System.out.println("\nFibonacci value at " + number + ": " + a);
    }
}
