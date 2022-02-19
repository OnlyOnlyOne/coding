package string;

public class 替换空格 {
    public String replaceSpace(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left <= right) {
            if (ch[left] == ' ') {
                ch[left] = '%';
            }
            if (ch[right] == ' ') {
                ch[right] = '%';
            }
            left++;
            right--;
        }
        return new String(ch);
    }
}
