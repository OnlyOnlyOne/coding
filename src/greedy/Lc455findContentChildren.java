package greedy;

import java.util.Arrays;

public class Lc455findContentChildren {
    public static int findContentChildren(int[] g, int[] s) {
        /*
        * 关键 s[j] >= g[i] 且尽可能满足足够多的小孩
        * */
        int[] sign = new int[g.length];
        int count = 0;

        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = s.length - 1; i >= 0; i--) {
            if(count>=g.length) return count;
            for (int j = g.length -1 ; j >= 0; j--) {
                if (s[i] >= g[j]) {
                    if (sign[j] == 1) {
                        continue;
                    } else {
                        count++;
                        sign[j] = 1;
                        break;
                    }
                }
            }

        }
        return count;
    }

    public static int findContentChildren2(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int start = 0;
        for (int i = 0; i < s.length && start < g.length; i++) {
            if (s[i] >= g[start]) {
                start++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {3};
        System.out.println(findContentChildren(g,s));
    }
}
