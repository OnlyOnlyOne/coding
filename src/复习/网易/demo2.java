package 复习.网易;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testNum = input.nextInt();
        for (int i = 0; i < testNum; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            int[][] mark = new int[n][n];
            String[][] board = new String[n][n];
            //构建棋盘
            for(int j = 0; j < n; j++) {
                String[] str = input.nextLine().split("");
                for (int k = 0; i < str.length; i++) {
                    board[j][k] = str[k];
                }
            }
            //落子
            for (int j = 0; j < m; j++) {
                String[] get = input.nextLine().split(" ");
                int left = Integer.parseInt(get[0]);
                int right = Integer.parseInt(get[1]);
                //白起先走
                if (j % 2 == 0) {
                    board[left][right] = "b";
                }

            }

        }
    }

    public static void helper(String[][] board, int[][] mark,int x, int y) {
        //判断方向
        //右
        //左
        //上
        //下

    }

    public static void right(int x, int y, String[][] board, int[][] mark) {
        for (int i = board.length - 1; i >= 0; i--) {
            if(board[x][i] == "");
        }
    }
}
