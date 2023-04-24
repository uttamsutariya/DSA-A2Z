package _11_heaps.medium;

import java.util.*;

public class FindKthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10,12,13,7,8,6,5};
        System.out.println(findKthSmallest(arr, 3));
    }

    public static int findKthSmallest(int[] nums, int k) {  // O(N)
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder()); // max heap

        int i;

        for (i = 0; i < k; i++) q.offer(nums[i]);

        while(i<nums.length) {
            if(nums[i] < q.peek()) {
                q.poll();
                q.offer(nums[i]);
            }
            i++;
        }

        return q.peek();
    }
}

// https://leetcode.com/problems/kth-largest-element-in-an-array/