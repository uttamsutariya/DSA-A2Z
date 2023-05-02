package _3_problems_on_arrays.medium;

import java.util.*;

public class MaximumSumOfDistinctSubArraysWithKLength {
    public static void main(String[] args) {
        int[] arr = {1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(arr, k));
    }

    public static long maximumSubarraySum(int[] arr, int k) {
        int max = 0;
        int sum = 0;

        int i = 0, j = 0;

        Map<Integer, Integer> hm = new HashMap<>();

        hm.remove(arr[1]);

        while (j<arr.length) {
            sum += arr[j];
            hm.put(arr[j], hm.getOrDefault(arr[j], 0) + 1);

            if(j-i+1 == k) {

                boolean isRepeat = false;

                for(int x = i ; x<=j ; x++) {
                    if(getFreq(hm, arr[x]) > 1) {
                        isRepeat = true;
                        break;
                    }
                }

                if(!isRepeat) {
                    // update max
                    max = Math.max(max, sum);
                }

                // reduce window size
                sum = sum - arr[i];
                i++;
            }

            j++;
        }


        return max;
    }

    public static int getFreq(Map<Integer, Integer> hm, int i) {
        return hm.get(i);
    }
}
