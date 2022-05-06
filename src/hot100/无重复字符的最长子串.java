package hot100;

import java.util.HashSet;
import java.util.Set;

public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> set = new HashSet<Character>();
        int cur = -1;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (cur + 1 < s.length() && !set.contains(s.charAt(cur + 1))) {
                set.add(s.charAt(cur + 1));
                cur++;
            }
            ans = Math.max(ans, cur - i + 1);
        }
        return ans;
    }
}