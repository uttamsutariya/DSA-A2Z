package _1_basics.basic_hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int arr[] ={10,5,10,15,10,5};
        count_frequency_without_map(arr, arr.length);
        count_frequency_with_map(arr, arr.length);
    }

    public static void count_frequency_without_map(int[] arr, int n) {

        boolean[] visited = new boolean[n];

        for(int i = 0 ; i<n ; i++) {

            // if already visited then skip that element
            if(visited[i] == true) continue;

            // iterate from next element
            int count = 1;
            for(int j = i+1; j<n ; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " is appeared " + count + " times");
        }

    }

    public static void count_frequency_with_map(int[] arr, int n) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: arr) map.put(i, map.getOrDefault(i, 0)+1);

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " is appeared " + entry.getValue() + " times");
        }

    }
}

// https://takeuforward.org/data-structure/count-frequency-of-each-element-in-the-array/