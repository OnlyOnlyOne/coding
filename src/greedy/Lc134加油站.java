package greedy;

public class Lc134加油站 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int count = 0;
        int sum = 0;
        int index = 0;
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            count += gas[i] - cost[i];
            if (sum < 0) {
                index = i+1;
                sum = 0;
            }
        }
        if(count<0)return -1;
        return index;
    }
}
