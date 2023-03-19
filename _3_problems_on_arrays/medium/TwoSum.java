package _3_problems_on_arrays.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {

        // using hashmap
//        Map<Integer, Integer> hm = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int curr = nums[i];
//            int x = target - curr;
//
//            if(hm.containsKey(x))
//                return new int[] {i, hm.get(x)};
//
//            hm.put(nums[i], i);
//        }
//
//        return new int[] {-1, -1};

        // using two pointers

        Arrays.sort(nums);

        int i = 0 , j = nums.length - 1;

        while(i<j) {

            int x = nums[i];
            int y = nums[j];

            if(x+y > target) j--;
            else if(x+y < target) i++;
            else return new int[] {i, j};

        }

        return new int[] {-1, -1};
    }
}
