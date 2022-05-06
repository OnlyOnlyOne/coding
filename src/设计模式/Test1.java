package 设计模式;

import java.util.Scanner;

public class Test1 {
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int max = Math.abs(A - B);
        helper(A, B, max, max, 0);
        System.out.println(min);
    }

    public static void helper(int A, int B, int max1, int max2, int c) {
        int temp = Math.abs(A - B);
        if (temp > max2) return;
        if (c  > max2 + 1) return;
        if (A == B) {
            min = Math.min(min, c);
            return;
        }
        max2 = Math.abs(A - B);
        for (int i = 0; i < 2; i++) {
            //A变
            //奇数,n/2
            if (A % 2 == 1) {
                A = A / 2;
                helper(A, B, max1, max2, c + 2);
                A = A * 2 + 1;
            } else {
                A = A / 2;
                helper(A, B, max1, max2, c + 1);
                A = A * 2;
            }
            //n + 1
            A = A + 1;
            helper(A, B, max1, max2, c + 1);
            A = A - 1;
            //2n
            A = A * 2;
            helper(A, B, max1, max2, c + 1);
            A = A / 2;
            //B变
            if (B % 2 == 1) {
                B = B / 2;
                helper(A, B, max1, max2, c + 2);
                B = B * 2 + 1;
            } else {
                B = B / 2;
                helper(A, B, max1, max2, c + 1);
                B = B * 2;
            }
            //n + 1
            B = B + 1;
            helper(A, B, max1, max2, c + 1);
            B = B - 1;
            //2n
            B = B * 2;
            helper(A, B, max1, max2, c + 1);
            B = B / 2;
        }
    }
}
