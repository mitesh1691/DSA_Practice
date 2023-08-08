package accenture;

import java.util.ArrayList;
import java.util.Scanner;

public class question10 {
    public static int numberOfCarries(int num1, int num2){
        int carryValue = 0;
        int carryCount = 0;

        while(num1 > 0 || num2 > 0){
            int lastDigit1 = num1 % 10;
            int lastDigit2 = num2 % 10;

            int sum = lastDigit1 + lastDigit2 + carryValue;

            if(sum >= 10){
                carryValue = 1;
                carryCount++;
            }
            else {
                carryValue = 0;
            }

            num1 = num1 / 10;
            num2 = num2 / 10;
        }

        return carryCount;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt ();
        int num2 = sc.nextInt ();
        System.out.println (numberOfCarries (num1, num2));
    }
}
