package _4_binary_search.on_1d;

public class BasicImplementation {
    public static void main(String[] args) {
        int[] arr = {2,3,7,10,13,14,17};
        System.out.println(binarySearchIterative(arr, 7));
        System.out.println(binarySearchRecursive(arr, 2, 0, arr.length-1));
    }

    public static int binarySearchIterative(int[] arr, int target) {
        int s = 0, e = arr.length-1;

        while(s<=e) {

            int mid = (e-s) / 2 + s;

            if(arr[mid] > target) e = mid-1;
            else if(arr[mid] < target) s = mid+1;
            else return mid;

        }

        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int s, int e) {
        if(s>e) return -1;
        int mid = (e-s) / 2 + s;

        if(arr[mid] > target) return binarySearchRecursive(arr, target, s, mid-1);
        else if(arr[mid] < target) return binarySearchRecursive(arr, target, mid+1, e);
        else return mid;
    }
}

// https://takeuforward.org/data-structure/binary-search-explained/
// https://leetcode.com/problems/binary-search/