package _1_Recursion;

class _02_recursion_fibonacci {
    public int fibonacci(int n){
        if ( n == 0 || n == 1){
            return n;
        }
        if ( n < 0 ){
            System.out.println("Fibonacci cannot be calculated for negative numbers");
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        _02_recursion_fibonacci recursion = new _02_recursion_fibonacci();
        int fib = recursion.fibonacci(4);
//        int fact = recursion.factorial(-1);
        System.out.println(fib);

    }
}
