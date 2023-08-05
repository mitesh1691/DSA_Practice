package _1_Recursion;

class decimalToBinary{
    public int dectobin(int n){
        if ( n == 0){
            return 0;
        }
        return n%2 + 10* dectobin(n/2);
    }
}

public class _06_recursion_questions_dectobin {
    public static void main(String[] args) {
        decimalToBinary obj = new decimalToBinary();
        int result = obj.dectobin(10);
        System.out.println(result);
    }
}
