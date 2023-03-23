package _4_binary_search.on_1d;

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] arr1 = {5,7,7,8,8,10};
        int[] arr2 = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr1, 8)));
        System.out.println(Arrays.toString(searchRange(arr2, 6)));
    }

    private static int[] searchRange(int[] arr, int target) {
        return new int[] {findPosition(arr, target, true), findPosition(arr, target, false)};
    }

    private static int findPosition(int[] arr, int target, boolean isLeftPos) {
        int s = 0, e = arr.length-1;
        int ans = -1;
        while(s<=e) {
            int mid = (e-s) / 2 + s;

            if(target > arr[mid]) s = mid+1;
            else if(target < arr[mid]) e = mid - 1;
            else {
                ans = mid;
                if(isLeftPos)
                    e = mid-1;
                else
                    s = mid+1;
            }
        }
        return ans;
    }
}

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array