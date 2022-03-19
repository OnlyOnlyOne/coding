package 网易;

import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalScore = 0;
        int person = 0;
        for (int i = 1; i <= 5; i++) {
            int peopleNum = input.nextInt();
            person += peopleNum;
            totalScore += i*peopleNum;
        }
        double score = totalScore / person;
        System.out.println(String.format("%.1f",score-0.05));
    }
}
