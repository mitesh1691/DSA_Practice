package _1_Recursion;

class _01_recursion_factorial {
    public int factorial(int n){
        if ( n == 0 || n == 1){
            return 1;
        }
        if ( n < 0 ){
            System.out.println("Factorial cannot be calculated for negative numbers");
            return n;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        _01_recursion_factorial recursion = new _01_recursion_factorial();
//        int fact = recursion.factorial(5);
        int fact = recursion.factorial(-1);
        int fact1 = recursion.factorial(5);
        System.out.println(fact);
        System.out.println(fact1);

    }
}
