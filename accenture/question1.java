package accenture;

import java.util.Scanner;

public class question1 {
    public static int ratcount(int r, int unit, int n, int[] arr){
        if(arr == null){
            return -1;
        }
        int totalFood = r * unit;
        int sum = 0;
        int count = 0;
        for(int i = 0; i<n; i++){
            sum = sum + arr[i];
            count++;
            if(sum >= totalFood){
                break;
            }
        }
        if(sum < totalFood){
            return 0;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(ratcount(r, unit, n, arr));
    }
}
