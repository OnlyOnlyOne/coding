package string;

public class Lc541反转字符串Ⅱ {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i += 2 * k) {
            int start = i;
            //这里是判断尾数够不够k个来取决end指针的位置
            int end = Math.min(ch.length - 1, start + k - 1);
            //用异或运算反转
//            while (start < end) {
//                ch[start] ^= ch[end];
//                ch[end] ^= ch[start];
//                ch[start] ^= ch[end];
//                start++;
//                end--;
//            }
            reverse(ch, start, end);
        }
        return new String(ch);
    }

    public void reverse(char[] c, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            swap(c[i], c[j]);
        }
    }

    public void swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
    }
}