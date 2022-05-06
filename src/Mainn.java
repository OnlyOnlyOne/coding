import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Mainn {
    static int max = 0;

    public static int solution(int[] A) {
        // write your code in Java SE 8
        //滑动窗口
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int left = 0;
        int count = 0;
        for (int right = 0; right < A.length; right++) {
            map.put(A[right], right);
            if (map.size() == 3) {
                count = Math.max(count, right - left);
                left = map.get(A[right - 1]);
                if (left >= 1) {
                    map.remove(A[left - 1]);
                }
            }
        }
        if (map.size() <= 2) {
            count = Math.max(count, A.length - left);
        }
        return count;
    }

    public static int solution1(int A, int B) {
        // write your code in Java SE 8
        BigInteger sa = new BigInteger(String.valueOf(A));
        BigInteger sb = new BigInteger(String.valueOf(B));
        BigInteger res = sa.multiply(sb);
        BigInteger temp;
        BigInteger c = new BigInteger(String.valueOf(2));

        int result = 0;
        while (!res.toString().equals("0")) {
            temp = res.mod(c);
            if (temp.toString().equals("1")) {
                result++;
            }
            res = res.divide(c);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {0};
        int v = solution(A);
        System.out.println(v);
    }
}
