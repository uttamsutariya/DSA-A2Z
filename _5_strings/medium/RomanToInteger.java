package _5_strings.medium;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String[] input = {"III", "LVIII", "MCMXCIV"};
        for (String s : input) {
            System.out.println(romanToInt(s));
        }
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        s = s.replace("IV", "IIII").replace("IX", "VIIII");
        s = s.replace("XL", "XXXX").replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC").replace("CM", "DCCCC");

        int ans = 0;

        for (int i = s.length()-1; i >=0 ; i--) ans += hm.get(s.charAt(i));

        return ans;
    }
}
