package _5_strings.medium;

import java.util.Arrays;

public class CountNumberOfSubstringsWithDistinctChar {
    public static void main(String[] args) {
        String ch = "abcc";
        int k = 3;
        System.out.println("Total substrings with exactly " +
                k +    " distinct characters : "
                + countkDist(ch, k));
    }

    public static int countkDist(String str, int k) {
        int res = 0;
        int n = str.length();

        boolean seen[] = new boolean[26];

        for (int i = 0; i < n; i++) {
            int dc = 0;     // distinct count
            Arrays.fill(seen, false);

            for (int j = i; j < n; j++) {
                // If this is a new character for this
                // substring, increment dist_count.
                if (!seen[str.charAt(j) - 'a'])
                    dc++;

                // mark current char as seen
                seen[str.charAt(j) - 'a'] = true;

                // If distinct character count becomes k,
                // then increment result.
                if (dc == k)
                    res++;
            }
        }

        return res;
    }
}
