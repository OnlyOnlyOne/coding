package 复习.美团;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ball {
    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();
    static int max = 0;
    static int num = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k1 = input.nextInt();
        int k2 = input.nextInt();
        int[] ballNum = new int[n];
        for (int i = 0; i < n; i++) {
            ballNum[i] = input.nextInt();
        }
        backtracking(ballNum, k1, k2, 0, 0);
        for (int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            int all = 0;
            for (int j = 0; j < list.size(); j++) {
                all += list.get(j);
            }
            if (all == max) {
                num++;
            }
        }
        System.out.println(max + " "+ result.size()%998244353);

    }

    public static void backtracking(int[] ballNum, int k1, int k2, int index,int sum) {

        if (sum % k1 == 0 && sum % k2 == 1) {
            max = Math.max(sum, max);
            result.add(new ArrayList<>(path));
        }
        for (int i = index; i < ballNum.length; i++) {
            sum+=ballNum[i];
            path.add(ballNum[i]);
            backtracking(ballNum, k1, k2, i + 1, sum);
            sum -= ballNum[i];
            path.remove(path.size() - 1);
        }
    }
}
