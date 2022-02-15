package 复习.java基础;

import java.util.HashSet;

public class hashCode {
    public static void main(String[] args) {
        Super2 s1 = new Super2(1, 1, 1);
        Super2 s2 = new Super2(1, 1, 1);

        HashSet<Super2> set = new HashSet<>();

        set.add(s1);
        set.add(s2);
        System.out.println(set.size());
    }
}
