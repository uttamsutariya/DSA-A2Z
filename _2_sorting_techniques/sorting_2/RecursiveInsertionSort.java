package _2_sorting_techniques.sorting_2;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        recursive_insertion_sort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /*
        Base Case: If array size is 1 or smaller, return.
        Recursively sort first n-1 elements.
        Insert last element at its correct position in sorted array.
    */
    public static void recursive_insertion_sort(int[] arr, int n) {
        if(n <= 1) return;
        recursive_insertion_sort(arr, n-1);
        int j = n-1;

        while (j>0 && arr[j] < arr[j-1]) {
            swap(arr, j, j-1);
            j--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


