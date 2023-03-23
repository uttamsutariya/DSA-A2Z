package _4_binary_search.on_1d;

public class CountOccurrenceInSortedArray {

    private static int count = 0;

    public static void main(String[] args) {
        int[] arr = {2, 2 , 3 , 3 , 3 , 3 , 4};
        count(arr, 3);
        System.out.println(count);
    }

    private static void count(int[] arr, int target) {
        countInLeftOrRight(arr, 3, true);
        countInLeftOrRight(arr, 3, false);
    }

    private static void countInLeftOrRight(int[] arr, int target, boolean isLeftPos) {
        int s = 0, e = arr.length-1;
        while(s<=e) {
            int mid = (e-s) / 2 + s;

            if(target > arr[mid]) s = mid+1;
            else if(target < arr[mid]) e = mid - 1;
            else {
                count++;
                if(isLeftPos)
                    e = mid-1;
                else
                    s = mid+1;
            }
        }
    }
}

// https://takeuforward.org/data-structure/count-occurrences-in-sorted-array/
