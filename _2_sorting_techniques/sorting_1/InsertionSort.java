package _2_sorting_techniques.sorting_1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion_sort(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i<n ; i++) {
            int j = i;

            while(j>0 && arr[j] < arr[j-1]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
