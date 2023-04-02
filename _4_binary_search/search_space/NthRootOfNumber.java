package _4_binary_search.search_space;

public class NthRootOfNumber {
    public static void main(String[] args) {
        System.out.println(find_nth_root(2, 64));
    }

    public static double find_nth_root(int n, int m) {
        double s = 1;
        double e = m;
        double eps = 1e-6;  // round up to 5 decimal digits

        while((e-s) > eps) {
            double mid = (s+e) / 2.0;

            if(multiply(n, mid) < m)
                s = mid;
            else
                e = mid;
        }

        return e;
    }

    public static double multiply(int n, double m) {
        double ans = 1.0;

        for (int i = 0; i < n; i++) {
            ans *= m;
        }

        System.out.println(ans);
        return ans;
    }
}
