package _1_basics.basic_recursion;

public class OneToN {

    public static void main(String[] args) {
        print_1_to_n(10);
        System.out.println();
        print_n_to_1(10);
    }

    static void print_1_to_n(int n) {
        if(n==0) return;
        print_1_to_n(n-1);
        System.out.print(n+" ");
    }

    static void print_n_to_1(int n) {
        if(n==0) return;
        System.out.print(n + " ");
        print_n_to_1(--n);
    }
}
