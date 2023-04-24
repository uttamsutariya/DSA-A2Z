package _11_heaps.medium;

public class CheckIfArrayRepresentsMaxHeap {

    public static void main(String[] args) {
        long[] arr = {90, 15, 10, 7, 12, 2};
        System.out.println(checkIfArrayRepresentsMaxHeap(arr, arr.length));
    }

    public static boolean checkIfArrayRepresentsMaxHeap(long arr[], long n) {
        for(int i = 0 ; i<n/2 ; i++) {
            int l = 2*i+1;
            int r = 2*i+2;

            if(l<n) {
                if(arr[l] > arr[i]) return false;
            }

            if(r<n) {
                if(arr[r] > arr[i]) return false;
            }
        }

        return true;
    }
}

// https://practice.geeksforgeeks.org/problems/does-array-represent-heap4345/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=does-array-represent-heap