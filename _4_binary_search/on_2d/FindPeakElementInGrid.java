package _4_binary_search.on_2d;

import java.util.Arrays;

public class FindPeakElementInGrid {
    public static void main(String[] args) {
        int[][] matrix = {
                {10,20,15},
                {21,30,35},
                {7,16,30}
        };

        System.out.println(Arrays.toString(findPeakGrid(matrix)));

    }

    public static int[] findPeakGrid(int[][] mat) {
        int m = mat.length;     // rows
        int n = mat[0].length;  // cols

        int startCol = 0, endCol = n-1;

        while(startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;
            int maxRow = 0;

            for(int row = 0 ; row < m ; row++) {
                maxRow = mat[row][midCol] > mat[maxRow][midCol] ? row : maxRow;
            }

            // check if leftCol element is big
            boolean isLeftBig = midCol-1 >= startCol && mat[maxRow][midCol - 1] > mat[maxRow][midCol];

            // check if rightCol element is big
            boolean isRightBig = midCol+1 <= endCol && mat[maxRow][midCol+1] > mat[maxRow][midCol];

            if(isRightBig) startCol = midCol+1;
            else if(isLeftBig) endCol = midCol-1;

            else return new int[] {maxRow, midCol};
        }

        return new int[] {-1, -1};
    }
}

// https://leetcode.com/problems/find-a-peak-element-ii/
