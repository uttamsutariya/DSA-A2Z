package _5_strings.basic_easy;

import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("  Hi I'm       a very   big fan    of     "));
        // output : of fan big very a I'm Hi
    }

    public static String reverseWords(String s) {

        String[] arr = s.trim().split(" +");

        System.out.println(Arrays.toString(arr));

        StringBuilder ans = new StringBuilder();

        for(int i = arr.length-1 ; i>=0 ; i--) {
            ans.append(arr[i] + " ");
        }

        ans.deleteCharAt(ans.length()-1);

        return ans.toString();
    }
}

// https://leetcode.com/problems/reverse-words-in-a-string
