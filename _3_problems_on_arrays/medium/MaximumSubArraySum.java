package _3_problems_on_arrays.medium;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int msf = 0, meh = 0, s = 0;

        int[] subarrayIndex = new int[2];

        for (int i = 0; i < arr.length; i++) {
            meh += arr[i];

            if(meh > msf) {
                msf = meh;
                subarrayIndex[0] = s;
                subarrayIndex[1] = i;
            }

            if(meh < 0) {
                meh = 0;
                s = i+1;
            }
        }

        return msf;
    }
}
