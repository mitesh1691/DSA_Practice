package accenture;

import java.util.Scanner;

public class question12 {
    public static int operationChoices (int c, int a, int b){
        int result = 0;
        if(c == 1){
            result = a + b;
        } else if (c == 2) {
            result = a - b;
        }
        else if (c == 3) {
            result = a * b;
        }
        else {
            result = a / b;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int c = sc.nextInt ();
        int a = sc.nextInt ();
        int b = sc.nextInt ();

        System.out.println (operationChoices (c, a, b));
    }
}
