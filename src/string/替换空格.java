package string;

public class 替换空格 {
    public String replaceSpace(String s) {
        //从后往前替换
        /*
        * 首先先扩容
        * */
        if (s.length() == 0 || s == null) return s;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append("  ");
            }
        }
        if(sb.length() == 0) return s;
        int left = s.length() - 1;
        s += sb;
        int right = s.length() - 1;
        char[] c = s.toCharArray();
        while (left >= 0) {
            if (c[left] != ' ') {
                c[right] = c[left];
            }else {
                c[right--] = '0';
                c[right--] = '2';
                c[right] = '%';
            }
            left--;
            right--;
        }
        return new String(c);
    }
}
