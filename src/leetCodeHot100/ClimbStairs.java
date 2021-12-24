package leetCodeHot100;

import java.sql.ResultSet;
import java.sql.SQLOutput;
import java.util.HashMap;

public class ClimbStairs {
    static HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
    public static int climbStairs(int n) {
        //其实菲波那琪求和一样
        //可以递归实现，自顶向下，也可以用循环实现，自下向上
        //自顶向下的时候可以使用hashMap存储重复计算的值

        /*现在使用hashMap的方法*/



        if(n==1) return 1;
        if(n==2) return 2;

        Integer left = result.get(n - 1);
        Integer  right = result.get(n - 2);

        if (left != null && right != null) {
            return result.get(n - 1) + result.get(n - 2);
        } else if(left == null && right != null){
            int a = climbStairs(n - 1);
            result.put(n - 1, a);
            return a + result.get(n - 2);
        } else if (left != null && right == null) {
            int b = climbStairs(n - 2);
            result.put(n - 2, b);
            return result.get(n - 1) + b;
        }
        int a = climbStairs(n - 1);
        int b = climbStairs(n - 2);
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
