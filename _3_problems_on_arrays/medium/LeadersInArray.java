package _3_problems_on_arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        System.out.println(solve(arr));
    }

    public static List<Integer> solve(int[] arr) {
        List<Integer> ls = new ArrayList<>();
        int max = arr[arr.length-1];
        ls.add(max);

        for (int i = arr.length-2; i >=0; i--) {
            if(arr[i] > max) {
                max = arr[i];
                ls.add(max);
            }
        }

        return ls;
    }
}
// https://takeuforward.org/data-structure/leaders-in-an-array/