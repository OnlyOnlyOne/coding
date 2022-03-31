package baidu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testNum = input.nextInt();
        for (int i = 0; i < testNum; i++) {
            int N = input.nextInt();
            int result = helper(N);
            System.out.println(result);
        }
    }

    public static int helper(int N) {
        int index = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i < N; i++) {
            if (N % i == 0 && N % (N / i) ==0 ) {
//                list.add(i);
//                list.add(N / i);
//                if (((N / i) % i != 0) || i == 1) {
//                    index++;
//                    for (int j = 0; j < list.size(); j++) {
//                        System.out.println(list.get(j));
//                    }
//                }
                int GCD = getGCD(i, N / i);
                if (GCD == 1) {
                    index++;
                }
//                list.remove(list.size() - 1);
//                list.remove(list.size() - 1);
            }
        }
        return index;
    }

    public static int getGCD(int A, int B) {
        int min = Math.min(A, B);
        int GCD = 1;
        for (int i = 2; i <= min; i++) {
            if (A % i == 0 && B % i == 0) {
                GCD = i;
                return GCD;
            }

        }
        return GCD;
    }
}
