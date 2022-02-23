package greedy;

import java.util.ArrayList;
import java.util.List;

public class Lc122买卖股票的最佳时机Ⅱ {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length<=1) return 0;
        List<Integer> temp = new ArrayList<Integer>();
        for (int i = 1; i < prices.length; i++) {
            int b = prices[i] - prices[i-1];
            temp.add(b);
        }
        for (Integer i : temp) {
            if (i >= 0) {
                profit += i;
            }
        }
        return profit;
    }
}
