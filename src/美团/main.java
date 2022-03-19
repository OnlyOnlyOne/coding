package 美团;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] yuanJia = new int[n];
        int[] zhekou = new int[n];
        for (int i = 0; i < n; i++) {
            yuanJia[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            zhekou[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] c = new int[m];
        int[] d = new int[m];
        for (int i = 0; i < m; i++) {
            c[i] = input.nextInt();
        }
        for (int i = 0; i < m; i++) {
            d[i] = input.nextInt();
        }
        String[] output = new String[n];

//        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            int zongJia = 0;
            for (int j = 0; j <= i; j++) {
                zongJia += yuanJia[j];
            }
            int zheKouAll = 0;
            for (int j = 0; j <= i; j++) {
                zheKouAll += zhekou[j];
            }
            //使用满减
            int min = 0;
            for (int j = 0; j < m; j++) {
                if (zongJia >= c[j]) {
                    min = Math.max(min, d[j]);
                }
            }
            //执行到这一步代表可以满减
            int useZheKou = zongJia - min;
            if (useZheKou > zheKouAll) {
                output[i] = "Z";
            } else if (useZheKou < zheKouAll) {
                output[i] = "M";
            } else if(useZheKou == zheKouAll){
                output[i] = "B";

            }

        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }

    }
}
