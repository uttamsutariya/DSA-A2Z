package _3_problems_on_arrays.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1,0,0,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] arr) {

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                count++;
                if(count > maxCount) maxCount = count;
            }
            else count = 0;
        }    

        return maxCount;
    }
}

// https://leetcode.com/problems/max-consecutive-ones/
