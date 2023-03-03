package _2_sorting_techniques.sorting_1;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for(int j = i+1 ; j<n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
