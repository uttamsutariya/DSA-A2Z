package _3_problems_on_arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {

//        map based solution
//        Map<Integer, Integer> hm = new HashMap<>();
//
//        for (int num : nums)
//            hm.put(num, hm.getOrDefault(num, 0) + 1);
//
//        for(Map.Entry<Integer, Integer> it: hm.entrySet()){
//            if(it.getValue() > nums.length / 2){
//                return it.getKey();
//            }
//        }
//
//        return -1;

        int elem = nums[0];

        int count = 0;

        for (int num : nums) {
            if(count == 0) elem = num;
            count += (elem == num) ? 1 : -1;
        }

        return elem;
    }
}
// https://leetcode.com/problems/majority-element/
// https://leetcode.com/problems/subarray-sum-equals-k/