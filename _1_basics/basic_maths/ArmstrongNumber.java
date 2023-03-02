package _1_basics.basic_maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int x = 153;
        System.out.println(check_armstrong_number(x));

        int y = 1634;
        System.out.println(check_armstrong_number(y));

        int z = 123;
        System.out.println(check_armstrong_number(z));
    }

    static boolean check_armstrong_number(int n) {

        int digits = String.valueOf(n).length();

        int sum = 0;
        int rem;
        int temp = n;

        while(temp!=0) {
            rem = temp%10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        return sum == n;
    }
}

// https://takeuforward.org/maths/check-if-a-number-is-armstrong-number-or-not/