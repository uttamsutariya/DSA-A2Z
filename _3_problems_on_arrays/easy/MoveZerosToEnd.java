package _3_problems_on_arrays.easy;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2, 0, 3, 0, 4, 5, 6, 0};
        move_zeros_to_end_optimized(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void move_zeros_to_end_optimized(int[] arr) {
        // finding first occurrence of zero
        int k = 0;

        while(k < arr.length) {
            if(k == 0) break;
            else k++;
        }

        int i = k , j = k+1;

        while(i< arr.length && j< arr.length) {
            if(arr[j] != 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
            j++;
        }
    }

    public static void move_zeros_to_end_brute_force(int[] arr) {
        int n = arr.length;
        int[] tmp = new int[n];
        int k = 0;
        for(int i = 0 ; i<n ; i++) {
            if(arr[i] != 0) {
                tmp[k++] = arr[i];
            }
        }

        while(k!=n) {
            tmp[k++] = 0;
        }

        for(int i = 0 ; i<n ; i++) {
            arr[i] = tmp[i];
        }
    }
}
