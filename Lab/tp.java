package Lab;

public class tp {
    static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    // Driver Code
    public static void main(String args[])
    {
        // Given Number N
        int N = 10;

        // Print the first N numbers
        System.out.println(fib(10));
    }

}
