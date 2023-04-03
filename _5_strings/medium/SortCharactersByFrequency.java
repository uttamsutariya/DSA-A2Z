package _5_strings.medium;

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String[] input = {"tree", "cccaaa", "Aabb"};
        for (String s : input) {
            System.out.println(frequencySort(s));
        }
    }

    public static String frequencySort(String s) {

        if(s == null || s.isEmpty() || s.length() == 1) return s;

        // used to get character from value stored in map
        // otherwise if I create map like Map<Character, Integer> then after counting freq of each character, at the time of output how I gonna access that which character has highest freq ?
        class Freq {
            char c;
            int freq;

            public Freq(char c, int freq) {
                this.c = c;
                this.freq = freq;
            }
        }

        // create map to store freq of all characters
        Map<Character, Freq> freqMap = new HashMap<>();

        // count freq
        for(Character c: s.toCharArray()) {
            if(!freqMap.containsKey(c)) freqMap.put(c, new Freq(c, 1));
            else freqMap.get(c).freq++;
        }

        // create a list of Freq
        List<Freq> freqList = new ArrayList<>(freqMap.values());
        Collections.sort(freqList, (o1, o2) -> o2.freq - o1.freq);

        char[] output = new char[s.length()];
        int x = 0;

        for (Freq freq : freqList) {
            int f = freq.freq;
            while(f-- >0) {
                output[x++] = freq.c;
            }
        }

        return new String(output);
    }
}

// https://leetcode.com/problems/sort-characters-by-frequency