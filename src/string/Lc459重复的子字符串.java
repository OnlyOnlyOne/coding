package string;

import java.util.ArrayList;
import java.util.List;

public class Lc459重复的子字符串 {
    public static boolean repeatedSubstringPattern(String string) {
        List<Integer> nums = new ArrayList<Integer>();
        int length = string.length();
        for (int i = 1; i <= string.length() / 2; i++) {
            if (length % i == 0) {
                nums.add(i);
            }
        }
        boolean flag = false;
        //开始一个一个判断
        for (int i = 0; flag==flag&&i < nums.size(); i++) {
            int l = nums.get(i);
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (string.charAt(j) != string.charAt(j % l)) {
                    break;
                } else {
                    count++;
                }
            }
            if (count == length ) {
                flag = true;
            }
        }
        return flag;
    }
    public static boolean repeatedSubstringPattern1(String string) {
        //使用KMP
        int[] next = new int[string.length()];
        getNext(next,string);
        boolean flag = false;
        if(next[string.length() - 1]!=-1 &&string.length() % (string.length() - next[string.length() - 1] ) == 0) flag = true;
        return flag;
    }

    public static void getNext(int[] arr, String string) {
        int j = -1;
        arr[0] = j;
        for (int i = 1; i < arr.length; i++) {
            if (j >= 0 && string.charAt(j + 1) != string.charAt(i)) {
                j = arr[j];
            }
            if (string.charAt(j + 1) == string.charAt(i)) {
                j++;
            }
            arr[i] = j;
        }
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern1("abababaaba"));
    }
}
