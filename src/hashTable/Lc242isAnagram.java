package hashTable;

public class Lc242isAnagram {
    public boolean isAnagram(String t, String s) {
        //判断是否是字母异位词:若s和t中每个字符出现的次数都相同，则称s和t互为字母异位词
        int[] result = new int[26];
        for (char c : t.toCharArray()) {
            result[c - 'a'] += 1;
        }
        for (char c : s.toCharArray()) {
            result[c - 'a'] -= 1;
        }

        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                return false;
            }
        }

        return true;

    }
}
