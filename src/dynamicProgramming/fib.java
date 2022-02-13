package dynamicProgramming;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;

public class fib {
    //509斐波那契数列
    public int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n -1) + fib(n-2);
    }
    Map<Integer,Integer> result = new HashMap<>();
    public int fib2(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        Integer left = result.get(n - 1);
        Integer  right = result.get(n - 2);

        if (left != null && right != null) {
            return result.get(n - 1) + result.get(n - 2);
        } else if(left == null && right != null){
            int a = fib(n - 1);
            result.put(n - 1, a);
            return a + result.get(n - 2);
        } else if (left != null && right == null) {
            int b = fib(n - 2);
            result.put(n - 2, b);
            return result.get(n - 1) + b;
        }

        return fib(n-1) + fib(n-2);
    }

    public int fib3(int n) {
        if(n<=1) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
