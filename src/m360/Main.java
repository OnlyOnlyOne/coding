package m360;

import java.util.Scanner;

public class Main {
    static int max = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] h = new int[n];
        for(int i = 0;i < n;i++){
            h[i] = input.nextInt();
        }
        helper(h);
        System.out.println(max + 1);
    }

    public static void helper(int[] h) {
        for (int i = 0; i < h.length; i++) {
            //从左往右遍历
            int leftToRight = 0;
            for (int j = i + 1; j < h.length; j++) {
                if (h[j] < h[j - 1]) {
                    leftToRight++;
                } else {
                    break;
                }
            }
            //从右往左遍历
            int rightToLeft = 0;
            for (int j = i-1; j > 0; j--) {
                if (h[j] < h[j+1]) {
                    rightToLeft++;
                }else {
                    break;
                }
            }
            int all = leftToRight + rightToLeft;
            max = Math.max(all,max);
        }
    }
}
