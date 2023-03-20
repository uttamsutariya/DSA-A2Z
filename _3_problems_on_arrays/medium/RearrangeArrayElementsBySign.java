package _3_problems_on_arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }

    public static int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : nums) {
            if(num < 0) neg.add(num);
            else pos.add(num);
        }

        int k = 0, j = 0;

        for (int i = 0; i < nums.length; i++) {
            if(i%2==0) nums[i] = pos.get(k++);
            else nums[i] = neg.get(j++);
        }

        return nums;
    }
}
