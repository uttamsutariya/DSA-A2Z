package _3_problems_on_arrays.easy;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 5, 6, 10, 12};
        rotate_left(arr, 2);
        System.out.println(Arrays.toString(arr));
        rotate_right(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotate_left(int[] arr, int k) {
        for(int j = 0 ; j < k ; j++) {
            int x = arr[0];

            for(int i = 1 ; i<arr.length ; i++) {
                arr[i-1] = arr[i];
            }

            arr[arr.length - 1] = x;
        }
    }

    public static void rotate_right(int[] arr, int k) {
        for(int j = 0 ; j<k ; j++) {
            int x = arr[arr.length - 1];

            for(int i = arr.length-1 ; i>=1 ; i--) {
                arr[i] = arr[i-1];
            }

            arr[0] = x;
        }
    }
}
