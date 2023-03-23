package _4_binary_search.on_1d;

public class PeakElementInArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 1};
        System.out.println(findPeak(arr));
    }

    private static int findPeak(int[] arr) {
        int s = 0, e = arr.length - 1;

        while(s<e) {
            int mid = (e-s) / 2 + s;

            if(arr[mid] < arr[mid+1]) s = mid+1;
            else e = mid;
        }
        return e;
    }
}

// https://takeuforward.org/data-structure/peak-element-in-array/
// https://leetcode.com/problems/find-peak-element/
