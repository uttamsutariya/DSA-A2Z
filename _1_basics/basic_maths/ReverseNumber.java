package _1_basics.basic_maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse_number(x));
    }

    static int reverse_number(int n) {

        int ans = 0;

        int rem;

        while(n!=0) {
            rem = n%10;
            ans = 10 * ans + rem;
            n /= 10;
        }

        return ans;
    }
}

// https://takeuforward.org/c-programs/reverse-a-number-in-c/
