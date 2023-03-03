package _2_sorting_techniques.sorting_1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubble_sort(int[] arr) {
        int n = arr.length;

        for(int i = 0 ; i<n-1 ; i++) {
            boolean didSwap = false;
            for(int j = 0 ; j<n-i-1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                    didSwap = true;
                }
            }

            if(!didSwap) {
                break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
