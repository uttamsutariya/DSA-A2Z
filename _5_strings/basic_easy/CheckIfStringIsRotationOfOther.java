package _5_strings.basic_easy;

public class CheckIfStringIsRotationOfOther {
    public static void main(String[] args) {
        String[][] input = {{"abcde", "cdeab"}, {"abcde", "abced"}};
        for (String[] strings : input) {
            System.out.println(rotateString(strings[0], strings[1]));
        }
    }

    private static boolean rotateString(String A, String B) {

        if(A == null || B == null) {
            //throw exception on A and B both being null?
            return false;
        }
        if(A.length() != B.length()) {
            return false;
        }
        if(A.length() == 0) {
            return true;
        }
        for(int i = 0; i < A.length(); i++) {
            if(rotateString(A, B, i)) {
                return true;
            }
        }
        return false;
    }

    private static boolean rotateString(String A, String B, int rotation) {
        for(int i = 0; i < A.length(); i++) {
            if(A.charAt(i) != B.charAt((i+rotation)%B.length())) {
                return false;
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/rotate-string/
// https://leetcode.com/problems/rotate-string/solutions/2764856/rotate-string-o-1-time-complexity/