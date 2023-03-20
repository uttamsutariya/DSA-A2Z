package _3_problems_on_arrays.medium;

import java.util.Arrays;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        setMatrixZero(arr);
        printMatrix(arr);
    }

    public static void setMatrixZero(int[][] arr) {

        int[] rows = new int[arr.length];
        int[] cols = new int[arr[0].length];

        Arrays.fill(rows, -1);
        Arrays.fill(cols, -1);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == 0) {
                    rows[i] = 0;
                    cols[j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(rows[i] == 0 || cols[j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }
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
