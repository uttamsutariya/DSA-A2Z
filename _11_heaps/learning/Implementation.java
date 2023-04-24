package _11_heaps.learning;

import java.util.*;

class Heap {
    public int[] arr;
    int size;

    public Heap() {
        this.arr = new int[100];
        this.arr[0] = Integer.MIN_VALUE;
        this.size = 0;
    }

    public static void heapifyMaxHeap(int[] arr, int n, int i) {
        int largest = i;
        int left = i*2;
        int right = i*2 + 1;

        // check for child nodes
        if(left <= n && arr[largest] < arr[left]) {
            largest = left;
        }
        if(right <= n && arr[largest] < arr[right]) {
            largest = right;
        }

        // if largest updated (nodes to be swaped)
        if(largest != i) {
            swap(arr, i, largest);

            // process all child nodes of largest
            heapifyMaxHeap(arr, n, largest);
        }
    }

    public static void heapifyMinHeap(int[] arr, int n, int i) {
        int smallest = i;
        int left = i*2;
        int right = i*2+1;

        // check for child nodes
        if(left <= n && arr[left] < arr[smallest]) {
            smallest = left;
        }
        if(right <= n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if(smallest != i) {
            swap(arr, i, smallest);
            heapifyMinHeap(arr, n, smallest);
        }
    }

    public void insert(int val) {   // runs on O(long N)

        size++;     // 1 based indexing
        int lastIndex = size;

        arr[lastIndex] = val;

        while (lastIndex > 1) {
            int parent = lastIndex / 2;
            if(arr[parent] < arr[lastIndex]) {
                swap(arr, lastIndex, parent);
                lastIndex = parent;
            }
            else
                return;
        }
    }

    public static void heapSort(int[] arr, int n) {     // sort ascending order, max heap (otherwise min heap)
        int size = n;

        while (size > 1) {
            // swap 1st with last && remove last node
            swap(arr, 1, size);
            size--;

            heapifyMaxHeap(arr, size, 1);
        }
    }

    public void delete() {      // delete root node, runs on O(log N)

        if(size == 0) {
            System.out.println("Heap is empty");
            return;
        }

        // copy last element to first element
        arr[1] = arr[size--];

        int i = 1;

        // take root node to it's correct position & remove last element
        while (i<size) {
            int leftIndex = 2*i;
            int rightIndex = 2*i + 1;

            if(leftIndex < size && arr[leftIndex] > arr[i]) {
                swap(arr, leftIndex, i);
                i = leftIndex;
            }
            else if(rightIndex < size && arr[rightIndex] > arr[i]) {
                swap(arr, rightIndex, i);
                i = rightIndex;
            }
            else
                return;
        }
    }

    public void print() {
        for (int i = 1 ; i<=size ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void swap(int[] arr, int i, int j) {
        int t  = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

public class Implementation {
    public static void main(String[] args) {
        Heap h = new Heap();

        h.insert(10);
        h.insert(20);
        h.insert(5);
        h.insert(15);
        h.insert(13);
        h.insert(11);
        h.insert(4);
        h.print();

        h.delete();
        h.print();

        /**
         * Min Heap, Heapify O(N)
         */
        int[] min = {-1, 54,53,55,52,50};

        // build heap
        for(int i = min.length/2 ; i>0 ; i--) {
            Heap.heapifyMinHeap(min, min.length-1, i);
        }

        // print heap
        System.out.println("Min Heap");
        for(int i = 1 ; i<min.length ; i++) {
            System.out.print(min[i] + " ");
        }
        System.out.println();

        /**
         * Max Heap, Heapify O(N)
         */
        int[] max = {-1, 54,53,55,52,50};

        // build heap
        for(int i = max.length/2 ; i>0 ; i--) {
            Heap.heapifyMaxHeap(max, max.length-1, i);
        }

        // print heap
        System.out.println("Max Heap");
        for(int i = 1 ; i<max.length ; i++) {
            System.out.print(max[i] + " ");
        }
        System.out.println();


        /**
         * Heap sort, increasing order, max heap
         *
         * 1 ) create max or min heap accordingly
         * 2 ) call heap sort
         *      1 - swap 1st with last & again heapify from 1st to last -1
         */

        Heap.heapSort(max, max.length-1);

        System.out.println("Heap sort");
        for (int i = 1; i < max.length; i++) {
            System.out.print(max[i] + " ");
        }
        System.out.println();

        /**
         * Using priority Queue
         */

        Queue<Integer> minPq = new PriorityQueue<>();   // by default PriorityQueue implements min heap

        for (int i = 0; i < 10; i++) minPq.offer(i*2);

        System.out.println("Elements of min heap");
        while(!minPq.isEmpty()) System.out.print(minPq.poll() + " ");
        System.out.println();

        Queue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());   // use Collections.reverseOrder() to implement max heap
        for (int i = 0; i < 10; i++) maxPq.offer(i*2);
        while(!maxPq.isEmpty()) System.out.print(maxPq.poll() + " ");
        System.out.println();
        System.out.println("Elements of max heap");

    }
}
