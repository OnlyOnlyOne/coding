package 网易;

import java.util.Scanner;

public class YouHuiJuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int juanNum = input.nextInt();
        int waiMaiValue = 0;
        int pay = 0;
        for (int i = 0; i < juanNum; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (x > y) {
                waiMaiValue += x;
                pay += x - y;
            } else {
                waiMaiValue += y;
            }
        }
        System.out.println(waiMaiValue + " " + pay);

    }
}
