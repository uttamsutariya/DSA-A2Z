package _4_binary_search.search_space;

public class SquareRootOfNumber {
    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }

    public static int mySqrt(int x) {
        long s = 0, e = x/2;
        long ans = -1;

        while(s<=e) {
            long mid = (e-s) / 2 + s;

            if(mid*mid > x) {
                e = mid-1;
            }
            else if(mid*mid < x) {
                ans = mid;
                s = mid+1;
            }
            else {
                return (int)mid;
            }
        }

        return (int)ans;
    }
}

// https://leetcode.com/problems/sqrtx