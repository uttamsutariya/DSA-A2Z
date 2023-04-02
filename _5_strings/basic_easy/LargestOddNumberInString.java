package _5_strings.basic_easy;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String[] input = {"52", "4275", "75127530", "4206", "35427"};
        for (String s : input) {
            System.out.println("\"" + largestOddNumber(s) + "\"");
        }
    }

    public static String largestOddNumber(String num) {
        for(int i = num.length() - 1 ; i>=0 ; i--) {
            int n = (int)num.charAt(i);
            if(n%2==1) {
                return num.substring(0, i+1);
            }
        }

        return "";
    }
}

// https://leetcode.com/problems/largest-odd-number-in-string
