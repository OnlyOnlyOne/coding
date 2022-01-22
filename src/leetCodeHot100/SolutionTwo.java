package leetCodeHot100;

import java.beans.XMLEncoder;

public class SolutionTwo {
    public static int solution(String[] R) {
        // write your code in Java SE 8
        //题意：从左上角开始扫地，用count记录下已经被扫的方格，当陷入循环的时候结束，返回count
        //使用的是字符串，没有给二维数组,可以转换后使用动态规划
        int N = R.length;
        int M = R[0].length();
        int[][] r = new int[N][M];
        //touch是判断是否碰到障碍物，碰到障碍物对应的标志为1，碰到第二次为2，下次再遇到循环结束
        int[][] touch = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (R[i].charAt(j) == 'X') {
                    //2代表障碍
                    r[i][j] = 2;
                }
            }
        }
        int i = 0;
        int j = 0;
        int count = 0;
        //dircet代表方向，1代表向右，2代表向左，3和4代表上下。
        //初始为1
        int direct = 1;
        while (touch[i][j+1] != 2 ||touch[i+1][j] != 2) {
            if (r[i][j] == 0) count++;
            //有障碍物
            if (direct == 1) {
                if (r[i][j + 1] == 2) {
                    i++;
                    //第一次碰到该障碍物
                    touch[i][j + 1]++;
                    direct = 4;
                    continue;
                } else {
                    j++;
                }
            }
            if (direct == 2) {
                if (r[i - 1][j] == 2) {
                    j++;
                    //第一次碰到该障碍物
                    touch[i - 1][j]++;
                    direct = 3;
                    continue;
                } else {
                    j--;
                }
            }
            if (direct == 3) {
                if (r[i][j + 1] == 2) {
                    i++;
                    //第一次碰到该障碍物
                    touch[i][j + 1]++;
                    direct = 1;
                    continue;
                } else {
                    i--;
                }
            }
            if (direct == 4) {
                if (r[i+1][j] == 2) {
                    j--;
                    //第一次碰到该障碍物
                    touch[i+1][j] ++;
                    direct = 2;
                    continue;
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] R = {"...X..", "..X..."};
        solution(R);
    }

    public void search(String[] R) {

    }
}
