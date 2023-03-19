package _3_problems_on_arrays.easy;

public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3};
        System.out.println(sliding_window(arr, 6));
    }

    public static int naive_sol(int[] arr, int x) {

        // find all sub arrays & check for given condition
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum = 0;
                for(int k = i ; k<=j ; k++)
                    sum += arr[k];
                if(sum == x)
                    max = Math.max(max, j-i+1);
            }
        }

        return max;
    }

    public static int sliding_window(int[] arr, int k) {

        int s = 0, e = 0, maxLength = 0, sum = 0;

        int n = arr.length;

        while(s<n) {
            while(e<n) {
                sum += arr[e++];
                if(sum > k) break;
            }

            if(sum == k) maxLength = Math.max(maxLength, e-s+1);

            sum -= arr[s];
            s++;
        }

        return maxLength;
    }
}

//  https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
