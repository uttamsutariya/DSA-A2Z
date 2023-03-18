package _3_problems_on_arrays.easy;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;

        for(int it: nums) ans ^= it;

        return ans;
    }
}
