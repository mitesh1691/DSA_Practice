package _1_Recursion;

class sum{
    public int sumOfDigits(int n){
        if ( n == 0  || n<0){
            return 0;
        }
        return n%10 + sumOfDigits(n/10);
    }
}

public class _03_recursion_questions_sumofdigits {
    public static void main(String[] args) {
        sum obj = new sum();
        int sumo = obj.sumOfDigits(80);
        System.out.println(sumo);
    }
}
