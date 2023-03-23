package _4_binary_search.on_2d;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class RowWithMax1s {
    public static void main(String[] args) {
        int[][] matrix = {  {0, 1, 1, 1},
                            {0, 0, 1, 1},
                            {1, 1, 1, 1},
                            {0, 0, 0, 0}};

        System.out.println(rowWithMax1s(matrix, matrix.length, matrix[0].length));
    }

    public static int rowWithMax1s(int arr[][], int n, int m) {

        int maxRowIndex = -1;
        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int indexOf1 = binarySearch(arr, i, 1);
            System.out.println(indexOf1);
            if(indexOf1 != -1 && indexOf1 < minIndex) {
                minIndex = indexOf1;
                maxRowIndex = i;
            }
        }

        return maxRowIndex;
    }

    public static int binarySearch(int[][] arr, int row, int target) {

        int s = 0, e = arr[0].length - 1;
        int ans = -1;

        while(s<=e) {

            int mid = (s+e) / 2;

            if(target > arr[row][mid])
                s = mid + 1;
            else if(target < arr[row][mid])
                e = mid - 1;
            else {
                ans = mid;
                e = mid-1;
            }
        }

        return ans;
    }


//    brute force solution
//    public static int rowWithMax1s(int arr[][], int n, int m) {
//        int maxRowIndex = 0;
//        int maxCount = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            int c1 = 0;
//            for (int j = 0; j < arr[0].length; j++) {
//                if(arr[i][j] == 1) c1++;
//            }
//            if(c1 > maxCount) {
//                maxCount = c1;
//                maxRowIndex = i;
//            }
//        }
//
//        return maxRowIndex;
//    }
}

// https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=row-with-max-1s