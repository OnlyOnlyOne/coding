package greedy;

public class Lc135分发糖果 {
    public int candy(int[] ratings) {
        //利用两次贪心
        //1.从前往后，右边孩子大于左边孩子的情况
        if(ratings.length==1) return 1;
        int[] candy = new int[ratings.length];
        candy[0] = 1;
        for (int i = 1; i < ratings.length ; i++) {
            if (ratings[i ] > ratings[i -1]) {
                candy[i ] = candy[i - 1] + 1;
            } else {
                candy[i ] = 1;
            }
        }
        //2.从后往前，左边孩子大于右边孩子的情况
        for (int j = ratings.length - 2; j >= 0; j--) {
            if (ratings[j ] > ratings[j+1]) {
                candy[j ] = Math.max(candy[j+1] + 1,candy[j]);
            }
        }
        int count = 0;
        for (int i = 0; i < candy.length; i++) {
            count += candy[i];
        }
        return count;
    }
}
