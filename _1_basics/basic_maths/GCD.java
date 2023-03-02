package _1_basics.basic_maths;

public class GCD {
    public static void main(String[] args) {
        int n1 = 5, n2 = 10;
        System.out.println(find_gcd_1(n1, n2));
        System.out.println(find_gcd_2(n1, n2));
    }

    static int find_gcd_1(int n1, int n2) {

        int gcd = 1;

        for(int i = 2 ; i<=Math.min(n1, n2); i++) {
            if(n1 % i == 0 && n2 % i == 0) gcd = i;
        }

        return gcd;
    }

    // by euclid's theorem => gcd(a,b) = gcd(b, a%b)
    static int find_gcd_2(int n1, int n2) {
        if(n2 == 0) return n1;
        return find_gcd_2(n1, n1%n2);
    }

}

// https://takeuforward.org/data-structure/find-gcd-of-two-numbers/