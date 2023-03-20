package _3_problems_on_arrays.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(solve(arr));
    }

    public static int solve(int[] arr) {

//        Arrays.sort(arr);
//
//        int max = 0, n = arr.length;
//
//        for(int i = 0 ; i<n-1 ; i++) {
//            int j = i+1;
//            while(j<n && arr[j] == arr[j-1]+1) {
//                max = Math.max(max, j-i+1);
//                j++;
//            }
//        }
//
//        return max;

        Set<Integer> hs = new HashSet<>();

        for (int i : arr) hs.add(i);

        int longestStreak = 0;

        for (int i : arr) {
            if(!hs.contains(i-1)) {
                int currNum = i;
                int currStreak = 1;

                while(hs.contains(currNum+1)) {
                    currStreak++;
                    currNum++;
                }
                longestStreak = Math.max(longestStreak, currStreak);
            }
        }

        return longestStreak;
    }
}
