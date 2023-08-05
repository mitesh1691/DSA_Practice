package _1_Recursion;

class powerOfNumber{
    public int power(int base, int exp){
        if( exp < 0){
            return -1;
        }
        if( exp == 0 ){
            return 1;
        }
        return base * power(base, exp-1);
    }
}

public class _04_recursion_questions_powerofnumber {
    public static void main(String[] args) {
        powerOfNumber obj = new powerOfNumber();
        int powero = obj.power(-2, 3);
        System.out.println(powero);
    }
}