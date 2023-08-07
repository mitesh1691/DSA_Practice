package accenture;

import java.util.Scanner;

public class question3 {
    public static int passCheck(String s, int n){
        //valid = 1, invalid = 0

        // at least 4 char
        if(n < 4) {
            return 0;
        }
        // starting not number
        if(s.charAt(0) >= '0' && s.charAt(0) <= '9'){
            return 0;
        }

        int capitals = 0;
        int numbers = 0;
        for(int i = 0; i<n; i++){
            // at least one num
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                numbers++;
            }

            // one capital letter
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                capitals++;
            }

            // space or slash no
            if(s.charAt(i) == ' ' || s.charAt(i) == '/'){
                return 0;
            }
        }
        if(capitals > 0 && numbers > 0){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();

        System.out.println(passCheck(s, n));
    }
}
