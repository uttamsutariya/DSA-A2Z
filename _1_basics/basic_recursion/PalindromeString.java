package _1_basics.basic_recursion;

public class PalindromeString {

    static int i = 0;

    public static void main(String[] args) {
        String str = "uttam mattu";
        System.out.println(check_palindrome_string(str));
    }

    static boolean check_palindrome_string(String str) {
        // base case
        if(i > str.length() / 2) return true;

        // main logic
        if(str.charAt(i) != str.charAt(str.length() - i - 1)) return false;

        // recursive call
        i++;
        return check_palindrome_string(str);
    }
}

// https://takeuforward.org/data-structure/check-if-the-given-string-is-palindrome-or-not/
