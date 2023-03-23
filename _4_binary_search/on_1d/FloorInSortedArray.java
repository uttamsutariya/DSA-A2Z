package _4_binary_search.on_1d;

public class FloorInSortedArray {
    public static void main(String[] args) {
        long[] arr = {1,2,8,10,11,12,19};
        System.out.println(findFloor(arr, arr.length, 5));
    }

    public static int findFloor(long arr[], int n, long x) {
        if(arr[0] > x) return -1;
        else if(arr[0] == x) return 0;

        int s = 0 , e = n - 1;

        while(s<=e) {
            int mid = (e-s) / 2 + s;

            if(x < arr[mid]) e = mid-1;
            else if(x > arr[mid]) s = mid+1;
            else return mid;
        }

        return e;
    }
}

// https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%3BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array