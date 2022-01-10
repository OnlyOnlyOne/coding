package leetCodeHot100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public int length(String s) {
        //滑动窗口
        Set<Character> set = new HashSet<>();
        int rk = -1;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                set.remove(s.charAt(i - 1));
            }
            while (rk + 1 < s.length() && !set.contains(s.charAt(rk + 1))) {
                set.add(s.charAt(rk + 1));
                ++rk;
            }
            ans = Math.max(ans,rk-i+1);
        }

        return ans;

    }
}
