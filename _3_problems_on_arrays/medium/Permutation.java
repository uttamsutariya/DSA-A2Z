package _3_problems_on_arrays.medium;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, ans, 0);
        return ans;
    }

    public static void solve(int[] nums, List<List<Integer>> ans, int index) {
        if(index == nums.length) {
            List<Integer> innerList = new ArrayList<>();
            for (int num : nums)
                innerList.add(num);
            ans.add(new ArrayList<>(innerList));
            return;
        }

        for(int i = index ; i<nums.length ; i++) {
            swap(nums, i, index);
            solve(nums, ans, index + 1);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

// https://leetcode.com/problems/permutations
