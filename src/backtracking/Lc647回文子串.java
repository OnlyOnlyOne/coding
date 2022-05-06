package backtracking;


import java.util.Arrays;

public class Lc647回文子串 {
    public static  int countSubstrings(String s) {
        int count = 0;
        //dp[i][j]代表从下标i到下标j是否是
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 2) {
                        dp[i][j] = true;
                        count ++;
                    } else if (dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        count ++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        countSubstrings("fdsklf");
    }
}
