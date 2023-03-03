package _3_problems_on_arrays.easy;

import java.util.Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 5, 6, 10, 12};
        left_rotate(arr);
        System.out.println(Arrays.toString(arr));
        right_rotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void right_rotate(int[] arr) {
        int x = arr[arr.length - 1];

        for(int i = arr.length-1 ; i>=1 ; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = x;
    }

    public static void left_rotate(int[] arr) {
        int x = arr[0];

        for(int i = 1 ; i<arr.length ; i++) {
            arr[i-1] = arr[i];
        }

        arr[arr.length - 1] = x;
    }
}
