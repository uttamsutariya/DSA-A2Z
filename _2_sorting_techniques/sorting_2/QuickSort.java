package _2_sorting_techniques.sorting_2;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        quick_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quick_sort(int[] arr, int low, int high) {
        if(low >= high) return;
        int pi = partition(arr, low, high);
        quick_sort(arr, low, pi-1);
        quick_sort(arr, pi+1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i < j) {
            while (arr[i] <= pivot && i<high) i++;
            while (arr[j] >= pivot && j>=low) j--;

            if(i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }
}
