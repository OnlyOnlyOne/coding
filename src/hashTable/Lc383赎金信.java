package hashTable;

import java.util.HashMap;

public class Lc383赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        //判断ransomNote能不能由magazine里面的字符构成
        //在这个之中，用数组时间会快点
        HashMap<String, Integer> res = new HashMap<String, Integer>();
        char[] r = magazine.toCharArray();
        for (char c : r) {
            if (res.containsKey(c+"")) {
                res.put(c+"", res.get(c+"") + 1);
            } else {
                res.put(c + "", 1);
            }
        }

        char[] m = ransomNote.toCharArray();
        for (char c : m) {
            if (res.containsKey(c + "")) {
                if (res.get(c + "") == 1) {
                    res.remove(c + "");
                } else {
                    res.put(c + "", res.get(c + "") - 1);
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
