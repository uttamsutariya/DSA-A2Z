package _3_problems_on_arrays.medium;

public class RotateMatrix90deg {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate90degInPlace(matrix); // clockwise rotation
    }

    public static void rotate90degInPlace(int[][] matrix) {

        // take transpose of matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                swap(matrix, i, j);
            }
        }

        // reverse rows
        for (int i = 0; i < matrix.length; i++) {
            int x = 0, y = matrix.length - 1;
            while(x<y) {
                int temp = matrix[i][x];
                matrix[i][x] = matrix[i][y];
                matrix[i][y] = temp;
                x++; y--;
            }
        }
        printMatrix(matrix);
    }

    public static void swap(int[][] mat, int i, int j) {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

    public static void rotate90deg(int[][] matrix) {
        int n = matrix.length;

        int[][] rotated = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                rotated[j][n-i-1] = matrix[i][j];
            }
        }

        printMatrix(rotated);
    }

    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
