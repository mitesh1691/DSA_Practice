package _1_Recursion;

class greatest_common_divisor{
    public int gcd(int a, int b){
        if ( b < 0 || a < 0){
            return -1;
        }
        if ( b == 0){
            return a;
        }

        return gcd(b, a%b);
    }
}

public class _05_recursion_questions_gcd {
    public static void main(String[] args) {
        greatest_common_divisor obj = new greatest_common_divisor();
        int result = obj.gcd(4, 8);
        System.out.println(result);
    }
}
