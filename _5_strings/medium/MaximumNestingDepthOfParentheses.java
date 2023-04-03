package _5_strings.medium;

public class MaximumNestingDepthOfParentheses {
    public static void main(String[] args) {
        String[] input = {"(1+(2*3)+((8)/4))+1", "(1)+((2))+(((3)))", "((((1+2)+8)+5)+7)+(8+9)"};
        for (String s : input) {
            System.out.println(maxDepth(s));
        }
    }

    public static int maxDepth(String s) {
        int count = 0;
        int max = 0;

        for (char c : s.toCharArray()) {
            if(c == '(') {
                count++;
                max = Math.max(max, count);
            }
            else if(c == ')')
                count--;
        }

        return max;
    }
}

// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/