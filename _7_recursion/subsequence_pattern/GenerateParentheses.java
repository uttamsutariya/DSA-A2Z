package _7_recursion.subsequence_pattern;

import java.util.*;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        recurse(n, 0, 0, "", res);
        return res;
    }

    private static void recurse(int n, int l, int r, String str, List<String> res) {
        if(str.length() == 2*n) {
            res.add(str);
            return;
        }

        if(l < n) {
            recurse(n, l+1, r, str + "(", res);
        }

        if(r < l) {
            recurse(n, l, r+1, str + ")", res);
        }
    }
}

// https://leetcode.com/problems/generate-parentheses/
