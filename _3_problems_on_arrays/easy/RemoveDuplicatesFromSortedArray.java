package _3_problems_on_arrays.easy;

import java.util.HashSet;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2, 5, 6, 6, 10, 12, 12};
        int k = remove_duplicates_2(arr);
        for(int i = 0 ; i<k ; i++) System.out.print(arr[i] + " ");
    }

    // set based solution
    public static int remove_duplicates_1(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int i: arr) set.add(i);

        int k = set.size();

        int j = 0;

        for(int i: set) arr[j++] = i;

        return k;
    }

    // two pointer solution
    public static int remove_duplicates_2(int[] arr) {
        int i = 0;
        for(int j = 1; j<arr.length ; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
