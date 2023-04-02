package _5_strings.basic_easy;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String[] arr = {"(()())(())", "(()())(())(()(()))", "()()"};
        for (String s : arr) {
            System.out.println(removeOuterParentheses(s));
        }
    }

    public static String removeOuterParentheses(String s) {
        int open = 0, close = 0, start = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(') ++open;
            else ++close;

            if(open == close) {
                sb.append(s, start+1, i);
                start = i+1;
            }
        }

        return sb.toString();
    }
}

// https://leetcode.com/problems/remove-outermost-parentheses