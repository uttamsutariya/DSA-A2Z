package _3_problems_on_arrays.easy;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println(find_largest(arr));
    }

    public static int find_largest(int[] arr) {
        int max = arr[0];

        for(int i: arr)
            if(i>max) max = i;

        return max;
    }
}
