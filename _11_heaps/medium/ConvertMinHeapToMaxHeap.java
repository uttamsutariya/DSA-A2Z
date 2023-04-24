package _11_heaps.medium;

import java.util.*;

public class ConvertMinHeapToMaxHeap {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
        convertMinToMaxHeap(arr.length, arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void convertMinToMaxHeap(int N, int arr[]) {

//        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//
//        for (int i = 0; i < N; i++) {
//            pq.offer(arr[i]);
//        }
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = pq.poll();
//        }

        /**
         * using max heapify
         */
        for (int i = (N/2) - 1; i >= 0 ; i--) {
            maxHeapify(arr, N, i);
        }

    }

    private static void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if(left < n && arr[left] > arr[largest]) largest = left;
        if(right < n && arr[right] > arr[largest]) largest = right;

        if(largest != i) {
            swap(arr, largest, i);
            maxHeapify(arr, n, largest);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// https://practice.geeksforgeeks.org/problems/convert-min-heap-to-max-heap-1666385109/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=convert-min-heap-to-max-heap