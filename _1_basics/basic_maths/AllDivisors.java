package _1_basics.basic_maths;

public class AllDivisors {
    public static void main(String[] args) {
        int x = 45;
        print_all_divisors_1(x);
        print_all_divisors_2(x);
    }

    static void print_all_divisors_1(int n) {
        for(int i = 1 ; i<=n ; i++) {
            if(n%i == 0) {
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }

    static void print_all_divisors_2(int n) {
        for (int i = 1; i < (int)Math.sqrt(n); i++) {
            if(n%i == 0) {
                System.out.print(i+ ", ");
                if(i != n/i) System.out.print(n/i + ", ");
            }
        }
        System.out.println();
    }
}

// https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/
