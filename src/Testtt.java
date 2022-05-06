import leetCodeHot100.list.ListNode;

class Solution {

    public static String longestPalindrome(String s) {
        Boolean[][] dp = new Boolean[s.length() + 1][s.length() + 1];
        dp[1][1] = true;
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }
        int max = 1;
        int begin = 1;
        char[] str = s.toCharArray();
        for (int i = 2; i <= s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                if(j >=s.length()) break;
                if (j - i == 0) {
                    dp[i][j] = true;
                    continue;
                }
                if (j - i == 1) {
                    dp[i][j] = str[i] == str[j];
                    continue;
                }
                if (dp[i + 1][j - 1]) {
                    dp[i][j] = str[i] == str[j];
                }
                if (dp[i][j]) {
                    if (j - i + 1 > max) {
                        begin = i;
                        max = j - i + 1;
                    }
                }
            }
        }


        return s.substring(begin, begin + max);
    }

    public static void main(String[] args) {
        String string = "bab";
//        String res = longestPalindrome(string);
        System.out.println(string.substring(0,1));
    }

    public int maxPoints(int[][] ps) {
        int n = ps.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            int[] x = ps[i];
            for (int j = i + 1; j < n; j++) {
                int[] y = ps[j];
                int cnt = 2;
                for (int k = j + 1; k < n; k++) {
                    int[] p = ps[k];
                    int s1 = (y[1] - x[1]) * (p[0] - y[0]);
                    int s2 = (p[1] - y[1]) * (y[0] - x[0]);
                    if (s1 == s2) cnt++;
                }
                ans = Math.max(ans, cnt);

            }
        }
        return ans;
    }

    public ListNode reverse(ListNode list) {
        ListNode dummydum = null;
        ListNode head = list;
        while (head != null) {
            ListNode temp = head.next;
            head.next = dummydum;
            dummydum = head;
            head = temp;
        }
        return dummydum;
    }


}
