package 网易;

import java.util.Scanner;

public class Main {
    //题目描述，3*3 后面三行代表这个宫的坐标
    public static void main(String[] args) {
        //回溯
        Scanner input = new Scanner(System.in);
        int testNum = input.nextInt();
//        String[] s = input.nextLine().split("");

        for (int i = 0; i < testNum; i++) {
            int[][] Sudo = new int[3][3];
            int[][] eachGong = new int[3][3];
            //把谜面转换为数组，0为需要填入的数
            for (int j = 0; j < 3; j++) {
                String a = input.next();
                char[] miMian = a.toCharArray();
                for (int k = 0; k < miMian.length; k++) {
                    if (miMian[k] != '*') {
                        Sudo[j][k] = miMian[k] - '0';
                    }
                }
            }
            //标注每个宫，1为第一个宫，2未第二个宫
            for (int z = 1; z <= 3; z++) {
                String[] gong = input.nextLine().split(" ");
                for (int q = 0; q < 3; q++) {
                    int left = Integer.parseInt(gong[q*2]);
                    int right = Integer.parseInt(gong[q * 2 + 1]);
                    eachGong[left][right] = z;
                }
            }
            boolean flag = function(Sudo, eachGong);
            if (flag) {
                System.out.println("Multiple");
            }
            System.out.println("No");
        }

        //开始遍历行和列


    }

    //遍历方法
    public static boolean function(int[][] Sudo, int[][] eachGong) {
        //遍历数组
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (Sudo[i][j] != 0) {
                    continue;
                }
                //尝试填入数字
                for (int k = 1; j <= 3; j++) {
                    if (isVaild(i, j, Sudo, eachGong, k)) {
                        Sudo[i][j] = k;
                        //递归
                        if (function(Sudo, eachGong)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    //判断加入该数字后是否有效
    public static boolean isVaild(int hang, int lie, int[][] Sudo, int[][] eachGong,int val) {
        //判断行是否有效
        for (int i = 0; i < 3; i++) {
            if (Sudo[hang][i] == val) {
                return false;
            }
        }

        //判断列
        for (int i = 0; i < 3; i++) {
            if (Sudo[i][lie] == val) {
                return false;
            }
        }

        //还要判断每个宫
        //获得当前宫
        int gong = eachGong[hang][lie];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (eachGong[i][j] != gong) {
                    continue;
                }
                if (Sudo[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }



















}
