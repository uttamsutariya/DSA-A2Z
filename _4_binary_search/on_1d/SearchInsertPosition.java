package _4_binary_search.on_1d;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 2));
    }

    public static int searchInsert(int[] arr, int target) {
        int s = 0, e = arr.length - 1;

        while(s<=e) {
            int mid = (e-s) / 2 + s;

            if(target > arr[mid]) s = mid+1;
            else if(target < arr[mid]) e = mid-1;
            else return mid;
        }

        return s;
    }
}

// https://leetcode.com/problems/search-insert-position/
