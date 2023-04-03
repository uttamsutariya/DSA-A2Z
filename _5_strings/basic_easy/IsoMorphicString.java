package _5_strings.basic_easy;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicString {
    public static void main(String[] args) {
        String[][] input = {{"egg", "add"}, {"foo", "bar"}, {"paper", "title"}, {"badc", "baba"}};
        for (String[] strings : input) {
            System.out.println(isIsomorphic(strings[0], strings[1]));
        }
    }

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Character> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if(!hm.containsKey(cs)) {
                if(hm.containsValue(ct)) return false;
                else hm.put(cs, ct);
            }
            else {
                // if contains cs
                if(hm.get(cs) != ct) return false;
            }
        }
        return true;
    }
}

// https://leetcode.com/problems/isomorphic-strings/description/