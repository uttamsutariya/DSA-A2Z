package _3_problems_on_arrays.medium;

import java.util.*;

public class MaximumSumSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,2,7,8,9};
        int k = 5;
        System.out.println(findSum(arr, k));

        Map<Integer, Integer> hm = new HashMap<>();

        hm.put(10, 20);

    }

    private static int findSum(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        int i = 0, j = 0;

        while (j<arr.length) {
            sum += arr[j];

            if(j-i+1 == k) {
                // update max
                max = Math.max(max, sum);

                // reduce window size
                sum = sum - arr[i];
                i++;
            }

            j++;
        }


        return max;
    }
}
