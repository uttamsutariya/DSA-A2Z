package _1_basics.basic_recursion;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty[]=-1&page=1&query=problemTypefunctionaldifficulty[]-1page1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-all-factorial-numbers-less-than-or-equal-to-n
public class FactorialOfNNumbers {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(570));
    }

    static ArrayList<Long> factorialNumbers(long n) {

        ArrayList<Long> ls = new ArrayList<>();

        int i = 1;
        while(true) {
            long fact = find_factorial(i);
            if(fact < n) ls.add(fact);
            else break;
            i++;
        }

        return ls;
    }

    static long find_factorial(long n) {
        if(n == 1) return 1;
        return n * find_factorial(n-1);
    }
}
