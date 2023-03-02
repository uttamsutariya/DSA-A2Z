package _1_basics.basic_recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        print_fibonacci(10);
    }

    static void print_fibonacci(int n) {
        for(int i = 0 ; i<n ; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    static int fibonacci(int n) {
        if(n == 0 || n == 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
