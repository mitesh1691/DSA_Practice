package accenture;

import java.util.Scanner;

public class question11 {
    public static String replaceChar(String str, char ch1, char ch2){
        String result = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch1){
                result = result + ch2;
            } else if (str.charAt(i) == ch2) {
                result = result + ch1;
            }
            else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String str = sc.next ();
        char ch1 = sc.next ().charAt (0);
        char ch2 = sc.next ().charAt (0);


        System.out.println(replaceChar (str, ch1, ch2));
    }
}
