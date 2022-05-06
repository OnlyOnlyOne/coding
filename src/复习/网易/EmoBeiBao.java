package 复习.网易;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmoBeiBao {
    static List<Integer> path = new ArrayList<Integer>();
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aXueLiang = input.nextInt();
        int bXueLiang = input.nextInt();
        int shangHaiX = input.nextInt();
        int shangHaiY = input.nextInt();
        int[] nums = {
                shangHaiX, shangHaiY
        };
        int allXueLiang = aXueLiang + bXueLiang;
        backtracking(aXueLiang, bXueLiang, allXueLiang, 0, 0, nums);
        System.out.println(min);

    }

    public static void backtracking(int aXueLiang,int bXueLiang, int allXueLiang,int cengShu, int shangHai,int[] nums) {
        if (aXueLiang<=0 && bXueLiang<=0) {
            min = Math.min(cengShu, min);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            //a 和 b怪物皆有血
            if (aXueLiang > 0 && bXueLiang > 0) {
                if (i == 0) {
                    aXueLiang -= nums[0];
                    shangHai += nums[0];
                    backtracking(aXueLiang, bXueLiang, allXueLiang, cengShu + 1, shangHai, nums);
                    shangHai -= nums[0];
                    aXueLiang += nums[0];

                    bXueLiang -= nums[0];
                    shangHai += nums[0];
                    backtracking(aXueLiang, bXueLiang, allXueLiang, cengShu + 1, shangHai, nums);
                    shangHai -= nums[0];
                    bXueLiang += nums[0];
                }

                if (i == 1) {
                    aXueLiang -= nums[1];
                    bXueLiang -= nums[1];
                    shangHai += nums[1] * 2;
                    backtracking(aXueLiang, bXueLiang, allXueLiang, cengShu + 1, shangHai, nums);
                    shangHai -= nums[1] * 2;
                    aXueLiang += nums[1];
                    bXueLiang += nums[1];
                }
            }

            if (aXueLiang <= 0) {
                if (i == 0) {
                    bXueLiang -= nums[0];
                    shangHai += nums[0];
                    backtracking(aXueLiang, bXueLiang, allXueLiang, cengShu + 1, shangHai, nums);
                    shangHai -= nums[0];
                    bXueLiang += nums[0];
                }
                if (i == 1) {
                    bXueLiang -= nums[1];
                    shangHai += nums[1];
                    backtracking(aXueLiang, bXueLiang, allXueLiang, cengShu + 1, shangHai, nums);
                    shangHai -= nums[1];
                    bXueLiang += nums[1];
                }
            }

            if (bXueLiang <= 0) {
                if (i == 0) {
                    aXueLiang -= nums[0];
                    shangHai += nums[0];
                    backtracking(aXueLiang, bXueLiang, allXueLiang, cengShu + 1, shangHai, nums);
                    shangHai -= nums[0];
                    aXueLiang += nums[0];
                }
                if (i == 1) {
                    aXueLiang -= nums[1];
                    shangHai += nums[1];
                    backtracking(aXueLiang, bXueLiang, allXueLiang, cengShu + 1, shangHai, nums);
                    shangHai -= nums[1];
                    aXueLiang += nums[1];
                }
            }


        }

    }
}
