package accenture;

import java.util.Scanner;

public class question9 {
    public static String moveHyphen(String str, int n){
        String result = "";

        for(int i = 0; i < n; i++){
            if(str.charAt(i) == '-'){
                result = str.charAt(i) + result;
            }
            else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next();

        System.out.println (moveHyphen (str, str.length ()));
    }
}
