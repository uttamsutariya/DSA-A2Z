package _7_recursion.basic;

public class PowOfXtoN {
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }

    public static double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n < 0) {
            n = -1*n;
            x = 1/x;
        }


        return (n%2 == 0) ? myPow(x*x, n/2) : x * myPow(x*x, n/2);
    }
}
