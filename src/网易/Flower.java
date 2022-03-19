package 网易;

import java.util.Scanner;

public class Flower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int distance = 0;
        int max = Integer.MIN_VALUE;
        int real = 0;
        //定义的是从花店到客户的距离
        int[] cost = new int[n+1];
        for (int i = 0; i < n - 1; i++) {
            int start = input.nextInt();
            int end = input.nextInt();
            int value = input.nextInt();
            int spend = cost[start] + value;
            cost[end] = spend;
            distance += spend;
            real += value;
            max = Math.max(spend,max);
        }
        System.out.print(distance + " " + (real*2 - max));
    }
}
