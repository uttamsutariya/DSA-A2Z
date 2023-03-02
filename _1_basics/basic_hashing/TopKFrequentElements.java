package _1_basics.basic_hashing;

import java.util.*;

// https://practice.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,4};
        System.out.println(Arrays.toString(topK(arr, 2)));
    }

    public static int[] topK(int[] nums, int k) {
        int[] ans = new int[k];

        Map<Integer, Integer> hm = new HashMap<>();

        for(int i: nums) hm.put(i, hm.getOrDefault(i, 0) + 1);

        List<Map.Entry<Integer, Integer>> ls = new ArrayList<>(hm.entrySet());

        ls.sort((a, b) -> a.getValue() == b.getValue() ? b.getKey() - a.getKey() : b.getValue() - a.getValue());

        for(int i = 0 ; i<k ; i++) ans[i] = ls.get(i).getKey();

        return ans;
    }
}
