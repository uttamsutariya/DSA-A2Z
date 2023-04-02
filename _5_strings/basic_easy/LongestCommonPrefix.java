package _5_strings.basic_easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[][] input = {{"flower","flow","flight"}, {"dog","racecar","car"}, {"xyz", "xyzab", "xzy"}};
        for (String[] strings : input) {
            System.out.println(longestCommonPrefix(strings));
        }
    }

    public static String longestCommonPrefix(String[] strings) {

        // sort all strings in lexicographical order
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        // select 1st str as s1 & last as s2
        String s1 = strings[0];
        String s2 = strings[strings.length-1];

        int i = 0;
        StringBuilder ans = new StringBuilder();

        while(i<Math.min(s1.length(), s2.length())) {
            char cs1 = s1.charAt(i);
            char cs2 = s2.charAt(i);

            if(cs1 != cs2) {
                return s1.substring(0, i);
            }
            else {
                ans.append(cs1); // or cs2
            }
            i++;
        }

        return ans.toString();
    }
}

// https://leetcode.com/problems/longest-common-prefix/description/