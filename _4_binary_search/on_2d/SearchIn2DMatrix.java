package _4_binary_search.on_2d;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(mat, 45));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
//        int i = matrix.length-1;
//        int j = matrix[0].length-1;
//
//        if(matrix[0][0] > target) return false;
//
//        while(matrix[i][0] > target) i--;
//        while(matrix[i][j] > target) j--;
//
//        if(matrix[i][j] == target) return true;
//        return false;

        int i = 0;
        int j = matrix[0].length-1;

        while(i<matrix.length && j>=0) {
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] > target) j--;
            else i++;
        }

        return false;
    }
}

// https://leetcode.com/problems/search-a-2d-matrix/description/