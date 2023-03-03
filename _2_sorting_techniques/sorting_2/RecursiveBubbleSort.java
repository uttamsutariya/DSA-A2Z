package _2_sorting_techniques.sorting_2;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        recursive_bubble_sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /*
        Base Case: If array size is 1, return.
        Do One Pass of normal Bubble Sort. This pass fixes last element of current subarray.
        Recur for all elements except last of current subarray.
    */
    public static void recursive_bubble_sort(int[] arr, int n) {
        if(n == 1) return;

        for(int i = 0 ; i<n-1 ; i++) {
            if(arr[i] > arr[i+1]) swap(arr, i, i+1);
        }

        recursive_bubble_sort(arr, n-1);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

