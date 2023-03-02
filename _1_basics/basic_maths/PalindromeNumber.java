package _1_basics.basic_maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(check_palindrome(x));

        int y = 123321;
        System.out.println(check_palindrome(y));
    }

    static boolean check_palindrome(int n) {
        return reverse_number(n) == n;
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

// https://takeuforward.org/data-structure/check-if-a-number-is-palindrome-or-not/
