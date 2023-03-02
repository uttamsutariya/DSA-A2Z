package _1_basics.basic_maths;

public class CountDigits {

    public static void main(String[] args) {
        int x = 123456;

        System.out.println(count_digits_1(x));
        System.out.println(count_digits_2(x));
        System.out.println(count_digits_3(x));

    }

    // basic
    static int count_digits_1(int num) {

        int count = 0;

        while(num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }

    // Convert the integer into a string.
    // Find the length of the string
    static int count_digits_2(int num) {

        int digits = String.valueOf(num).length();

        return digits;
    }

    // Use logarithm base 10 to count the number of digits.
    // As the number of digits in an integer = the upper bound of log10(n).
    static int count_digits_3(int num) {

        int digits = (int)Math.floor(Math.log10(num) + 1);

        return digits;

    }

}
// https://takeuforward.org/data-structure/count-digits-in-a-number/