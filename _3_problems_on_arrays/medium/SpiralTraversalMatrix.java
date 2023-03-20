package _3_problems_on_arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraversalMatrix {

    static int n;
    static int m;

    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        n = matrix.length;
        m = matrix[0].length;
        spiralTraversal(matrix);
    }

    public static void spiralTraversal(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int top = 0, left = 0, bottom = n-1, right = m-1;

        while(top <= bottom && left <= right) {

            for(int i = left; i<=right; i++)
                ans.add(matrix[top][i]);
            top++;

            for(int i = top ; i<=bottom ; i++)
                ans.add(matrix[i][right]);
            right--;

            if(top <= bottom) {
                for(int i = right ; i>= left ; i--)
                    ans.add(matrix[bottom][i]);
                bottom--;
            }

            if(left <= right) {
                for(int i = bottom ; i>=top ; i--)
                    ans.add(matrix[i][left]);
                left++;
            }
        }

        System.out.println(ans);
    }
}

// https://leetcode.com/problems/spiral-matrix/
// https://takeuforward.org/data-structure/spiral-traversal-of-matrix/