import java.util.Scanner;

public class WZ3 {
    static int res = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        String c = input.next();
        char x = c.charAt(0);
        String s = input.next();
        backtracking(s,x,k);
        System.out.println(res);
    }

    public static void backtracking(String s, char x, int k) {
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= s.length() - i; j++) {
                int m = j + i -1;
                String str = s.substring(j, m + 1);
                if (isValue(str, k, x)) {
                    res++;
                }
            }
        }
    }

    public static boolean isValue(String s, int k,char x) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == x) count++;
        }
        if(count == k) return true;
        else return false;
    }
}
