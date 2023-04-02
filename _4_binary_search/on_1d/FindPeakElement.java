package _4_binary_search.on_1d;

public class FindPeakElement {
    public static void main(String[] args) {

    }

    public static int findPeakElement(int[] arr) {
        int s = 0, e = arr.length-1, n = arr.length;

        if(n == 1) return 0;

        while(s<=e) {
            int mid = (s+e)/2;

            if(mid == 0) {
                return arr[0] > arr[1] ? 0 : 1;
            }

            else if(mid == n-1) {
                return arr[mid] > arr[mid-1] ?  mid : mid-1;
            }

            else {
                if(arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) return mid;
                if(arr[mid] < arr[mid+1]) s = mid+1;
                else e = mid-1;
            }
        }

        return -1;
    }
}
