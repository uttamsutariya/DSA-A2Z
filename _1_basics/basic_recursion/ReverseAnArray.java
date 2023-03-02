package _1_basics.basic_recursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        reverse_array(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse_array(int[] arr, int i) {
        if(i == arr.length / 2) return;
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        reverse_array(arr, i+1);
    }
}

// https://takeuforward.org/data-structure/reverse-a-given-array/
