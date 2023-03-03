package _3_problems_on_arrays.easy;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 3, 5};
        System.out.println(check_array_sorted(arr1));

        int[] arr2 = {0, 2, 6, 5};
        System.out.println(check_array_sorted(arr2));
    }

    public static boolean check_array_sorted(int[] arr) {

        int n = arr.length;

        for(int i = 0 ; i<n-1 ; i++) {
            if(arr[i] > arr[i+1]) return false;
        }

        return true;
    }
}
