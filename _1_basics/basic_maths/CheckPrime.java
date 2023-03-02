package _1_basics.basic_maths;

public class CheckPrime {
    public static void main(String[] args) {
        int x = 17;
        System.out.println(checkPrime(x));
    }

    static boolean checkPrime(int n) {

        if(n == 1) return true;

        for(int i = 2 ; i<Math.sqrt(n) ; i++) {
            if(n%i == 0) return false;
        }

        return true;
    }
}

// https://takeuforward.org/data-structure/check-if-a-number-is-prime-or-not/
