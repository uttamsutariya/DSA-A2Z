package _5_strings.basic_easy;

import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        String[][] input = {{"anagram", "nagaram"}, {"rat", "car"}, {"valid", "dival"}, {"grammerr", "memrragg"}};
        for (String[] strings : input) {
            System.out.println(isAnagram(strings[0], strings[1]));
        }
    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(!hm.containsKey(c)) return false;
            hm.put(c, hm.get(c)-1);
        }

        for(Character c: hm.keySet()) {
            if(hm.get(c) != 0) return false;
        }

        return true;
    }
}
