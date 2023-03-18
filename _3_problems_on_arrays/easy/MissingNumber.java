package _3_problems_on_arrays.easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {

        int n = arr.length;

        int sum = n * (n+1) / 2;

        int arrSum = 0;

        for(int it: arr) arrSum += it;

        return sum - arrSum;
    }
}

// https://leetcode.com/problems/missing-number/