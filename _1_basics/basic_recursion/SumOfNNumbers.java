package _1_basics.basic_recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(find_sum_of_n_numbers(n));
    }

    static int find_sum_of_n_numbers(int n) {
        if(n == 0) return 0;
        return n + find_sum_of_n_numbers(n-1);
    }
}

// https://takeuforward.org/data-structure/sum-of-first-n-natural-numbers/