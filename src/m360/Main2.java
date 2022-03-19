package m360;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main2 {
    static int max = 0;
    static Map<Integer,Integer> map  = new HashMap<Integer, Integer>();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        helper(n);
        System.out.println(max);

    }

    public static void helper(int n) {
        int temp = 0;
        //R
        for (int i = 1; i <= 1000&&i<=n; i++) {
            //C
            for (int j = 1; j <= 1000&&i<=n; j++) {
                //L
                for (int k = 1; k <= 1000 && k <= n; k++) {

                    if (i * j * k == n) {
                        temp = (i+2)*(k+2)*(j+1);
                        max = Math.max(max, temp - n);
                    }
                    if (i * k * j > n) {
                        break;
                    }
                }

            }
        }
    }
}
