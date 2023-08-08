package accenture;

import java.util.Scanner;

public class question5 {
    public static int diffOfSum(int n, int m){
        int sum1 = 0;
        int sum2 = 0;
        int result = 0;

        for(int i = 1; i <= m; i++){
            if(i % n == 0){
                sum1 = sum1 + i;
            }
            else {
                sum2 += i;
            }
        }
        result = Math.abs(sum1 - sum2);
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int m = sc.nextInt ();
        System.out.println (diffOfSum (m, n));
    }
}
