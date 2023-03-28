package _4_binary_search.on_1d;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }

    private static int singleNonDuplicate(int[] nums) {
        // using binary search
        int n = nums.length;
        int s = 0,  e = n-1;

        while(s<e) {

            int mid = (e-s) / 2 + s;

            if(mid % 2 == 1) mid--;
            if(nums[mid] != nums[mid+1]) {
                e = mid-1;
            }
            else {
                s = mid+2;
            }

        }

        return nums[s];
    }
}
