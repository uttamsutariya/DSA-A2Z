package _4_binary_search.on_1d;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {11,13,15,17};
        int[] arr2 = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr1));
        System.out.println(findMin(arr2));
    }

    public static int findMin(int[] nums) {
        int s = 0, e = nums.length - 1;
        while(s<e) {
            int m = s + (e-s) / 2;

            if(nums[m] >= nums[0] && nums[m] > nums[nums.length-1])
                s = m + 1;
            else
                e = m;
        }

        return nums[s];
    }
}

// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/