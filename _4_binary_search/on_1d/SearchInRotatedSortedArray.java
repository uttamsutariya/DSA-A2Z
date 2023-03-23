package _4_binary_search.on_1d;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {3,1};
        System.out.println(search(arr, 3));
    }

    public static int search(int[] arr, int target) {
        int n = arr.length;
        int pivotIndex = findPivot(arr);
        if(arr[pivotIndex] <= target && target <= arr[n - 1])
            return binarySearch(arr, pivotIndex, n - 1, target);
        else
            return binarySearch(arr, 0, pivotIndex - 1, target);
    }

    public static int binarySearch(int[] arr, int s, int e, int target) {
        if(s>e) return -1;

        int mid = (e-s)/2 + s;
        if(target > arr[mid]) return binarySearch(arr, mid+1,e, target);
        else if(target < arr[mid]) return binarySearch(arr, s, mid-1, target);
        else return mid;
    }

    public static int findPivot(int[] arr) {
        int s = 0, e = arr.length-1;

        while(s<e) {
            int mid = (e-s)/2 + s;

            if(arr[mid] >= arr[0]) s = mid+1;
            else e = mid;
        }
        return s;   // or return e;
    }
}

//  https://takeuforward.org/data-structure/search-element-in-a-rotated-sorted-array/
//  https://leetcode.com/problems/search-in-rotated-sorted-array/