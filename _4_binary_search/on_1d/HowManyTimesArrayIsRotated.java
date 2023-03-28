package _4_binary_search.on_1d;

public class HowManyTimesArrayIsRotated {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println(findKRotation(arr, arr.length));
    }

    private static int findKRotation(int arr[], int n) {
        int s = 0, e = arr.length-1;

        while(s<e) {
            int mid = (e-s)/2 + s;

            if(arr[mid] > arr[0]) s = mid+1;
            else e = mid;
        }
        return s;
    }
}
