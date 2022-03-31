package baidu;

import java.util.*;

public class Main {
    static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();

        for (int i = 1; i <= K; i++) {
            int get = i * N;
            int swapAfter = reverse(get);
            max = Math.max(max, swapAfter);
        }

        System.out.println(max);

    }

    public  static int reverse(int num) {
        List<Integer> list = new ArrayList<Integer>();
//        List<Integer> list2 = new ArrayList<Integer>();
        int get = num;
        while (get != 0) {
            int temp = get % 10;
            list.add(temp);
            get /= 10;
        }
        int l = list.size();
        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            int o = 1;
            for (int j = 0; j < l - 1; j++) {
                o *= 10;
            }
            result += list.get(i) * o;
            l--;
        }

        return result;
    }
}
