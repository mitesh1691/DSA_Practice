package accenture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class question6 {
    public static int largeSmallSum(int[] arr, int n){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        int sum = 0;
        if(arr == null){
            return 0;
        }
        if(n <= 3){
            return 0;
        }
        even.add(arr[0]);

        for(int i = 1; i < arr.length; i++){
            if(i % 2 == 0){
                even.add(arr[i]);
            }
            else {
                odd.add(arr[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        sum = even.get(even.size() - 2) + odd.get(1);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();

        System.out.println (largeSmallSum (arr, n));
    }
}
