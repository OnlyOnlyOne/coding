package string;

public class Lc344翻转字符串 {
    /*
    *
    *
    * */
    public void reverseString(char[] s) {
        if(s.length == 0) return;
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            swap(left, right, s);
            left++;
            right--;
        }
    }

    public void swap(int left, int right,char[] s) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
    }


}