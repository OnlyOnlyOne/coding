package 网易;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Demo {
    public int getMinimumTime (int[] productList, int[][] drivingTimes) {
        // write code here
        return 1;
    }


    public static int[] getTreasures (int packageSize, int wakeTime, int[][] treasureInfo) {
        // write code here
        //在wakeTime之前取得最多
        //01背包，使用动态规划
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * 求在魔王苏醒之前，可以获取到价值最高的宝物列表；
         * @param packageSize int整型 背包容量
         * @param wakeTime int整型 魔王睡醒时长
         * @param treasureInfo int整型二维数组 宝物信息数组；宝物信息数组；[[宝物id, 宝物距离, 宝物重量, 宝物价值]]
         * @return int整型一维数组
         */
        int[] dpValue = new int[packageSize + 1];
        int[] dpDis = new int[packageSize + 1];
        int[][] get = new int[packageSize + 1][packageSize + 1];
        HashMap<Integer,String> map = new HashMap();
        int[] result = new int[packageSize + 1];
        for (int i = 0; i < treasureInfo.length; i++) {
            for (int j = packageSize; j >= treasureInfo[i][2]; j--) {
//                dpValue[j] = Math.max(dpValue[j],dpValue[j-treasureInfo[i][2]] + treasureInfo[i][3]);
                if (dpDis[j] + treasureInfo[i][1] + 1 <= wakeTime) {
                    if (dpValue[j] >= (dpValue[j - treasureInfo[i][2]] + treasureInfo[i][3])) {
                        dpValue[j] = dpValue[j];
                        dpDis[j] = dpDis[j];
                    } else {
                        dpValue[j] = dpValue[j - treasureInfo[i][2]] + treasureInfo[i][3];
                        dpDis[j] = dpDis[ j - treasureInfo[i][2]] + treasureInfo[i][1] + 1;
//                        map.put(treasureInfo[i][0], map.get(treasureInfo[i][0]) + "" + treasureInfo[i][0]);
                        if (j == packageSize) {
                            result[treasureInfo[i][0]] = 1;
                        }
                    }
                }
            }
        }
//        String str = map.get(packageSize - 1);
//        String[] s = str.split("");
//        int[] result = new int[.length];
//        int nums = 0;
//        for (String c : s) {
//            result[nums++] = Integer.parseInt(c);
//        }
        System.out.println(1);
        return null;
    }

    public static void main(String[] args) {
        int[][] nums = {
                {1,2,4,3},{2,3,2,2},{3,4,1,4}
        };
        getTreasures(6, 10, nums);
        System.out.println("1");
    }

}
