package _4_binary_search.on_1d;

public class CheckIfInputArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {90, 80, 100, 70, 40, 30};
        System.out.println(arraySortedOrNot(arr, arr.length));
    }

    private static boolean arraySortedOrNot(int[] arr, int n) {
        if(n == 0 || n == 1) return true;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] > arr[i]) {
                return false;
            }
        }

        return true;
    }
}
