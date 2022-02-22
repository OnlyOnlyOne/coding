package string;

public class lc151翻转字符串里的单词 {
    //提高难度，只用空间复杂度O（1）
    //使用双指针法来移除空格，最后resize一下字符串的大小
    public String reverseWords(String s) {
//        int fastIndex = 0;
//        int slowIndex = 0;
//        char[] chars = s.toCharArray();
//        while (fastIndex < chars.length) {
//            if (chars[fastIndex] == chars[slowIndex] && chars[fastIndex] == ' ') {
//                fastIndex++;
//            } else {
//                chars[slowIndex++] = chars[fastIndex++];
//            }
//        }
        StringBuilder sb = removeSpace(s);
        reverse(sb, 0, sb.length() - 1);
        reverseEachWord(sb);
        return sb.toString();

    }
    //去除多余空格
    public StringBuilder removeSpace(String string) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = string.length() - 1;
        while(string.charAt(start) == ' ') start++;
        while(string.charAt(end) == ' ') end--;
        while (start <= end) {
            if (string.charAt(start) != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(string.charAt(start));
            }
            start++;
        }
        return sb;
    }

    //翻转字符串
    public void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    //翻转每个单词
    public void reverseEachWord(StringBuilder sb) {
        int first = 0;
        int slow = 0;
        int n = sb.length();
        while (slow < n) {
            // while(sb.charAt(first) != ' ' && first<n){ first++;}
            while (first < n && sb.charAt(first) != ' ') {
                first++;
            }
            reverse(sb, slow, first - 1);
            slow=first + 1;
            first++;
        }
    }
}
