package 复习.美团;

import java.util.Scanner;

public class TongBu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int file = input.nextInt();
        //游戏本上的文件被修改多少次
        int m1 = input.nextInt();
        int m2 = input.nextInt();
        int[] m1Left = new int[m1];
        for (int i = 0; i < m1; i++) {
            m1Left[i] = input.nextInt();
        }
        int[] m1Right = new int[m1];
        for (int i = 0; i < m1; i++) {
            m1Right[i] = input.nextInt();
        }
        int[] m2Left = new int[m2];

        for (int i = 0; i < m2; i++) {
            m2Left[i] = input.nextInt();
        }
        int[] m2Right = new int[m2];
        for (int i = 0; i < m2; i++) {
            m2Right[i] = input.nextInt();
        }

        int[] m1File = new int[file+1];
        for (int i = 0; i < m1; i++) {
            int left = m1Left[i];
            int right = m1Right[i];
            for (int k = left; k <= right; k++) {
                m1File[k] = 1;
            }
        }
        int[] m2File = new int[file+1];
        for (int i = 0; i < m2; i++) {
            int left = m2Left[i];
            int right = m2Right[i];
            for (int k = left; k <= right; k++) {
                m2File[k] = 1;
            }
        }
        int count = 0;
        for (int k = 1; k <= file; k++) {
            if (m1File[k] == 1 && m2File[k] == 1) {
                count++;
            }

        }
        System.out.println(count);

    }
}
