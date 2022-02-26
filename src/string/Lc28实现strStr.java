package string;

public class Lc28实现strStr {
    public static int strStr(String haystack, String needle) {
        if(needle == null)return 0;
        if(needle.length() == 0) return 0;
        if(needle.length()>haystack.length()) return -1;
        int flag = 0;
        int index = -1;
        for (int i = 0; flag == 0&&i < haystack.length(); i++) {
            if(haystack.charAt(i) != needle.charAt(0)) continue;
            int count = 0;
            int cur = i;
            index = i;
            for (int j = 0; j < needle.length(); j++) {
                if (cur<haystack.length()&&haystack.charAt(cur) == needle.charAt(j)) {
                    cur++;
                    count++;

                } else {
                    break;
                }
            }
            if (count == needle.length()) {
                flag = 1;
                break;
            }

        }
        if(flag==1) return index;
        return -1;

    }

    public static int strStr2(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int[] next = new int[needle.length()];
        int count = 0;
        int j = -1;
        for (int i = 0; i < haystack.length(); i++) {
            while (j >= 0 && needle.charAt(j + 1) != haystack.charAt(i)) {
                j = next[j];
            }
            if(needle.charAt(j+1) == haystack.charAt(i)) j++;
            if(j==needle.length()-1) return (i-needle.length()+1);
        }
        return -1;
    }

    public void getNext(int[] next,String s) {
        int j = -1;
        next[0] = j;
        for (int i = 1; i < s.length(); i++) {
            while (j >= 0 && s.charAt(i) != s.charAt(j + 1)) {
                j = next[j];
            }
            if (s.charAt(j + 1) == s.charAt(i)) {
                j++;
            }
            next[i] = j;
        }
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issipi"));
    }
}
