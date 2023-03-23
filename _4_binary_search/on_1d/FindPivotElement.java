package _4_binary_search.on_1d;

public class FindPivotElement {
    public static void main(String[] args) {
        int[] arr = {8,10,17,1,3};
        System.out.println(findPivot(arr));
    }

    private static int findPivot(int[] arr) {
        int s = 0, e = arr.length-1;

        while(s<e) {
            int mid = (e-s)/2 + s;

            if(arr[mid] > arr[0]) s = mid+1;
            else e = mid;
        }
        return s;   // or return e;
    }
}
 /**
    array is rotated, pivot element is minimum element of that array
  */
