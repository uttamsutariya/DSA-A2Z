package _3_problems_on_arrays.medium;

import java.util.Arrays;

public class SortArrayOfZerosOnesTwos {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        int[] arr2 = {2,0,1};
        sort_by_count(arr);
        sort_by_dutch_national_flag(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static void sort_by_dutch_national_flag(int[] arr) {
        /**
         * 0 to low - 1 -> 0
         * low to mid - 1 -> 1
         * high+1 to end -> 2
         *
         * mid to high unsorted -> sort using mid pointer
         */

        int low = 0, mid = 0, high = arr.length-1;

        while(mid <= high) {

            int curr = arr[mid];

            if(curr == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if(curr == 1) {
                mid++;
            }
            else {  // curr == 2
                swap(arr, mid, high);
                high--;
            }
        }

    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sort_by_count(int[] arr) {

        int c0 = 0, c1 = 0, c2 = 0;

        for (int i : arr) {
            if(i == 0) c0++;
            else if(i == 1) c1++;
            else c2++;
        }

        int k = 0;

        for(int i = 0 ; i<c0; i++) arr[k++] = 0;
        for(int i = 0 ; i<c1; i++) arr[k++] = 1;
        for(int i = 0 ; i<c2; i++) arr[k++] = 2;
    }
}

// https://leetcode.com/problems/sort-colors/
// https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/