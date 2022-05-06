package 复习.网易;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        int sum = 0;
        for (int i = 0; i < s.length() -1; i++) {
            int j = i + 1;
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (isSameOrNext(left, right)) {
                sum += getScore(left, right);
                i = j;
            }

        }
        System.out.println(sum);
    }

    public static boolean isSameOrNext(char left, char right) {
        boolean isSame = left == right;
        boolean isNext = Math.abs(left - right) == 1;
        return isSame || isNext;
    }

    public static int getScore(char left, char right) {
        int scoreA = left =='a' ? 1 : left - 'a' + 1;
        int scoreB = right == 'a' ? 1 :right - 'a'+1;
        return scoreA + scoreB;
    }
}
