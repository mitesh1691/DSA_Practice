package accenture;

import java.util.Arrays;
import java.util.Scanner;


public class question7 {
    public static int productSmallestPair(int sum, int n, int[] arr){
        if(arr == null || n < 2){
            return -1;
        }
        Arrays.sort(arr);
        if( arr[0] + arr[1] <= sum){
            return arr[0] * arr[1];
        }
        else {
            return -1;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int sum = sc.nextInt ();
        int n = sc.nextInt ();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();
        System.out.println (productSmallestPair (sum, n, arr));
    }
    }

