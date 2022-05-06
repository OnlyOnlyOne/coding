import java.math.BigInteger;
import java.util.Scanner;

public class Demoooo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] M = new int[a];
        int[] E = new int[a];
        for (int i = 0; i < a; i++) {
            M[i] = scan.nextInt();
        }
        int max = 0;
        for (int i = 0; i < a; i++) {
            E[i] = scan.nextInt();
            max = Math.max(max,E[i]);
        }
        //敌人的最大值
        System.out.println(solution(a, M, E));

    }

    public static int solution(int n, int[] M, int[] E) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (M[i] < E[i]) {
                max = Math.max(max, E[i] - M[i] + 2);
            }
        }

        int sumA = 0;
        int sumB = 0;
        int index = 0;
        for (int j = 0; j < n; j++) {
            sumA += M[j] + min;
            sumB += E[j];
            if (sumA < sumB) {
                while (sumA < sumB) {
                    min++;
                    sumA += (j + 1);
                }
            }
        }
        return min;

    }
}
