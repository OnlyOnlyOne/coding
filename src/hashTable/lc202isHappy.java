package hashTable;

import java.util.HashSet;
import java.util.Set;

public class lc202isHappy {
    //判断是否是快乐数字：该数每一位上的数字的平方和相加起来替换该数，依次类推，直到为1
    public boolean isHappy(int n) {
        //可能难点就是取数值各个位上的单数
        Set<Integer> records = new HashSet<Integer>();
        while (n != 1 && !records.contains(n)) {
            records.add(n);
            n = getNextNum(n);
        }
        return n == 1;
    }

    private int getNextNum(int n) {
        int res = 0;
        while (n > 0) {
            int temp = n % 10;
            res += temp * temp;
            n = n / 10;
        }
        return res;
    }
}
