package _3_problems_on_arrays.easy;

public class SecondLargestSmallestElement {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,0};
        System.out.println(find_second_largest_element(arr));
        System.out.println(find_second_smallest_element(arr));
    }

    public static int find_second_largest_element(int[] arr) {

        if(arr.length == 1) return -1;

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i:arr)
            if(i>max) max = i;

        for(int i: arr) {
            if(i>smax && i!=max) smax = i;
        }

        return smax;
    }

    public static int find_second_smallest_element(int[] arr) {
        if(arr.length == 1) return -1;

        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i:arr)
            if(i<min) min = i;

        for(int i: arr) {
            if(i<smin && i!=min) smin = i;
        }

        return smin;
    }
}
