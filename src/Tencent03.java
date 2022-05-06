import java.util.Scanner;

public class Tencent03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));
        System.out.println("{1,5,4,7,3,10}");
    }

    public static int solution(int n, String str) {
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int a = 0,b = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(j) == '0') {
                    a += (j + 1);
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(j) == '1') {
                    b += (j + 1);
                }
            }
            result = Math.min(result, Math.abs(a - b));
        }
        int c = 0;
        for (int j = 0; j < n; j++) {
            if (str.charAt(j) == '1') {
                c += (j + 1);
            }
        }
        result = Math.min(result, c);
        return result;
    }
}
