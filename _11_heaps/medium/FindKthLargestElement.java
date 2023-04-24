package _11_heaps.medium;

import java.util.*;

public class FindKthLargestElement {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,5};
        System.out.println(findKthLargest(arr, 3));
    }

    public static int findKthLargest(int[] nums, int k) {   // O(N)
        Queue<Integer> pq = new PriorityQueue<>();  // min heap

        int i;

        for (i = 0; i < k; i++) pq.offer(nums[i]);

        while(i<nums.length) {
            if(nums[i] > pq.peek()) {
                pq.poll();
                pq.offer(nums[i]);
            }
            i++;
        }

        return pq.peek();
    }
}

// https://leetcode.com/problems/kth-largest-element-in-an-array/